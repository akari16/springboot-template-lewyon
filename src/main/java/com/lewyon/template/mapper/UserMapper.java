package com.lewyon.template.mapper;

import com.lewyon.template.entity.User;
import org.apache.ibatis.annotations.*;

/**
 * @param
 * @author Liuyuan
 * @return Result
 * @explain 查询对象
 * @aate 2021/9/29
 */
public interface UserMapper {
    User findByName(@Param(value = "name") String name);

    int insert(@Param("name") String name, @Param("age") Integer age);
}
