package com.liufeng.first.version.method;

import com.alibaba.nacos.common.utils.CollectionUtils;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import org.apache.commons.lang.StringUtils;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: HB
 * @dateTime: 2023/4/10 13:58
 * @WeChatAccount: Java技术与生活
 * @description: String方法单元测试
 */
public class StringFormatTest {

    public static String listToString1(List<String> stringList) {
        if (CollectionUtils.isEmpty(stringList)) {
            return StringPool.EMPTY;
        }
        return StringUtils.join(Collections.singletonList(stringList), ",");
    }

    /**
     * List<String> 转换为 String
     *
     * @param strList 需要转换的字符串集合
     * @return 转换之后的字符串，带有前后缀
     */
    public static String listToString2(List<String> strList, String prefix, String suffix) {
        if (CollectionUtils.isEmpty(strList) || strList.size() == 0) {
            return StringPool.EMPTY;
        }
        return strList.stream().collect(Collectors.joining(",", prefix, suffix));
    }

    /**
     * List<String> 转换为 String
     *
     * @param strList 需要转换的字符串集合
     * @return 转换之后的字符串，不带有前后缀
     */
    public static String listToString2(List<String> strList) {
        if (CollectionUtils.isEmpty(strList) || strList.size() == 0) {
            return StringPool.EMPTY;
        }
        return String.join(",", strList);
    }

    @Test
    public void listToString() {
        List<String> stringList = Arrays.asList("1", "2", "3");

        String str = listToString1(stringList);
        System.out.println("list转换String后的结果：" + str);

        String collect = listToString2(stringList, "{", "}");
        System.out.println("Collectors.joining 带前后缀：" + collect);

        String string2 = listToString2(stringList);
        System.out.println("Collectors.joining 不带前后缀：" + string2);
    }

}
