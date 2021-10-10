package com.lewyon.template.mapper;

import com.lewyon.template.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @param
 * @author Liuyuan
 * @return Result
 * @explain 查询对象
 * @aate 2021/9/29
 */
public interface UserMapper {

    List<User> getAllUser();

    User findByName(@Param(value = "name") String name);

    int insert(@Param("name") String name, @Param("age") Integer age);

//    int delete(@Param("name") String name, @Param("age") Integer age);
}
