package com.qianbw.springboot_mybatis.controller;

import com.github.pagehelper.PageHelper;
import com.qianbw.springboot_mybatis.data.Code;
import com.qianbw.springboot_mybatis.data.Message;
import com.qianbw.springboot_mybatis.data.Result;
import com.qianbw.springboot_mybatis.model.User;
import com.qianbw.springboot_mybatis.service.UserService;
import com.qianbw.springboot_mybatis.util.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**

/**
 * @author Qianbw
 * @create 2020-03-07 18:58
 * @desc 用户控制层
 **/
@RequestMapping("/user")
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/insert")
    public Message insert(User user){

        Result result = userService.insert(user);
        if (result instanceof Result.Success){
            return new Message(true,Code.SUCCESS,1,true);
        }else if(result instanceof Result.Fail)
        {
            Message message=new Message(false,((Result.Fail) result).getReason(),0,null);
            System.out.println(message.toString());
            return message;
        }
        else
        {
            Message message=new Message(false,Code.ERROR,0,null);
            System.out.println(message.toString());
            return message;
        }

    }

    @ResponseBody
    @RequestMapping("/selectAll")
    public Message selectAll(User user){
        Result result = userService.selectAll(user);
        if (result instanceof Result.Success){
            return new Message(true,Code.SUCCESS,((Result.Success) result).getCount(),((Result.Success) result).getData());
        }else if(result instanceof Result.Fail)
        {
            Message message=new Message(false,((Result.Fail) result).getReason(),0,null);
            System.out.println(message.toString());
            return message;
        }
        else
        {
            Message message=new Message(false,Code.ERROR,0,null);
            System.out.println(message.toString());
            return message;
        }
    }

    @ResponseBody
    @RequestMapping("/selectByPrimaryKey")
    public Message selectByPrimaryKey(User user){
        Result result = userService.selectByPrimaryKey(user.getId());
        if (result instanceof Result.Success){
            return new Message(true,Code.SUCCESS,1,((Result.Success) result).getData());
        }else if(result instanceof Result.Fail)
        {
            Message message=new Message(false,((Result.Fail) result).getReason(),0,null);
            System.out.println(message.toString());
            return message;
        }
        else
        {
            Message message=new Message(false,Code.ERROR,0,null);
            System.out.println(message.toString());
            return message;
        }
    }

    @ResponseBody
    @RequestMapping("/deleteByPrimaryKey")
    public Message deleteByPrimaryKey(User user){
        Result result = userService.deleteByPrimaryKey(user.getId());
        if (result instanceof Result.Success){
            return new Message(true,Code.SUCCESS,1,true);
        }else if(result instanceof Result.Fail)
        {
            Message message=new Message(false,((Result.Fail) result).getReason(),0,null);
            System.out.println(message.toString());
            return message;
        }
        else
        {
            Message message=new Message(false,Code.ERROR,0,null);
            System.out.println(message.toString());
            return message;
        }
    }

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "/login";
    }

    @ResponseBody
    @RequestMapping("/login")
    public Message login(User user){
        Result result = userService.userLogin(user);
        if (result instanceof Result.Success){
            return new Message(true,Code.SUCCESS,1,true);
        }else if(result instanceof Result.Fail)
        {
            Message message=new Message(false,((Result.Fail) result).getReason(),0,null);
            System.out.println(message.toString());
            return message;
        }
        else
        {
            Message message=new Message(false,Code.ERROR,0,null);
            System.out.println(message.toString());
            return message;
        }
    }

    @RequestMapping("/inputExcel")
    @ResponseBody
    public Message InputExcel(MultipartFile file, HttpServletRequest request) {
        Result result = userService.insertByExcel(file);
        if (result instanceof Result.Success){
            return new Message(true,Code.SUCCESS,1,true);
        }else if(result instanceof Result.Fail)
        {
            Message message=new Message(false,((Result.Fail) result).getReason(),0,null);
            System.out.println(message.toString());
            return message;
        }
        else
        {
            Message message=new Message(false,Code.ERROR,0,null);
            System.out.println(message.toString());
            return message;
        }
    }
}
