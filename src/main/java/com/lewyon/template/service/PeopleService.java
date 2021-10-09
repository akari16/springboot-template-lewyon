package com.lewyon.template.service;

import com.lewyon.template.domain.People;

import java.util.List;

/**
 * @param id ：id
 * @author Liuyuan
 * @return Result
 * @explain 查询对象
 * @aate 2021/10/9
 */
public interface PeopleService {
    //获取所有的数据
    List<People> getAllPeoples();

    //获取某一条记录
    People getOnePeople(int id);

    //更新一条记录
    boolean updatePeople(People people);

    //新增一条记录
    boolean addPeople(People people);

    //删除一条记录
    boolean delPeople(int id);


}
