package cn.withyyy.handtohand.entity;

import lombok.Data;

@Data
public class User {
    private String id;
    private String username;
    private String password;
    private String email;
    private Long phone;
    private String addr;
}
