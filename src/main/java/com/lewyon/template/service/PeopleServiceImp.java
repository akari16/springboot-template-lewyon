package com.lewyon.template.service;

import com.lewyon.template.domain.People;
import com.lewyon.template.handle.PeopleHandle;
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
    private PeopleHandle peopleHandle;

    @Override
    public List<People> getAllPeoples() {
        return peopleHandle.getAllPeople();
    }

    @Override
    public People getOnePeople(int id) {
        return peopleHandle.getPeople(id);
    }

    @Override
    public boolean updatePeople(People people) {
        return peopleHandle.updatePeople(people) > 0;
    }

    @Override
    public boolean addPeople(People people) {
        return peopleHandle.insertPeople(people.getAge(), people.getName()) >0;
    }

    @Override
    public boolean delPeople(int id) {
        return peopleHandle.deletePeople(id)>0;
    }
}
