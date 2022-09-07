package com.liufeng.first.version.core.annotations;

import java.lang.annotation.*;

/**
 * @author: HB
 * @dateTime: 2022/9/7 20:00
 * @WeChatAccount: Java技术与生活
 * @description: 属性注册顺序
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
public @interface RegisterFieldOrder {

    int value();

}
