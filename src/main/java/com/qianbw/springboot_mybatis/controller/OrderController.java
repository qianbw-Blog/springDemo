package com.qianbw.springboot_mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**

/**
 * @author Qianbw
 * @create 2020-03-10 12:01
 * @desc 订单控制层
 **/
@RequestMapping("/order")
@Controller
public class OrderController {

    @RequestMapping("/toOrder")
    public String toOrder(){
        return "/order/order-list";
    }

    @RequestMapping("/toOrder1")
    public String toOrder1(){
        return "/order/order-list1";
    }
}
