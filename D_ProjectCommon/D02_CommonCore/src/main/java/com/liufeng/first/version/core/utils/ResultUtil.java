package com.liufeng.first.version.core.utils;

import com.liufeng.first.version.core.constants.StringConstant;
import com.liufeng.first.version.core.enums.ResultCodeEnum;
import com.liufeng.first.version.core.exceptions.ErrorType;
import com.liufeng.first.version.core.exceptions.SystemErrorType;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author: HB
 * @dateTime: 2022/8/26 11:23
 * @WeChatAccount: Java技术与生活
 * @description: 返回数据结果
 */
public final class ResultUtil<T> implements Serializable {

    public static final int SUCCESSFUL_CODE = 1;
    public static final String SUCCESSFUL_MESSAGE = "success";

    @ApiModelProperty(value = "状态码")
    private int code;

    @ApiModelProperty(value = "提示信息")
    private String message;

    @ApiModelProperty(value = "返回数据")
    private T data;

    public ResultUtil() {
    }

    private ResultUtil(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ResultUtil(ErrorType errorType) {
        this.code = errorType.getCode();
        this.message = errorType.getMessage() + StringConstant.LEFT_BRACKET + errorType.getCode() + StringConstant.RIGHT_BRACKET;
    }

    public ResultUtil(ErrorType errorType, T data) {
        this(errorType);
        this.data = data;
    }

    /**
     * @return
     */
    public static ResultUtil success() {
        return success(null);
    }

    /**
     * 默认返回成功信息
     *
     * @param data 数据对象
     * @return 返回成功的结果信息
     */
    public static ResultUtil success(Object data) {
        return new ResultUtil<>(ResultCodeEnum.SUCCESS.getCode(), ResultCodeEnum.SUCCESS.getDesc(), data);
    }

    /**
     * 返回指定的状态码，数据对象
     *
     * @param data 数据对象
     * @param successCode 指定的
     * @return
     */
    public static ResultUtil success(Object data, int successCode) {
        return new ResultUtil<>(successCode, SUCCESSFUL_MESSAGE, data);
    }

    public static ResultUtil failure() {
        return success(SystemErrorType.SYSTEM_ERROR);
    }

    /**
     * 默认返回失败信息
     *
     * @param data 数据对象
     * @return 返回失败的结果信息
     */
    public static ResultUtil failure(Object data) {
        return new ResultUtil<>(ResultCodeEnum.FAILURE.getCode(), ResultCodeEnum.FAILURE.getDesc(), data);
    }

    public static ResultUtil failure(Object data, int successCode) {
        return new ResultUtil<>(successCode, SUCCESSFUL_MESSAGE, data);
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public T getData() {
        return this.data;
    }

}
