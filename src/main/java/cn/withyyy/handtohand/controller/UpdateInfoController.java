package cn.withyyy.handtohand.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UpdateInfoController {

    @ResponseBody
    @PostMapping("/updateUserInfo")
    public String updateUserInfo(){

        return "";
    }
}
