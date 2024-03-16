package com.liufeng.first.version.constants;

/**
 * @author: HB
 * @dateTime: 2022/8/26 10:45
 * @WeChatAccount: Java技术与生活
 * @description: 校验信息常量
 */
public interface ValidInfoConstant {

    /**
     * DECIMAL 最大值
     */
    String DECIMAL_MAX = "999999999.999999";

    /**
     * DECIMAL 最小值
     */
    String DECIMAL_MIN = "0";

    /**
     * DECIMAL 负数最小值
     */
    String NEGATIVE_DECIMAL_MIN = "-999999999.999999";

    /**
     * DECIMAL 检验提示信息
     */
    String DECIMAL_MESSAGE = "请输入0到100000000之间的数字，小数位数不能超过6位";

    /**
     * 整形最小值
     */
    int INT_MIN = 0;

    /**
     * ID 长度
     */
    int ID_LENGTH = 32;

    /**
     * ID 长度检验提示信息
     */
    String ID_LENGTH_MESSAGE = "编号最大长度为" + ID_LENGTH + "个字符";

    /**
     * ID 非空检验 提示信息
     */
    String ID_EMPTY_MESSAGE = "编号不能为空";

    /**
     * 编号校验规则 非中文、中文字符 、0-32位
     */
    String ID_REGEXP = "(?!.*\\s)[\\x00-\\xff]{0,32}";

    /**
     * 编号校验 提示信息
     */
    String ID_REGEXP_MESSAGE = "编号中不能输入空格、中文及中文符号，且不能超过32位";

    /**
     * code 长度
     */
    int CODE_LENGTH = 32;

    /**
     * code 长度校验 提示信息
     */
    String CODE_LENGTH_MESSAGE = "编码最大长度为" + CODE_LENGTH + "个字符";

    /**
     * code 非空校验 提示信息
     */
    String CODE_EMPTY_MESSAGE = "编码不能为空";

    /**
     * 编码校验规则 非中文和中文字符 0-32位
     */
    String CODE_REGEXP = "(?!.*\\s)[\\x00-\\xff]{0,32}";

    /**
     * 编码校验 提示信息
     */
    String CODE_REGEXP_MESSAGE = "编码不能输入空格、中文及中文符号且不能超过32位";

    /**
     * name 长度
     */
    int NAME_LENGTH = 64;

    /**
     * name 长度校验 提示信息
     */
    String NAME_LENGTH_MESSAGE = "名称最大长度为" + NAME_LENGTH + "个字符";

    /**
     * name 非空检验 提示信息
     */
    String NAME_EMPTY_MESSAGE = "名称不能为空";

    /**
     * 名称校验规则
     */
    String NAME_REGEXP = "^[\\u4E00-\\u9FA5A-Za-z0-9_]+$";

    /**
     * 名称校验 提示信息
     */
    String NAME_REGEXP_MESSAGE = "名称只能输入中文、英文、数字或下划线!";

    /**
     * 微信长度
     */
    int WECHAT_LENGTH = 20;

    /**
     * 微信长度 校验提示信息
     */
    String WECHAT_LENGTH_MESSAGE = "微信账号最大长度为" + WECHAT_LENGTH + "个字符";

    /**
     * 微信校验规则
     */
    String WECHAT_REGEXP = "(^\\d{0}$)|(^[A-Za-z0-9_-]{6,20}$)";

    /**
     * 微信校验 提示信息
     */
    String WECHAT_REGEXP_MESSAGE = "微信账号格式不正确！微信号只能输入6-20位的字母、数字、下划线和减号";

    /**
     * 地址长度
     */
    int ADDRESS_LENGTH = 64;

    /**
     * 地址长度 校验提示信息
     */
    String ADDRESS_LENGTH_MESSAGE = "住址(籍贯)最大长度为" + ADDRESS_LENGTH + "个字符";

    /**
     * 学号 长度
     */
    int STUDENT_NO_LENGTH = 32;

    /**
     * 学号长度检验 提示信息
     */
    String STUDENT_NO_LENGTH_MESSAGE = "学号最大长度为" + STUDENT_NO_LENGTH + "个字符";

