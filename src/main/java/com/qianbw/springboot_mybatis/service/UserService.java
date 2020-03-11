package com.qianbw.springboot_mybatis.service;

import com.qianbw.springboot_mybatis.data.Result;
import com.qianbw.springboot_mybatis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**

/**
 * @author Qianbw
 * @create 2020-03-07 19:00
 * @desc 用户业务逻辑层
 **/
public interface UserService {

    Result deleteByPrimaryKey(Integer id);

    Result insert(User record);

    Result selectByPrimaryKey(Integer id);

    Result selectAll(User user);

    Result userLogin(User user);

    Result insertByExcel(MultipartFile file);
}
