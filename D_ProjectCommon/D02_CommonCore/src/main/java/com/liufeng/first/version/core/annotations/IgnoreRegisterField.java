package com.liufeng.first.version.core.annotations;

import java.lang.annotation.*;

/**
 * @author: HB
 * @dateTime: 2022/8/26 10:35
 * @WeChatAccount: Java技术与生活
 * @description: 忽略注册属性
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
public @interface IgnoreRegisterField {
}
