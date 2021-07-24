package cn.withyyy.handtohand.entity;

import lombok.Data;

@Data
public class User {
    //用户id
    private String id;
    //用户名
    private String username;
    //密码
    private String password;
    //真实姓名
    private String name;
    //电子邮箱
    private String email;
    //联系电话
    private Long phone;
    //联系地址
    private String addr;
    //是否为管理员
    private Boolean isSuper;
}
