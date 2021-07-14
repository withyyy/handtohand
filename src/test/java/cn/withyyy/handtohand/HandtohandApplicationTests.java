package cn.withyyy.handtohand;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.json.JSON;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import cn.withyyy.handtohand.entity.User;
import cn.withyyy.handtohand.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;


@RunWith(SpringRunner.class)
@Slf4j
@SpringBootTest
class HandtohandApplicationTests {
    private User user = new User();

    @Resource
    UserService userService;
    @Test
    void contextLoads() {
        String s = "1414 49521 49655 38818";
        log.info(String.valueOf(s.length()));
    }

}
