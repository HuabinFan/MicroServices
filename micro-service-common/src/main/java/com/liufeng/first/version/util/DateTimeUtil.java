package com.liufeng.first.version.util;

import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.liufeng.first.version.core.constants.DateTimeConstant;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

/**
 * @author: HB
 * @dateTime: 2022/8/27 16:25
 * @WeChatAccount: Java技术与生活
 * @description: 日期时间工具
 */
@Slf4j
public class DateTimeUtil implements Serializable {

    /*
     * 同样的 2022-10-10 14:00:00，不同格式下表达形式不同
     *          Date 格式：Mon Oct 10 14:00:00 CST 2022
     *     LocalDate 格式：2022-10-10
     * LocalDateTime 格式：2022-10-10T14:00:00
     */

    /**
     * Date 转 LocalDate
     *
     * @param date   需要进行转化的日期
     * @param zoneId 自定义时区
     * @return 返回转化后的LocalDate格式值
     */
    public static LocalDate dateToLocalDate(Date date, ZoneId zoneId) {
        if (Objects.isNull(zoneId)) {
            zoneId = ZoneId.systemDefault();
        }
        Instant instant = date.toInstant();
        return instant.atZone(zoneId).toLocalDate();
    }

    /**
     * LocalDate 转 Date
     *
     * @param localDate 需要进行转化的LocalDate日期
     * @param zoneId    自定义时区
     * @return 返回转化后的Date格式值
     */
    public static Date localDateToDate(LocalDate localDate, ZoneId zoneId) {
        if (Objects.isNull(zoneId)) {
            zoneId = ZoneId.systemDefault();
        }
        ZonedDateTime zonedDateTime = localDate.atStartOfDay(zoneId);
        Instant instant = zonedDateTime.toInstant();
        return Date.from(instant);
    }

    /**
     * Date 转 String
     *
     * @param date    需要转化的Date类型的日期时间
     * @param pattern String 类型的日期时间格式
     * @param zoneId  自定义时区
     * @return 转换为String格式以后的日期时间
     */
    public static String dateToString(Date date, String pattern, ZoneId zoneId) {
        if (Objects.isNull(date)) {
            return StringPool.NULL;
        }
        try {
            if (StringUtils.isBlank(pattern)) {
                pattern = DateTimeConstant.DEFAULT_TIME_PATTERN;
            }
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
            LocalDateTime localDateTime = dateToLocalDateTime(date, zoneId);
            return localDateTime.format(formatter);
        } catch (Exception e) {
            log.error("Parse date to string error: " + e.getMessage() + "convert time: " + date);
            return StringPool.NULL;
        }
    }

