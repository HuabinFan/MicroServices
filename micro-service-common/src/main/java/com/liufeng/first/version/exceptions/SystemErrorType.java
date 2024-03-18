package com.liufeng.first.version.exceptions;

import lombok.Getter;

/**
 * @author: HB
 * @dateTime: 2022/8/26 10:55
 * @WeChatAccount: Java技术与生活
 * @description:
 */
@Getter
public enum SystemErrorType implements ErrorType {

    /**
     * 系统错误
     */
    SYSTEM_ERROR(10000000, "system_error"),
    SYSTEM_BUSY(10000001, "system_busy"),
    ;

    private final int code;

    private final String message;

    SystemErrorType(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public int getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return LOCALE_MESSAGE.getMessage(message);
    }

    @Override
    public String getMessage(Object[] objects) {
        return LOCALE_MESSAGE.getMessage(message, objects);
    }
}
