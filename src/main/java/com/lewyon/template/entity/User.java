package com.lewyon.template.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @param
 * @author Liuyuan
 * @return Result
 * @explain 用户实体类
 * @aate 2021/10/9
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description="用户实体")
public class User {

    @ApiModelProperty("用户编号")
    private int id;

    @ApiModelProperty("用户名称")
    private String name;

    @ApiModelProperty("用户年龄")
    private String age;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAge(){
        return age;
    }

    public void setAge(String age){
        this.age = age;
    }


    public void User() {

    }

    public void User(int id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

}