    /**
     * String 转 Date
     *
     * @param dateStr 需要转换的字符串格式的日期，格式：yyyy-MM-dd
     * @param zoneId  自定义时区
     * @return 转换为Date格式以后的日期
     */
    public static Date stringToDate(String dateStr, ZoneId zoneId) {
        if (StringUtils.isBlank(dateStr)) {
            return null;
        }
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DateTimeConstant.DEFAULT_DATE_PATTERN);
            LocalDate localDate = LocalDate.parse(dateStr, formatter);
            return localDateToDate(localDate, zoneId);
        } catch (Exception e) {
            log.error("Parse string to date error: " + e.getMessage() + "convert date: " + dateStr);
            return null;
        }
    }

    /**
     * String 转 Time
     *
     * @param timeStr 需要转换的字符串格式的日期时间，格式：yyyy-MM-dd HH:mm:ss
     * @param zoneId  自定义时区
     * @return 转换为Date格式以后的日期时间
     */
    public static Date stringToTime(String timeStr, ZoneId zoneId) {
        if (StringUtils.isBlank(timeStr)) {
            return null;
        }
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DateTimeConstant.DEFAULT_TIME_PATTERN);
            LocalDateTime localDateTime = LocalDateTime.parse(timeStr, formatter);
            return localDateTimeToDate(localDateTime, zoneId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * String 转随机格式的日期时间
     *
     * @param dateTimeStr 需要转换的字符串格式的日期时间
     * @param pattern     String 类型的日期时间格式
     * @return 转换为Date格式以后的日期时间
     */
    public static Date stringToRandomDateTime(String dateTimeStr, String pattern) {
        if (StringUtils.isBlank(dateTimeStr)) {
            return null;
        }
        try {
            if (StringUtils.isBlank(pattern)) {
                pattern = DateTimeConstant.DEFAULT_TIME_PATTERN;
            }
            SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
            return dateFormat.parse(dateTimeStr);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Date 转 LocalDateTime
     *
     * @param date   需要进行转化的日期
     * @param zoneId 自定义时区
     * @return 返回转化后的LocalDateTime格式值
     */
    public static LocalDateTime dateToLocalDateTime(Date date, ZoneId zoneId) {
        if (Objects.isNull(zoneId)) {
            zoneId = ZoneId.systemDefault();
        }
        Instant instant = date.toInstant();
        return LocalDateTime.ofInstant(instant, zoneId);
    }

    /**
     * LocalDateTime 转 Date
     *
     * @param localDateTime 需要进行转化的日期时间
     * @param zoneId        自定义时区
     * @return 返回转化后的Date格式值
     */
    public static Date localDateTimeToDate(LocalDateTime localDateTime, ZoneId zoneId) {
        if (Objects.isNull(zoneId)) {
            zoneId = ZoneId.systemDefault();
        }
        ZonedDateTime zonedDateTime = localDateTime.atZone(zoneId);
        return Date.from(zonedDateTime.toInstant());
    }

    /**
     * 获取某个日期的年份
     *
     * @param date   所要获取年份的日期
     * @param zoneId 自定义时区
     * @return 返回得到的年份，整型格式
     */
    public static Integer getYear(Date date, ZoneId zoneId) {
        LocalDate localDate = dateToLocalDate(date, zoneId);
        return localDate.getYear();
    }

    /**
     * 获取某个日期的月份
     *
     * @param date   所要获取月份的日期
     * @param zoneId 自定义时区
     * @return 返回得到的月份，整型格式
     */
    public static Integer getMonth(Date date, ZoneId zoneId) {
        LocalDate localDate = dateToLocalDate(date, zoneId);
        return localDate.getMonthValue();
    }

    /**
     * 获取当前日期（无参方法）
     *
     * @return 返回获取到的日期字符串
     */
    public static String getCurrentDate() {
        return getCurrentDate(DateTimeConstant.DEFAULT_DATE_PATTERN);
    }

    /**
     * 获取当前日期（有参方法）
     *
     * @param pattern 日期格式
     * @return 返回获取到的日期字符串
     */
    public static String getCurrentDate(String pattern) {
        if (StringUtils.isBlank(pattern)) {
            pattern = DateTimeConstant.DEFAULT_DATE_PATTERN;
        }
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(pattern);
        return LocalDateTime.now().format(dateFormatter);
    }

    /**
     * 获取当前时间（无参方法）
     *
     * @return 返回获取到的时间字符串
     */
    public static String getCurrentTime() {
        return getCurrentTime(DateTimeConstant.DEFAULT_TIME_PATTERN);
    }

    /**
     * 获取当前时间（有参方法）
     *
     * @param pattern 时间格式
     * @return 返回获取到的时间字符串
     */
    public static String getCurrentTime(String pattern) {
        if (StringUtils.isBlank(pattern)) {
            pattern = DateTimeConstant.DEFAULT_TIME_PATTERN;
        }
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern(pattern);
        return LocalDateTime.now().format(timeFormatter);
    }

    /**
     * 获取当前日期过去第几天的日期
     *
     * @param pastDay 过去的第几天
     * @param zoneId  自定义时区
     * @return 返回过去第几天的日期，仅为 年月日
     */
    public static Date getPastDate(int pastDay, ZoneId zoneId) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) - pastDay);
        LocalDate localDate = dateToLocalDate(calendar.getTime(), zoneId);
        return localDateToDate(localDate, zoneId);
    }

    /**
     * 获取当前日期以后第几天的日期
     *
     * @param futureDay 未来的第几天
     * @param zoneId    自定义时区
     * @return 返回未来第几天的日期，仅为 年月日
     */
    public static Date getFutureDate(int futureDay, ZoneId zoneId) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) + futureDay);
        LocalDate localDate = dateToLocalDate(calendar.getTime(), zoneId);
        return localDateToDate(localDate, zoneId);
    }

    /**
     * 获取某年某月有多少天，输入格式只能是 yyyy-MM-dd 或 yyyy-MM
     *
     * @param strDate 字符串类型的日期
     * @return 某年某月天数
     */
    public static Integer getDaysOfMonth(String strDate) {
        if (strDate.length() == 7) {
            strDate += DateTimeConstant.MONTH_START_SUFFIX;
        }
        int year = Integer.parseInt(strDate.substring(0, 4));
        int month = Integer.parseInt(strDate.substring(5, 7));
        return LocalDate.of(year, month, 1).lengthOfMonth();
    }

    /**
     * 根据开始结束日期获取年差值
     *
     * @param startDate 开始日期[yyyy-MM-dd]
     * @param endDate   结束日期[yyyy-MM-dd]
     * @return 两个日期之间的年差值
     */
    public long getYearDiff(String startDate, String endDate) {
        Temporal startTemp = LocalDate.parse(startDate);
        Temporal endTemp = LocalDate.parse(endDate);
        return ChronoUnit.YEARS.between(startTemp, endTemp);
    }

    /**
     * 根据开始结束日期获取月差值
     *
     * @param startDate 开始日期[yyyy-MM-dd]
     * @param endDate   结束日期[yyyy-MM-dd]
     * @return 两个日期之间的月差值
     */
    public long getMonthDiff(String startDate, String endDate) {
        Temporal startTemp = LocalDate.parse(startDate);
        Temporal endTemp = LocalDate.parse(endDate);
        return ChronoUnit.MONTHS.between(startTemp, endTemp);
    }

    /**
     * 根据开始结束日期获取日差值
     *
     * @param startDate 开始日期[yyyy-MM-dd]
     * @param endDate   结束日期[yyyy-MM-dd]
     * @return 两个日期之间的日差值
     */
    public long getDayDiff(String startDate, String endDate) {
        Temporal startTemp = LocalDate.parse(startDate);
        Temporal endTemp = LocalDate.parse(endDate);
        return ChronoUnit.DAYS.between(startTemp, endTemp);
    }

}
