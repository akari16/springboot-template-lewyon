package com.lewyon.template.service.impl;

import com.lewyon.template.entity.User;
import com.lewyon.template.mapper.UserMapper;
import com.lewyon.template.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @param
 * @author Liuyuan
 * @return Result
 * @explain 查询对象
 * @aate 2021/10/9
 */
@Service
public class UserServiceImp implements UserService {

    //导入
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public User getOneUser(int id) {
        return userMapper.getUser(id);
    }

    @Override
    public boolean updateUser(User user) {
        return userMapper.updateUser(user) > 0;
    }

    @Override
    public boolean addUser(User user) {
        return userMapper.insertUser(user) >0;
    }

    @Override
    public boolean delUser(int id) {
        return userMapper.deleteUser(id)>0;
    }
}
