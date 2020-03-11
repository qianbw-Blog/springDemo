package com.qianbw.springboot_mybatis.data;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Qianbw
 * @create 2020-03-09 14:18
 * @desc ${DESCRIPTION}
 **/
@Getter
public enum Code {

    SUCCESS(0,"success"),

    //不正确信息
    ERROR(200,"error"),


    LOGIN_FAIL(400,"login fail");

    private int code;

    private String msg;

    private Code(int code,String msg){
        this.code = code;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Code:"+code+",msg:"+msg;
    }
}
