package cn.withyyy.handtohand;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cn.withyyy.handtohand.dao")
@SpringBootApplication
public class HandtohandApplication {

    public static void main(String[] args) {
        SpringApplication.run(HandtohandApplication.class, args);
    }

}
