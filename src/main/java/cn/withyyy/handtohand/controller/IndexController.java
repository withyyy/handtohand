package cn.withyyy.handtohand.controller;

import cn.hutool.json.JSONUtil;
import cn.withyyy.handtohand.dao.UserMapper;
import cn.withyyy.handtohand.entity.Data;
import cn.withyyy.handtohand.entity.Meta;
import cn.withyyy.handtohand.entity.Result;
import cn.withyyy.handtohand.entity.User;
import cn.withyyy.handtohand.service.CategoryService;
import cn.withyyy.handtohand.service.GoodService;
import cn.withyyy.handtohand.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@SessionAttributes("loginUser")
@Slf4j
@Controller
public class IndexController {

    @Resource
    UserMapper userMapper;
    @Resource
    UserService userService;
    @Resource
    GoodService goodService;
    @Resource
    CategoryService categoryService;

    /**
     * 目前没有太大用处，专门用来跳转到街道
     *
     * 跳转地址：
     *      /street
     * @return 跳转到/street
     */
    @GetMapping("/")
    public String index(){
        return "redirect:/street";
    }

    /**
     * 跳转到登录页
     * @return 跳转到登录页
     */
    @GetMapping("/login")
    public String goLogin(){
        return "login";
    }


    /**
     * 跳转到注册页
     * @return 跳转到注册页
     */
    @GetMapping("/register")
    public String goRegister(){
        return "/register";
    }

    /**
     * 跳转到家
     * @return 跳转到家
     */
    @GetMapping("/home")
    public String goHome(){
        return "/home/home";
    }

    /**
     * 街道。街道是万物聚集的场所。
     * 需求：
     *  页面加载完毕，必须向后端发送分页请求，后端将返回分页相关数据。
     *      请求参数：
     *          current：    第几页
     *          size：       页大小
     *      返回值：
     *          （（））
     *
     * 访问：所有访问者都可以进入街道。且网站的首要入口是街道。
     *
     * 内容：街道将展现所有商品。点击商品可以查看详情。
     *

     *
     * 跳转方式：
     *  1.点击购买，跳转到登陆
     *  2.点击登陆，跳转到登陆
     *  3.点击注册，跳转到注册
     *
     * 跳转链接：
     *  1.登录： /login
     *  2.注册： /register
     * @param model
     * @return 跳转到街道
     */
    @GetMapping("/street")
    public String goStreet(Model model){
        return "/street/street";
    }


    @GetMapping("/test")
    public String test(Model model){
/*        User user = new User();
        user.setUsername("yanning001");
        model.addAttribute("user",userService.getOne(new QueryWrapper<User>(user)));*/
        return "index";
    }

    @PostMapping("/test")
    public String test(){
        return "index";
    }

    /**
     * 登录判断。用传来的参数user作为判断条件，如果存在，则登录成功跳转到街道，并且给session添加查询到的selectOne。
     * 如果不存在，登录失败，并且返回首页。
     * @param user  用以判断的对象
     * @param model
     * @param session
     * @return
     */
    @ResponseBody
    @PostMapping("/login")
    public String login(@RequestBody User user, Model model, HttpSession session){
        log.info("提交的user对象：" + user );
        if (user.getUsername()!=null &&user.getPassword() != null) {
            QueryWrapper<User> queryWrapper = new QueryWrapper<>(user);
            Integer integer = userMapper.selectCount(queryWrapper);
            User selectOne = userService.getOne(queryWrapper);
            log.info("查询出来的user对象： " + selectOne);
            if (null != selectOne) {
                session.setAttribute("loginUser", selectOne);
                Result result = new Result();
                Data data = new Data();
                data.setToken("im123yanning");
                Meta m = new Meta();
                m.setStatus(200);
                result.setData(data);
//                result.setData(null);
                result.setMeta(m);
                String res = JSONUtil.toJsonStr(result);
                model.addAttribute("loginUser",selectOne);
                return res;
            } else {
                model.addAttribute("msg", "用户名或密码错误");
                return "login";
            }
        }
        else {
            return "login";
        }
    }

    /**
     * 注册方法。
     * @param user
     * @param model
     * @param session
     * @return
     */
    @PostMapping("/register")
    public String register(User user,Model model,HttpSession session){
        log.info("注册传入的User:" + user);
        Integer selectCount = userMapper.selectCount(new QueryWrapper<User>(user));
        if (selectCount < 1){
            userService.save(user);
            log.info("注册以后的User:" + user);
            session.setAttribute("loginUser",user);
            return "redirect:/street";
        } else {
            model.addAttribute("msg","用户名已被占用");
            return "/register";
        }
    }
}