    /**
     * 学号校验规则
     */
    String STUDENT_NO_REGEXP = "^[A-Za-z0-9]+$";

    /**
     * 学号校验 提示信息
     */
    String STUDENT_NO_REGEXP_MESSAGE = "学号格式不正确";

    /**
     * 邮箱长度
     */
    int EMAIL_LENGTH = 254;

    /**
     * 邮箱长度 校验提示信息
     */
    String EMAIL_LENGTH_MESSAGE = "邮箱最大长度为" + EMAIL_LENGTH + "个字符";

    /**
     * 邮箱校验规则
     */
    String EMAIL_REGEXP = "^$|(^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)$";

    /**
     * 邮箱格式校验 提示信息
     */
    String EMAIL_REGEXP_MESSAGE = "邮箱格式不合法";

    /**
     * 身份证校验规则
     */
    String ID_CARD_REGEXP = "^$|(^\\d{8}(0\\d|10|11|12)([0-2]\\d|30|31)\\d{3}$)|(^\\d{6}(18|19|20)\\d{2}(0\\d|10|11|12)([0-2]\\d|30|31)\\d{3}(\\d|X|x))$";

    /**
     * 身份证校验 提示信息
     */
    String ID_CARD_REGEXP_MESSAGE = "身份证格式不正确!";

    /**
     * 身份证号长度
     */
    int ID_CARD_LENGTH = 18;

    /**
     * 身份证号长度 提示信息
     */
    String ID_CARD_LENGTH_MESSAGE = "身份证号最大长度为" + ID_CARD_LENGTH + "位";

    /**
     * 手机号长度
     * 备注：2021-01-01 和权限服务保持一致
     */
    int PHONE_LENGTH = 11;

    /**
     * 手机号长度校验 提示信息
     */
    String PHONE_LENGTH_MESSAGE = "手机号码最大长度为" + PHONE_LENGTH + "位";

    /**
     * 手机号校验规则
     */
    String PHONE_REGEXP = "^$|(^(?:(?:\\+|00)86)?1\\d{10})$";

    /**
     * 手机号校验 提示信息
     */
    String PHONE_REGEXP_MESSAGE = "移动电话格式不正确";

    /**
     * 固定电话长度
     */
    int TELEPHONE_LENGTH = 13;

    /**
     * 电话长度校验 提示信息
     */
    String TELEPHONE_LENGTH_MESSAGE = "固定电话号码最大长度为" + TELEPHONE_LENGTH + "位";

    /**
     * 固定电话校验规则
     */
    String TELEPHONE_REGEXP = "^$|(^\\d{3}-\\d{8}$|^\\d{4}-\\d{7,8})$";

    /**
     * 固定电话校验 提示信息
     */
    String TELEPHONE_REGEXP_MESSAGE = "固定电话格式不正确";

    /**
     * 企业统一社会信用代码正则表达式（兼容18位和15位）
     */
    String SOCIAL_CREDIT_CODE_REGEXP = "^([0-9A-HJ-NPQRTUWXY]{2}\\d{6}[0-9A-HJ-NPQRTUWXY]{10}|[1-9]\\d{14})$";

    /**
     * 企业统一社会信用代码错误信息
     */
    String SOCIAL_CREDIT_CODE_MESSAGE = "企业统一社会信用代码不正确";

    /**
     * 性别校验规则
     */
    String GENDER_REGEXP = "^[MFU]{1}$";

    /**
     * 性别校验 提示信息
     */
    String GENDER_REGEXP_MESSAGE = "性别参数不正确，性别:M-男,F-女,U-未知";

    /**
     * 绑定标识规则
     */
    String BIND_TAG_REGEXP = "^[YN]{1}$";

    /**
     * 绑定标识校验 提示信息
     */
    String BIND_TAG_REGEXP_MESSAGE = "绑定标识不正确，Y-已绑定，N-未绑定";

    /**
     * 性别长度
     */
    int GENDER_LENGTH = 1;

    /**
     * 描述性内容，256字符
     */
    int REMARK_LENGTH = 256;

    /**
     * 备注内容校验 提示信息
     */
    String REMARK_LENGTH_MESSAGE = "最大长度为" + REMARK_LENGTH;

}
