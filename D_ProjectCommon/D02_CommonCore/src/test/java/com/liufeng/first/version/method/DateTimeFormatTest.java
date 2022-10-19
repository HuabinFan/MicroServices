package com.liufeng.first.version.method;

import com.liufeng.first.version.core.constants.DateTimeConstant;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

/**
 * @author: HB
 * @dateTime: 2022/10/10 15:38
 * @WeChatAccount: Java技术与生活
 * @description: 日期时间格式化测试
 */
public class DateTimeFormatTest {

    /**
     * SimpleDateFormat（JDK8以前）用法：
     * 1、SimpleDateFormat 是线程不安全的，使用时，只能在方法内部创建新的局部变量
     * 2、使用旧的Date对象时，使用SimpleDateFormat进行格式化显示
     */
    @Test
    public void SimpleDateFormatTest() {
        Date date = new Date();
        SimpleDateFormat sdf01 = new SimpleDateFormat(DateTimeConstant.DEFAULT_TIME_PATTERN);
        System.out.println("date 格式化：" + sdf01.format(date));  // 2022-10-10 16:59:28

        SimpleDateFormat sdf02 = new SimpleDateFormat(DateTimeConstant.DEFAULT_DATE_TIME_PATTERN);
        System.out.println("localDateTime 格式化为：" + sdf02.format(date));  // 2022-10-10 16:59:28.797

    }

    /**
     * DateTimeFormatter（JDK8以后）用法：
     * 1、DateTimeFormatter 是不变对象，并且是线程安全的；使用时，只需要创建一个实例，然后到处引用
     * 2、使用新的LocalDateTime或ZonedLocalDateTime时，使用DateTimeFormatter格式化显示
     */
    @Test
    public void DateTimeFormatterTest() {
        // 字符串转日期
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern(DateTimeConstant.DEFAULT_TIME_PATTERN);
        String format = timeFormatter.format(LocalDateTime.now());
        System.out.println("format: " + format);

        LocalDateTime parse = LocalDateTime.parse("2022-10-10 13:00:00", timeFormatter);
        Instant instant = parse.atZone(ZoneId.systemDefault()).toInstant();
        Date date = Date.from(instant);
        System.out.println("date: " + date);

        // 日期转字符串
        Date date1 = new Date();
        LocalDateTime localDateTime = date1.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        DateTimeFormatter timeFormatter1 = DateTimeFormatter.ofPattern(DateTimeConstant.DEFAULT_TIME_PATTERN);
        String format1 = localDateTime.format(timeFormatter1);
        System.out.println("format1: " + format1);

    }

    /**
     * DateFormat 用法
     */
    @Test
    public void DateFormatTest() {

        // 获取不同格式化风格和中国环境的日期
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT, Locale.CHINA);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.CHINA);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG, Locale.CHINA);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, Locale.CHINA);

        // 获取不同格式化风格和中国环境的时间
        DateFormat df5 = DateFormat.getTimeInstance(DateFormat.SHORT, Locale.CHINA);
        DateFormat df6 = DateFormat.getTimeInstance(DateFormat.MEDIUM, Locale.CHINA);
        DateFormat df7 = DateFormat.getTimeInstance(DateFormat.LONG, Locale.CHINA);
        DateFormat df8 = DateFormat.getTimeInstance(DateFormat.FULL, Locale.CHINA);

        // 将不同格式化风格的日期格式化为日期字符串
        String date1 = df1.format(new Date());
        String date2 = df2.format(new Date());
        String date3 = df3.format(new Date());
        String date4 = df4.format(new Date());

        // 将不同格式化风格的时间格式化为时间字符串
        String time1 = df5.format(new Date());
        String time2 = df6.format(new Date());
        String time3 = df7.format(new Date());
        String time4 = df8.format(new Date());

        // 输出
        System.out.println("SHORT: " + date1 + " " + time1);
        System.out.println("MEDIUM: " + date2 + " " + time2);
        System.out.println("LONG: " + date3 + " " + time3);
        System.out.println("FULL: " + date4 + " " + time4);
    }

}
