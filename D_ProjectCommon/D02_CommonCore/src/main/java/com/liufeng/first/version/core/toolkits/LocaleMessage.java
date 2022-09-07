package com.liufeng.first.version.core.toolkits;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author: HB
 * @dateTime: 2022/8/26 10:57
 * @WeChatAccount: Java技术与生活
 * @description:
 */
@Component("localeMessage")
public class LocaleMessage {

    @Resource
    private MessageSource messageSource;

    public String getMessage(String msgKey) {
        return messageSource.getMessage(msgKey, null, LocaleContextHolder.getLocale());
    }

    public String getMessage(String msgKey, Object[] objects) {
        return messageSource.getMessage(msgKey, objects, LocaleContextHolder.getLocale());
    }

}
