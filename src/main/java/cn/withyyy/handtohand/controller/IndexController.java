package cn.withyyy.handtohand.controller;

import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import cn.withyyy.handtohand.dao.UserMapper;
import cn.withyyy.handtohand.entity.User;
import cn.withyyy.handtohand.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Slf4j
@Controller
public class IndexController {

    @Resource
    UserMapper userMapper;
    @Resource
    UserService userService;


    //以下控制器皆用来跳转到页面
    @GetMapping({"/","/login"})
    public String goIndex(){
        return "index";
    }
    @GetMapping("/register")
    public String goRegister(){
        return "/register";
    }
    @GetMapping("/home")
    public String goHome(){
        return "/home";
    }
    @GetMapping("/street")
    public String goStreet(){
        return "/street";
    }


    @GetMapping("/test")
    public String test(Model model){
        User user = new User();
        user.setUsername("yanning001");
        model.addAttribute("user",userService.getOne(new QueryWrapper<User>(user)));
        return "test";
    }

    @ResponseBody
    @PostMapping("/test")
    public String test(){
        User user = new User();
        user.setUsername("yanning001");

        return JSONUtil.toJsonStr(userService.getOne(new QueryWrapper<User>(user)));
    }

    /**
     * 登录判断。用传来的参数user作为判断条件，如果存在，则登录成功跳转到街道，并且给session添加查询到的selectOne。
     * 如果不存在，登录失败，并且返回首页。
     * @param user  用以判断的对象
     * @param model
     * @param session
     * @return
     */
    @PostMapping("/login")
    public String login(User user, Model model, HttpSession session){
        log.info("提交的user对象：" + user );
        QueryWrapper<User> queryWrapper = new QueryWrapper<>(user);
        Integer integer = userMapper.selectCount(queryWrapper);
        User selectOne = userService.getOne(queryWrapper);
        log.info("查询出来的user对象： " + selectOne);
        if (null != selectOne){
            session.setAttribute("loginUser",selectOne);
            return "redirect:/street";
        }
        else{
            model.addAttribute("msg","用户名或密码错误");
            return "/index";
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
