package com.liufeng.first.version.vo;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author: HB
 * @dateTime: 2022/9/13 17:00
 * @wechatAccount: Java技术与生活
 * @description:
 */
public class ResultStatusVO implements Serializable {

    @ApiModelProperty(value = "状态码", example = "状态码")
    protected Integer code;

    @ApiModelProperty(value = "状态信息", example = "状态信息")
    protected String message;

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "ResultStatusVO{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }

}
