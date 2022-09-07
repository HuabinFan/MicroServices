package com.liufeng.test.springboot.dto;

import com.liufeng.first.version.core.constants.ValidInfoConstant;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

/**
 * @author: HB
 * @dateTime: 2022/8/26 9:27
 * @WeChatAccount: Java技术与生活
 * @description:
 */
@Data
public class SaveStudentDTO implements Serializable {

    @ApiModelProperty(value = "学生编码", example = "学生编码")
    @NotBlank(message = ValidInfoConstant.CODE_EMPTY_MESSAGE)
    private String code;

    @ApiModelProperty(value = "姓名", example = "姓名")
    @NotBlank(message = ValidInfoConstant.NAME_EMPTY_MESSAGE)
    private String name;

    @ApiModelProperty(value = "学号", example = "学号")
    private String stuNo;

    @ApiModelProperty(value = "性别", example = "性别")
    private Character gender;

    @ApiModelProperty(value = "出生日期", example = "出生日期")
    private Date birthday;

    @ApiModelProperty(value = "身份证号", example = "身份证号")
    private String idCard;

    @ApiModelProperty(value = "邮箱", example = "邮箱")
    private String email;

    @ApiModelProperty(value = "微信号", example = "微信号")
    private String wechat;

    @ApiModelProperty(value = "移动电话", example = "移动电话")
    private String phone;

    @ApiModelProperty(value = "住址", example = "住址")
    private String address;

    @ApiModelProperty(value = "籍贯", example = "籍贯")
    private String origin;

}
