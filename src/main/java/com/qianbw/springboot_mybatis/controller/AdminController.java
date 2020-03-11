package com.qianbw.springboot_mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**

/**
 * @author Qianbw
 * @create 2020-03-10 12:15
 * @desc 管理员控制层
 **/
@RequestMapping("/admin")
@Controller
public class AdminController {

    @RequestMapping("/toAdmin")
    public String toAdmin(){
        return "/admin/admin-list";
    }

    @RequestMapping("/toRole")
    public String toRole(){
        return "/admin/admin-role";
    }

    @RequestMapping("/toCate")
    public String toCate(){
        return "/admin/admin-cate";
    }

    @RequestMapping("/toRule")
    public String toRule(){
        return "/admin/admin-rule";
    }
}
