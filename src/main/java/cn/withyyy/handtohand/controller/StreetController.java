package cn.withyyy.handtohand.controller;

import cn.withyyy.handtohand.entity.Good;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StreetController {


    @PostMapping
    public String listGood(Model model, Page<Good> page){


        return null;
    }
}
