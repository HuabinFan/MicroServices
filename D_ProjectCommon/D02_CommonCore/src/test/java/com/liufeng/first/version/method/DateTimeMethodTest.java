package com.liufeng.first.version.method;

import com.liufeng.first.version.core.constants.DateTimeConstant;
import org.apache.commons.lang.StringUtils;
import org.junit.Test;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * @author: HB
 * @dateTime: 2022/10/11 17:38
 * @WeChatAccount: Java技术与生活
 * @description: 日期时间方法测试
 */
public class DateTimeMethodTest {

    /*
     * 不允许在程序任何地方中使用：
     * 1）java.sql.Date
     * 2）java.sql.Time
     * 3）java.sql.Timestamp
     */

    /**
     * dateToLocalDate 测试
     */
    @Test
    public void dateToLocalDateTest() {
        LocalDate localDate = dateToLocalDate(getPastDate(28, null), null);
        System.out.println("localDate: " + localDate);
    }

    public static LocalDate dateToLocalDate(Date date, ZoneId zoneId) {
        if (Objects.isNull(zoneId)) {
            zoneId = ZoneId.systemDefault();
        }
        Instant instant = date.toInstant();
        return instant.atZone(zoneId).toLocalDate();
    }

    /**
     * localDateToDate 测试
     */
    @Test
    public void localDateToDateTest() {
        Date date = localDateToDate(LocalDate.now(), null);
        System.out.println("date: " + date);
    }

    public static Date localDateToDate(LocalDate localDate, ZoneId zoneId) {
        if (Objects.isNull(zoneId)) {
            zoneId = ZoneId.systemDefault();
        }
        ZonedDateTime zonedDateTime = localDate.atStartOfDay(zoneId);
        Instant instant = zonedDateTime.toInstant();
        return Date.from(instant);
    }

    /**
     * dateToString 方法测试
     */
    @Test
    public void dateToStringTest() {
        String string = dateToString(new Date(), DateTimeConstant.PATTERN_YYYY_MM, null);
        System.out.println("string: " + string);
    }

