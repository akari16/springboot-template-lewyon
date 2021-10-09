package com.lewyon.template.handle;

import com.lewyon.template.domain.People;
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
public interface PeopleHandle {

    /***
     * 查询数据表中的所有记录
     * 对应SQL：select * from people
     * @return
     */
    @Select("SELECT * FROM PEOPLE")
    List<People> getAllPeople();

    /***
     * 查询数据表中的某一条记录
     * @param id 查询的id
     * @return
     */
    @Select("SELECT * FROM PEOPLE where ID = #{id}")
    People getPeople(@Param("id") int id);

    /***
     * 插入一条数据
     * @param name 姓名
     * @param age  年龄
     * @param
     * @return
     */
    @Insert("INSERT INTO PEOPLE(NAME,AGE) VALUES(#{name},#{age}")
    int insertPeople(@Param("name") String name, @Param("age") int age);


    /***
     * 更新一条记录（@UpdateProvider）
     * @param people 准备更新进去的数据
     * @return
     */

    @Update("INSERT INTO PEOPLE(NAME,AGE) VALUES(#{name},#{age}")
    int updatePeople(People people);

    /***
     * 删除某条记录（@Delete）
     * @param id 根据ID去删除一条记录
     * @return
     */
    @Delete("DELETE FROM PEOPLE WHERE ID = #{id}")
    int deletePeople(@Param("id") int id);

}

