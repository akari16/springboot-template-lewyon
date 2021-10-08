package com.lewyon.template.dao;

import com.lewyon.template.entity.User;

import java.util.List;

/**
 * @param id ：id
 * @author Liuyuan
 * @return Result
 * @explain 查询对象
 * @aate 2021/10/8
 */
public interface UserDao {
    List<User> getAllUser();

    User findByName(String name);
}
