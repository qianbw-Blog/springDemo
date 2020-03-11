package com.qianbw.springboot_mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**

/**
 * @author Qianbw
 * @create 2020-03-10 11:54
 * @desc 会员控制层
 **/
@RequestMapping("/member")
@Controller
public class MemberController {

    @RequestMapping("/toMember")
    public String toMember(){
        return "/member/member-list";
    }

    @RequestMapping("/toMemberDel")
    public String toMemberDel(){
        return "/member/member-del";
    }
}
