package com.lewyon.template.service.impl;

import com.lewyon.template.entity.People;
import com.lewyon.template.mapper.PeopleMapper;
import com.lewyon.template.service.PeopleService;
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
public class PeopleServiceImp implements PeopleService {

    //导入
    @Autowired
    private PeopleMapper peopleMapper;

    @Override
    public List<People> getAllPeoples() {
        return peopleMapper.getAllPeople();
    }

    @Override
    public People getOnePeople(int id) {
        return peopleMapper.getPeople(id);
    }

    @Override
    public boolean updatePeople(People people) {
        return peopleMapper.updatePeople(people) > 0;
    }

    @Override
    public boolean addPeople(People people) {
        return peopleMapper.insertPeople(people.getAge(), people.getName()) >0;
    }

    @Override
    public boolean delPeople(int id) {
        return peopleMapper.deletePeople(id)>0;
    }
}
