package com.qianbw.springboot_mybatis.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qianbw.springboot_mybatis.dao.UserMapper;
import com.qianbw.springboot_mybatis.data.Code;
import com.qianbw.springboot_mybatis.data.Result;
import com.qianbw.springboot_mybatis.model.User;
import com.qianbw.springboot_mybatis.service.UserService;
import com.qianbw.springboot_mybatis.util.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;


/**
 * @author Qianbw
 * @create 2020-03-07 19:01
 * @desc
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Result deleteByPrimaryKey(Integer id) {
        userMapper.deleteByPrimaryKey(id);
        return new Result.Success(true,0);
    }

    @Override
    public Result insert(User record) {
        userMapper.insert(record);
        return new Result.Success(true,0);
    }

    @Override
    public Result selectByPrimaryKey(Integer id) {
        User user = userMapper.selectByPrimaryKey(id);
        return new Result.Success(user,1);
    }

    @Override
    public Result selectAll(User user) {
        PageHelper.startPage(user.getPage(),user.getLimit());
        List<User> userList = userMapper.selectAll();
        PageInfo<User> pageInfo = new PageInfo<>(userList);
        return new Result.Success(userList,pageInfo.getTotal());
    }

    @Override
    public Result userLogin(User user) {
        User res = userMapper.userLogin(user.getUsername(),user.getPassword());
        if (res != null){
            return new Result.Success(res,1);
        }else {
            return new Result.Fail(Code.LOGIN_FAIL);
        }

    }

    @Override
    public Result insertByExcel(MultipartFile file) {
        List<List<Object>> test = null;
        List<User> userList = new ArrayList<>();
        try {
            test = ExcelUtil.importExcel(file, 0);
            for(int i = 0; i < test.size(); i++){
                User user = new User();
                user.setUsername((String) test.get(i).get(0));
                user.setPassword((String)test.get(i).get(1));
                user.setGender((String) test.get(i).get(2));
                user.setName((String)test.get(i).get(3));
                userList.add(user);
            }
            userMapper.insertByExcel(userList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  new Result.Success(true,0);
    }
}
