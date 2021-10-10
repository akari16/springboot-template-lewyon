package com.lewyon.template.entity;

/**
 * @param id ：id
 * @author Liuyuan
 * @return Result
 * @explain 查询对象
 * @aate 2021/10/10
 */
/**
 * @param
 * @author Liuyuan
 * @return Result
 * @explain 查询对象
 * @aate 2021/10/9
 */
public class People {
    private int id;
    private Integer name;
    private String age;

    public int getId(){

        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public Integer getName(){

        return name;
    }

    public void setName(int name){

        this.name = name;
    }

    public String getAge(){

        return age;
    }

    public void setAge(String age){
        this.age = age;
    }


    public void People() {

    }

    public void People(int id, Integer name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

}
