package com.lewyon.template.mapper;

import com.lewyon.template.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @param
 * @author Liuyuan
 * @return Result
 * @explain 查询对象
 * @aate 2021/10/9
 */

@Mapper
public interface UserMapper {

    /***
     * 查询数据表中的所有记录
     * @return
     */
    List<User> getAllUser();

    /***
     * 查询数据表中的某一条记录
     * @return
     */
    User getUser(@Param("id") int id);

    /***
     * 插入一条数据
     * @return
     */
    int insertUser(User user);


    /***
     * 更新一条记录
     * @param user 准备更新进去的数据
     * @return
     */

    int updateUser(User user);

    /***
     * 删除某条记录（@Delete）
     * @param id 根据ID去删除一条记录
     * @return
     */
    int deleteUser(@Param("id") int id);

}

