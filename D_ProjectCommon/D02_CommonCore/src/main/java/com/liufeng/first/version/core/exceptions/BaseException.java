package com.liufeng.first.version.core.exceptions;

import lombok.Getter;

/**
 * @author: HB
 * @dateTime: 2022/8/26 10:48
 * @WeChatAccount: Java技术与生活
 * @description: 基础异常
 */
@Getter
public class BaseException extends RuntimeException {

    private ErrorType errorType;

    public BaseException() {
        super(SystemErrorType.SYSTEM_ERROR.getMessage());
        this.errorType = SystemErrorType.SYSTEM_ERROR;
    }

    public BaseException(ErrorType errorType) {
        super(errorType.getMessage());
        this.errorType = errorType;
    }

    public BaseException(ErrorType errorType, String message) {
        super(message);
        this.errorType = errorType;

    }

    public BaseException(ErrorType errorType, String message, Throwable cause) {
        super(message, cause);
        this.errorType = errorType;
    }

    public BaseException(String message) {
        super(message);
    }

}
