package com.liufeng.first.version.enums;

/**
 * @author: HB
 * @dateTime: 2022/9/8 16:37
 * @wechatAccount: Java技术与生活
 * @description: 返回结果码枚举类
 */
public enum ResultCodeEnum {

    /**
     * 请求成功
     */
    SUCCESS(1000, "请求成功"),
    /**
     * 请求失败
     */
    FAILURE(2000, "请求失败"),
    /**
     * 校验参数失败
     */
    INVALID(3000, "校验参数失效"),
    ;

    ResultCodeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    private final int code;
    private final String desc;

    public int getCode() {
        return this.code;
    }

    public String getDesc() {
        return this.desc;
    }

    @Override
    public String toString() {
        return this.code + ":" + this.desc;
    }

}
