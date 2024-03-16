package com.liufeng.first.version.util;

import com.liufeng.first.version.constants.StringConstant;
import com.liufeng.first.version.enums.ResultCodeEnum;
import com.liufeng.first.version.exceptions.BaseException;
import com.liufeng.first.version.exceptions.ErrorType;
import com.liufeng.first.version.exceptions.SystemErrorType;
import com.liufeng.first.version.vo.ResultStatusVO;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author: HB
 * @dateTime: 2022/8/26 11:23
 * @WeChatAccount: Java技术与生活
 * @description: 返回数据结果
 */
public final class ResultUtil<T> extends ResultStatusVO implements Serializable {

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
     * @param <T> 类型对象
     * @return 结果成功时，内容数据为空
     */
    public static <T> ResultUtil<T> success() {
        return success(null);
    }

    /**
     * 返回默认的成功信息
     *
     * @param data 数据对象
     * @return 返回成功结果信息
     */
    public static <T> ResultUtil<T> success(T data) {
        return new ResultUtil<>(ResultCodeEnum.SUCCESS.getCode(), ResultCodeEnum.SUCCESS.getDesc(), data);
    }

    /**
     * 返回指定的状态码，成功提示信息，数据对象
     *
     * @param successCode 指定的成功状态码
     * @param data        数据对象
     * @return 成功结果
     */
    public static <T> ResultUtil<T> success(int successCode, T data) {
        return new ResultUtil<>(successCode, ResultCodeEnum.SUCCESS.getDesc(), data);
    }

    /**
     * 返回成功状态码，指定的成功提示信息，数据对象
     *
     * @param successMsg 指定的成功提示信息
     * @param data       数据对象
     * @return 成功结果
     */
    public static <T> ResultUtil<T> success(String successMsg, T data) {
        return new ResultUtil<>(ResultCodeEnum.SUCCESS.getCode(), successMsg, data);
    }

    public static <T> ResultUtil<T> failure() {
        return new ResultUtil<>(SystemErrorType.SYSTEM_ERROR);
    }

    public static <T> ResultUtil<T> failure(BaseException baseException, T data) {
        return new ResultUtil<>(baseException.getErrorType(), data);
    }

    public static <T> ResultUtil<T> failure(ErrorType errorType, T data) {
        return new ResultUtil<>(errorType, data);
    }

    public static <T> ResultUtil<T> failure(ErrorType errorType) {
        return new ResultUtil<>(errorType);
    }

    /**
     * 默认返回失败信息
     *
     * @param data 失败数据对象
     * @return 失败的结果
     */
    public static <T> ResultUtil<T> failure(T data) {
        return new ResultUtil<>(ResultCodeEnum.FAILURE.getCode(), ResultCodeEnum.FAILURE.getDesc(), null);
    }

    /**
     * 返回指定的状态码，失败提示信息，数据对象
     *
     * @param failureCode 指定的失败状态码
     * @param data        数据对象
     * @return 失败结果
     */
    public static <T> ResultUtil<T> failure(int failureCode, T data) {
        return new ResultUtil<>(failureCode, ResultCodeEnum.FAILURE.getDesc(), data);
    }

    /**
     * 返回失败状态码，指定的失败提示信息，数据对象
     *
     * @param failureMsg 指定的失败提示信息
     * @param data       数据对象
     * @return 失败结果
     */
    public static <T> ResultUtil<T> failure(String failureMsg, T data) {
        return new ResultUtil<>(ResultCodeEnum.FAILURE.getCode(), failureMsg, data);
    }

    public T getData() {
        return data;
    }

}
