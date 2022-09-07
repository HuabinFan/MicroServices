package com.liufeng.first.version.core.exceptions;

/**
 * @author: HB
 * @dateTime: 2022/9/7 19:22
 * @wechatAccount: Java技术与生活
 * @description: 接口异常类
 */
public class ApiException extends BaseException {

    public ApiException() {
        super();
    }

    public ApiException(ErrorType errorType) {
        super(errorType);
    }

    public ApiException(ErrorType errorType, String message) {
        super(errorType, message);
    }

    public ApiException(ErrorType errorType, String message, Throwable cause) {
        super(errorType, message, cause);
    }

}
