package com.liufeng.test.springboot.vo;

import com.liufeng.first.version.annotations.IgnoreRegisterField;
import com.liufeng.first.version.annotations.RegisterFieldOrder;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: HB
 * @dateTime: 2022/9/8 15:47
 * @wechatAccount: Java技术与生活
 * @description:
 */
@Data
public class StudentVO implements Serializable {
    @ApiModelProperty(value = "学生编号", example = "学生编号")
    @IgnoreRegisterField
    private String id;

    @ApiModelProperty(value = "学生编码", example = "学生编码")
    @RegisterFieldOrder(1)
    private String code;

    @ApiModelProperty(value = "姓名", example = "姓名")
    @RegisterFieldOrder(2)
    private String name;

    @ApiModelProperty(value = "学号", example = "学号")
    @RegisterFieldOrder(3)
    private String stuNo;

    @ApiModelProperty(value = "性别", example = "性别")
    @RegisterFieldOrder(4)
    private Character gender;

    @ApiModelProperty(value = "出生日期", example = "出生日期")
    @RegisterFieldOrder(5)
    private Date birthday;

    @ApiModelProperty(value = "身份证号", example = "身份证号")
    private String idCard;

    @ApiModelProperty(value = "邮箱", example = "邮箱")
    private String email;

    @ApiModelProperty(value = "微信号", example = "微信号")
    private String wechat;

    @ApiModelProperty(value = "移动电话", example = "移动电话")
    @RegisterFieldOrder(6)
    private String phone;

    @ApiModelProperty(value = "住址", example = "住址")
    private String address;

    @ApiModelProperty(value = "籍贯", example = "籍贯")
    @RegisterFieldOrder(7)
    private String origin;

}
