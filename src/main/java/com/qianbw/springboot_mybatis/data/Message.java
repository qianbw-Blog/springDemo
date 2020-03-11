package com.qianbw.springboot_mybatis.data;

import lombok.Getter;
import lombok.Setter;

/**

/**
 * @author Qianbw
 * @create 2020-03-09 14:07
 * @desc 消息
 **/
public class Message<T> {

    @Getter
    @Setter
    private  boolean success;

    @Getter
    private int code;

    @Getter
    @Setter
    private String msg;

    @Getter
    private long count;

    @Getter
    @Setter
    private T data;

    public Message(boolean success,Code code,long count,T data){
        this.success = success;
        this.code = code.getCode();
        this.count = count;
        this.data = data;
    }
}
