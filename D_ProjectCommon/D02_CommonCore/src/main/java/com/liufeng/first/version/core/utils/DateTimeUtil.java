package com.liufeng.first.version.core.utils;

import java.time.*;
import java.util.Date;

/**
 * @author: HB
 * @dateTime: 2022/8/27 16:25
 * @WeChatAccount: Java技术与生活
 * @description: 日期时间工具
 */
public class DateTimeUtil {

    public static LocalDate dateToLocalDate(Date date) {
        return null;
    }

    public static Date localDateToDate(LocalDate localDate) {
        return null;
    }

    public static String dateToString(Date date) {
        return null;
    }

    public static Date stringToDate(String string) {
        return null;
    }

    public static LocalDateTime dateToLocalDateTime(Date date) {
        Instant instant = date.toInstant();
        ZoneId zoneId = ZoneId.systemDefault();
        return LocalDateTime.ofInstant(instant, zoneId);
    }

    /**
     * LocalDateTime 转 Date
     *
     * @Params zoneId：获取系统默认时区
     * @Params zonedDateTime：默认时区的日期和时间
     * @Params instant：
     */
    public static Date localDateTimeToDate(LocalDateTime localDateTime) {
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zonedDateTime = localDateTime.atZone(zoneId);
        Instant instant = zonedDateTime.toInstant();
        return Date.from(instant);
    }

    /**
     * 获取当前年份
     * @param date
     * @return
     */
    public static Integer getYear(Date date) {
        LocalDateTime localDateTime = dateToLocalDateTime(date);
        return localDateTime.getYear();
    }

    /**
     * 获取当前月份
     * @param date
     */
    public static void getMonth(Date date) {

    }

    /**
     * 获取当前日期
     * @param date
     */
    public static void getDay(Date date) {

    }
}
