package cn.withyyy.handtohand;

import cn.hutool.json.JSONUtil;
import cn.withyyy.handtohand.entity.*;
import cn.withyyy.handtohand.service.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


@RunWith(SpringRunner.class)
@Slf4j
@SpringBootTest
class HandtohandApplicationTests {
    private User user = new User();

    @Resource
    UserService userService;
    @Resource
    GoodService goodService;
    @Resource
    CartService cartService;
    @Resource
    CartDetailService cartDetailService;
    @Resource
    CategoryService categoryService;
    @Resource
    OrderMainService orderService;
    @Resource
    OrderDetailService orderDetailService;

    @Test
    void contextLoads() {
/*        User byId = userService.getById("1414122682768871426");
        Good byId1 = goodService.getById("1414122682768871420");
        Cart byId2 = cartService.getById("1414122682768871427");
        CartDetail byId3 = cartDetailService.getById("1414122682768871420");
        Category byId4 = categoryService.getById("1414122682768871421");
        OrderMain byId5 = orderService.getById("1414122682768871422");
        OrderDetail byId6 = orderDetailService.getById("1414122682768871420");
        System.out.println(byId);
        System.out.println(byId1);
        System.out.println(byId2);
        System.out.println(byId3);
        System.out.println(byId4);
        System.out.println(byId5);
        System.out.println(byId6);*/
        Result result = new Result();
        Meta m = new Meta();
        m.setStatus(200);
        result.setData(null);
        result.setMeta(m);
        String res = JSONUtil.toJsonStr(result);
        System.out.println(res);
    }

}
