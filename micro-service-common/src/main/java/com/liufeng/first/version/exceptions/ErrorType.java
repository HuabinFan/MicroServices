package com.liufeng.first.version.exceptions;

import com.liufeng.first.version.core.toolkits.LocaleMessage;
import com.liufeng.first.version.core.utils.SpringContextUtil;
import com.microsoft.sqlserver.jdbc.StringUtils;

import java.io.Serializable;

/**
 * @author: HB
 * @dateTime: 2022/8/26 10:49
 * @WeChatAccount: Java技术与生活
 * @description:
 */
public interface ErrorType extends Serializable {

    LocaleMessage localeMessage = (LocaleMessage) SpringContextUtil.getBean("localeMessage");

    /**
     * 返回 code
     *
     * @return code
     */
    int getCode();

    /**
     * 返回 message
     *
     * @return message
     */
    String getMessage();

    /**
     * 返回替换占位符后的 message
     *
     * @param objects
     * @return message
     */
    default String getMessage(Object[] objects) {
        return StringUtils.EMPTY;
    }

}
