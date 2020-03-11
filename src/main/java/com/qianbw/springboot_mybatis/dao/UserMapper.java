package com.qianbw.springboot_mybatis.dao;

import com.qianbw.springboot_mybatis.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface UserMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);

    User userLogin(@Param("username") String username, @Param("password")String password);

    int insertByExcel(List<User> userList);
}