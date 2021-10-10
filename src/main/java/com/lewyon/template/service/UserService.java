package com.lewyon.template.service;

import com.lewyon.template.entity.User;


import java.util.List;

/**
 * @param
 * @author Liuyuan
 * @return Result
 * @explain 查询对象
 * @aate 2021/10/9
 */
public interface UserService {
    //获取所有的数据
    List<User> getAllUser();

    //获取某一条记录
    User getOneUser(int id);

    //更新一条记录
    boolean updateUser(User user);

    //新增一条记录
    boolean addUser(User user);

    //删除一条记录
    boolean delUser(int id);


}
