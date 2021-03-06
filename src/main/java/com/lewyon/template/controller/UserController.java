package com.lewyon.template.controller;

import com.lewyon.template.entity.User;
import com.lewyon.template.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Api(tags = "用户管理")
@RestController
@RequestMapping(value = "/user")     // 通过这里配置使下面的映射都在/users下
public class UserController {

    // 创建线程安全的Map，模拟users信息的存储
    @Autowired
    private UserService userService;

    @ApiOperation(value = "查询所有用户")
    @GetMapping(value = "/allUser")
    public List<User> getAllUser() {
        List<User> users = userService.getAllUser();
        return users;
    }
//
//    /**
//     * 处理"/users/"的POST请求，用来创建User
//     *
//     * @param user
//     * @return
//     */
//    @PostMapping("/")
//    @ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
//    public String postUser(@RequestBody User user) {
//        // @RequestBody注解用来绑定通过http请求中application/json类型上传的数据
//        users.put(user.getId(), user);
//        return "success";
//    }
//
//    /**
//     * 处理"/users/{id}"的GET请求，用来获取url中id值的User信息
//     *
//     * @param id
//     * @return
//     */
//    @GetMapping("/{id}")
//    @ApiOperation(value = "获取用户详细信息", notes = "根据url的id来获取用户详细信息")
//    public User getUser(@PathVariable Long id) {
//        // url中的id可通过@PathVariable绑定到函数的参数中
//        return users.get(id);
//    }
//
//    /**
//     * 处理"/users/{id}"的PUT请求，用来更新User信息
//     *
//     * @param id
//     * @param user
//     * @return
//     */
//    @PutMapping("/{id}")
//    @ApiImplicitParam(paramType = "path", dataType = "Long", name = "id", value = "用户编号", required = true, example = "1")
//    @ApiOperation(value = "更新用户详细信息", notes = "根据url的id来指定更新对象，并根据传过来的user信息来更新用户详细信息")
//    public String putUser(@PathVariable Long id, @RequestBody User user) {
//        User u = users.get(id);
//        u.setName(user.getName());
//        u.setAge(user.getAge());
//        users.put(id, u);
//        return "success";
//    }
//
//    /**
//     * 处理"/users/{id}"的DELETE请求，用来删除User
//     *
//     * @param id
//     * @return
//     */
//    @DeleteMapping("/{id}")
//    @ApiOperation(value = "删除用户", notes = "根据url的id来指定删除对象")
//    public String deleteUser(@PathVariable Long id) {
//        users.remove(id);
//        return "success";
//    }



    //使用另外一个路径处理user相关接口

//
//    private UserService userService;
//
//    @GetMapping("/getUser")
//    @ApiOperation(value = "获取用户列表")
//    public List<User> getAllUser() {
//        List<User> users = userService.getAllUser();
//        return users;
//    }




}