    public static String dateToString(Date date, String pattern, ZoneId zoneId) {
        try {
            if (Objects.isNull(date)) {
                return null;
            }
            if (StringUtils.isBlank(pattern)) {
                pattern = DateTimeConstant.DEFAULT_TIME_PATTERN;
            }
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
            LocalDateTime localDateTime = dateToLocalDateTime(date, zoneId);
            return localDateTime.format(formatter);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * StringToTime 测试
     */
    @Test
    public void stringToTimeTest() {
        Date toDate = stringToTime("2022-01-01 11:10:21", null);
        System.out.println("toDate: " + toDate);
    }

    public static Date stringToTime(String timeStr, ZoneId zoneId) {
        try {
            if (StringUtils.isBlank(timeStr)) {
                return null;
            }
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DateTimeConstant.DEFAULT_TIME_PATTERN);
            LocalDateTime localDateTime = LocalDateTime.parse(timeStr, formatter);
            return localDateTimeToDate(localDateTime, zoneId);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * StringToDate 测试
     */
    @Test
    public void stringToDateTest() {
        Date toDate = stringToDate("2022-01-01", null);
        System.out.println("toDate: " + toDate);
    }

    public static Date stringToDate(String dateStr, ZoneId zoneId) {
        try {
            if (StringUtils.isBlank(dateStr)) {
                return null;
            }
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DateTimeConstant.DEFAULT_DATE_PATTERN);
            LocalDate localDate = LocalDate.parse(dateStr, formatter);
            return localDateToDate(localDate, zoneId);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * dateToLocalDateTime 测试
     */
    @Test
    public void dateToLocalDateTimeTest() {
        LocalDateTime localDateTime = dateToLocalDateTime(new Date(), null);
        System.out.println("localDateTime: " + localDateTime);
    }

    public static LocalDateTime dateToLocalDateTime(Date date, ZoneId zoneId) {
        if (Objects.isNull(zoneId)) {
            zoneId = ZoneId.systemDefault();
        }
        Instant instant = date.toInstant();
        return LocalDateTime.ofInstant(instant, zoneId);
    }

    /**
     * localDateTimeToDate 测试
     */
    @Test
    public void localDateTimeToDateTest() {
        Date date = localDateTimeToDate(LocalDateTime.now(), null);
        System.out.println("date: " + date);
    }

    public static Date localDateTimeToDate(LocalDateTime localDateTime, ZoneId zoneId) {
        if (Objects.isNull(zoneId)) {
            zoneId = ZoneId.systemDefault();
        }
        ZonedDateTime zonedDateTime = localDateTime.atZone(zoneId);
        return Date.from(zonedDateTime.toInstant());
    }

    /**
     * getYear getMonth 测试
     */
    @Test
    public void getTest() {
        Integer year = getYear(new Date(), null);
        System.out.println("year: " + year);
    }

    public static Integer getYear(Date date, ZoneId zoneId) {
        LocalDate localDate = dateToLocalDate(date, zoneId);
        return localDate.getYear();
    }

    /**
     * getCurrentDate 测试
     */
    @Test
    public void getCurrentDateTest() {
        String currentDate = getCurrentDate(DateTimeConstant.PATTERN_YYYY_MM);
        System.out.println("currentDate: " + currentDate);
    }

    public static String getCurrentDate() {
        return getCurrentDate(DateTimeConstant.DEFAULT_DATE_PATTERN);
    }

    public static String getCurrentDate(String pattern) {
        if (StringUtils.isBlank(pattern)) {
            pattern = DateTimeConstant.DEFAULT_DATE_PATTERN;
        }
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(pattern);
        return LocalDateTime.now().format(dateFormatter);
    }

    /**
     * getPastDate 测试
     */
    @Test
    public void getPastDateTest() {
        Date pastDate = getPastDate(12, null);
        System.out.println("pastDate: " + pastDate);
    }

    public static Date getPastDate(int pastDay, ZoneId zoneId) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) - pastDay);
        LocalDate localDate = dateToLocalDate(calendar.getTime(), zoneId);
        return localDateToDate(localDate, zoneId);
    }

    /**
     * getFutureDate 测试
     */
    @Test
    public void getFutureDateTest() {
        Date futureDate = getFutureDate(3, null);
        System.out.println("futureDate: " + futureDate);
    }

    public static Date getFutureDate(int futureDay, ZoneId zoneId) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) + futureDay);
        LocalDate localDate = dateToLocalDate(calendar.getTime(), zoneId);
        return localDateToDate(localDate, zoneId);
    }

    /**
     * StringToRandomDateTime 测试
     */
    @Test
    public void stringToRandomDateTimeTest() {
        Date toDate = stringToRandomDateTime("2022-01-01", DateTimeConstant.PATTERN_YYYYMM);
        System.out.println("toDate: " + toDate);
    }

    public static Date stringToRandomDateTime(String date, String pattern) {
        if (StringUtils.isBlank(date)) {
            return null;
        }
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            return simpleDateFormat.parse(date);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * timestampToString 测试
     */
    @Test
    public void timestampToStringTest() {
        // 获取当前毫秒数，不要使用 new Date().getTime()
        long timeMillis = System.currentTimeMillis();
        System.out.println("timeMillis: " + timeMillis);

        // 获取更加精确的纳秒级时间值
        long nanoTime = System.nanoTime();
        System.out.println("nanoTime: " + nanoTime);

        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        Date date = new Date();

//        String toString = timestampToString(timeInMillis, DateTimeConstant.PATTERN_YYYY);
//        System.out.println("toString: " + toString);

    }

    public static String timestampToString(Timestamp timestamp, String pattern) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        return dateFormat.format(timestamp);
    }

    /**
     * 判断某年是否为闰年：2月有28天的这一年是平年，有29天的是闰年
     * 判断平年（common year）和闰年（leap year）的计算方法：
     * 1. 如果年份是整百年份，用年份除以400，没有余数即为闰年，有余数即为平年。
     * 2. 如果年份不是整百年份，用年份除以4，没有余数即为闰年，有余数即为平年。
     * 四年一闰，百年不闰，四百年再闰
     */
    @Test
    public void isLeapYearTest() {
        boolean leapYear = isLeapYear(2016);
        System.out.println("是否是闰年: " + leapYear);
    }

    public static boolean isLeapYear(int year) {
        return ((year & 3) == 0) && ((year % 100) != 0 || (year % 400) == 0);
    }

    /**
     * 固定年份月份的天数测试
     */
    @Test
    public void regularYearAndMonthTest() {
        // 获取今年的天数
        int daysOfThisYear = LocalDate.now().lengthOfYear();
        System.out.println("daysOfThisYear: " + daysOfThisYear);

        // 获取指定某年的天数
        int daysOfYear = LocalDate.of(2020, 10, 10).lengthOfYear();
        System.out.println("daysOfYear: " + daysOfYear);

        // 获取本月的天数
        int daysOfThisMonth = LocalDate.now().lengthOfMonth();
        System.out.println("daysOfThisMonth: " + daysOfThisMonth);

        // 获取指定某年某月的天数
        int daysOfMonth = LocalDate.of(2000, 9, 3).lengthOfMonth();
        System.out.println("daysOfMonth: " + daysOfMonth);
    }

    /**
     * 获取某年某月有多少天
     */
    @Test
    public void Test01() {
        int year = 2000;
        Integer ofYear = getDaysOfYear(year);
        System.out.println(year + "年有： " + ofYear + "天");

        int month = 2;
        Integer ofMonth = getDaysOfMonth(year, month);
        System.out.println(year + "年" + month + "月有： " + ofMonth + "天");
    }

    public static Integer getDaysOfYear(int year) {
        return LocalDate.of(year, 1, 1).lengthOfYear();
    }

    public static Integer getDaysOfMonth(int year, int month) {
        return LocalDate.of(year, month, 1).lengthOfMonth();
    }

    /**
     * 某天是某年某月的第几天测试
     */
    @Test
    public void Test02() {
        // 获取当天是本年的第几天
        int dayOfYear = LocalDate.now().getDayOfYear();
        System.out.println("dayOfYear: " + dayOfYear);

        // 获取当天是本月的第几天
        int dayOfMonth = LocalDate.now().getDayOfMonth();
        System.out.println("dayOfMonth: " + dayOfMonth);
    }


    /**
     * 需求：获取从当前开始往后几个月的天数
     * 思路：如果周期是三个月，那么就是说从指定日期开始往后三个月的天数。那么要获取
     */


    /**
     * 获取从当前开始往后几年的天数
     */

    @Test
    public void getBetweenDatesTest() {
        Date start = getPastDate(10, null);
        Date end = getFutureDate(5, null);
        List<Date> betweenDates = getBetweenDates(start, end);
        System.out.println("betweenDates: " + betweenDates);

        int size = betweenDates.size();
        System.out.println("size: " + size);
    }

    public static List<Date> getBetweenDates(Date start, Date end) {
        List<Date> result = new ArrayList<>();
        Calendar tempStart = Calendar.getInstance();
        tempStart.setTime(start);
        tempStart.add(Calendar.DAY_OF_YEAR, 1);
        Calendar tempEnd = Calendar.getInstance();
        tempEnd.setTime(end);
        while (tempStart.before(tempEnd)) {
            result.add(tempStart.getTime());
            tempStart.add(Calendar.DAY_OF_YEAR, 1);
        }
        return result;
    }

}
