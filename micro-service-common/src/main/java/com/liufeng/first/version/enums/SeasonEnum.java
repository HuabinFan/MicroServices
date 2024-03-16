package com.liufeng.first.version.enums;

/**
 * @author: HB
 * @dateTime: 2024/3/16 10:19
 * @WeChatAccount: Java技术与生活
 * @description: 季节枚举类
 */
public enum SeasonEnum {

    /**
     * 春季
     */
    SPRING(1, "spring", "春季"),
    /**
     * 夏季
     */
    SUMMER(2, "summer", "夏季"),
    /**
     * 秋季
     */
    AUTUMN(3, "autumn", "秋季"),
    /**
     * 冬季
     */
    WINTER(4, "winter", "冬季");

    private final Integer key;
    private final String value;
    private final String desc;

    SeasonEnum(Integer key, String value, String desc) {
        this.key = key;
        this.value = value;
        this.desc = desc;
    }

    public Integer getKey() {
        return this.key;
    }

    public String getValue() {
        return this.value;
    }

    public String getDesc() {
        return this.desc;
    }

    public SeasonEnum getBySeasonKey(Integer key) {
        switch (key) {
            case 1:
                return SPRING;
            case 2:
                return SUMMER;
            case 3:
                return AUTUMN;
            case 4:
                return WINTER;
            default:
                throw new RuntimeException("Season is not exist!");
        }
    }

}
