package com.qianbw.springboot_mybatis.model;

import java.io.Serializable;

/**
 * 功能描述: 用户实体类
 * @Author: Qianbw
 * @Date: 2020/3/7 18:57
 */
public class User extends CommonModel implements Serializable {
    private Integer id;

    private String username;

    private String password;

    private String gender;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}