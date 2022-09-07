package com.liufeng.first.version.core.constants;

/**
 * @author: HB
 * @dateTime: 2022/8/26 10:42
 * @WeChatAccount: Java技术与生活
 * @description: 日期时间常量
 */
public interface DateTimeConstant {

    /**
     * 格式化年份，如：2021
     */
    String PATTERN_YYYY = "yyyy";

    /**
     * 格式化年份月份：年月，如：202101
     */
    String PATTERN_YYYYMM = "yyyyMM";

    /**
     * 格式化年份-月份：年-月，如：2021-01
     */
    String PATTERN_YYYY_MM = "yyyy-MM";

    /**
     * 格式化年月日：年月日，如：20210101
     */
    String PATTERN_YYYYMMDD = "yyyyMMdd";

    /**
     * 默认日期格式：年-月-日，如：2021-01-01
     */
    String DEFAULT_DATE_PATTERN = "yyyy-MM-dd";

    /**
     * 格式化年月日 小时分钟，如：2021-01-01 23:59
     */
    String PATTERN_YYYY_MM_DD_HH_MM = "yyyy-MM-dd HH:mm";

    /**
     * 默认日期时间格式：年-月-日 时:分:秒，如：2021-01-01 23:59:59
     */
    String DEFAULT_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";

    /**
     * 格式化年月日 小时分钟秒 毫秒，如：20210101235959888
     */
    String PATTERN_YYYYMMDDHHMISSSSS = "yyyyMMddHHmmssSSS";

}
