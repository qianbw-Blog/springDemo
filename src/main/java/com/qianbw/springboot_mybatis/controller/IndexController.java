package com.qianbw.springboot_mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**

/**
 * @author Qianbw
 * @create 2020-03-09 14:32
 * @desc
 **/
@RequestMapping("/")
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "/index";
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "/welcome";
    }

    @RequestMapping("/welcome1")
    public String welcome1(){
        return "/welcome1";
    }

    @RequestMapping("/toExcel")
    public String toExcel(){
        return "/Excel";
    }

    @RequestMapping("/toCate")
    public String toCate(){
        return "/cate";
    }

    @RequestMapping("/toCity")
    public String toCity(){
        return "/city";
    }

    @RequestMapping("/echarts1")
    public String echarts1(){
        return "/echarts/echarts1";
    }

    @RequestMapping("/echarts2")
    public String echarts2(){
        return "/echarts/echarts2";
    }

    @RequestMapping("/echarts3")
    public String echarts3(){
        return "/echarts/echarts3";
    }

    @RequestMapping("/echarts4")
    public String echarts4(){
        return "/echarts/echarts4";
    }

    @RequestMapping("/echarts5")
    public String echarts5(){
        return "/echarts/echarts5";
    }

    @RequestMapping("/echarts6")
    public String echarts6(){
        return "/echarts/echarts6";
    }

    @RequestMapping("/echarts7")
    public String echarts7(){
        return "/echarts/echarts7";
    }

    @RequestMapping("/echarts8")
    public String echarts8(){
        return "/echarts/echarts8";
    }

    @RequestMapping("/unicode")
    public String unicode(){
        return "/unicode";
    }
}
