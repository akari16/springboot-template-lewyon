//package com.lewyon.template.controller;
//
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
//import lombok.Data;
//
//import java.io.Serializable;
//
///**
// * @param id ：id
// * @author Liuyuan
// * @return Result
// * @explain 查询对象
// * @aate 2021/10/9
// */
//@Data
//@ApiModel(value = "接口返回结果")
//public class ApiResult<T> implements Serializable {
//
//    private static final long serialVersionUID = -2953545018812382877L;
//
//    /**
//     * 返回码，200 正常
//     */
//    @ApiModelProperty(value = "返回码，200 正常", name = "code")
//    private int code = 200;
//
//    /**
//     * 返回信息
//     */
//    @ApiModelProperty(value = "返回信息", name = "msg")
//    private String msg = "成功";
//
//    /**
//     * 返回数据
//     */
//    @ApiModelProperty(value = "返回数据对象", name = "data")
//    private T data;
//
//    /**
//     * 获取成功状态结果
//     *
//     * @param data 返回数据
//     * @return
//     */
//    public static ApiResult success(Object data) {
//        return success(data, null);
//    }
//
//
//    /**
//     * 获取失败状态结果
//     *
//     * @param msg (自定义)失败消息
//     * @return
//     */
//    public static ApiResult failure(String msg) {
//        return failure(ResponseCode.FAIL.getCode(), msg, null);
//    }
//}
