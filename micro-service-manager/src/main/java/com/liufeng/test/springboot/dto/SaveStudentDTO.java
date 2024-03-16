package com.liufeng.test.springboot.dto;

import com.liufeng.first.version.constants.ValidInfoConstant;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
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
    @Length(max = ValidInfoConstant.CODE_LENGTH, message = ValidInfoConstant.CODE_LENGTH_MESSAGE)
    @Pattern(regexp = ValidInfoConstant.CODE_REGEXP, message = ValidInfoConstant.CODE_REGEXP_MESSAGE)
    private String code;

    @ApiModelProperty(value = "姓名", example = "姓名")
    @NotBlank(message = ValidInfoConstant.NAME_EMPTY_MESSAGE)
    @Length(max = ValidInfoConstant.NAME_LENGTH, message = ValidInfoConstant.CODE_LENGTH_MESSAGE)
    @Pattern(regexp = ValidInfoConstant.NAME_REGEXP, message = ValidInfoConstant.NAME_REGEXP_MESSAGE)
    private String name;

    @ApiModelProperty(value = "学号", example = "学号")
    @NotBlank(message = "学号不能为空！")
    @Length(max = ValidInfoConstant.STUDENT_NO_LENGTH, message = ValidInfoConstant.STUDENT_NO_LENGTH_MESSAGE)
    @Pattern(regexp = ValidInfoConstant.STUDENT_NO_REGEXP, message = ValidInfoConstant.STUDENT_NO_REGEXP_MESSAGE)
    private String stuNo;

    @ApiModelProperty(value = "性别", example = "性别")
    @NotBlank(message = "性别不能为空！")
    @Length(max = ValidInfoConstant.GENDER_LENGTH)
    @Pattern(regexp = ValidInfoConstant.GENDER_REGEXP, message = ValidInfoConstant.GENDER_REGEXP_MESSAGE)
    private Character gender;

    @ApiModelProperty(value = "出生日期", example = "出生日期")
    private Date birthday;

    @ApiModelProperty(value = "身份证号", example = "身份证号")
    @Pattern(regexp = ValidInfoConstant.ID_CARD_REGEXP, message = ValidInfoConstant.ID_CARD_REGEXP_MESSAGE)
    @Length(max = ValidInfoConstant.ID_CARD_LENGTH, message = ValidInfoConstant.ID_CARD_LENGTH_MESSAGE)
    private String idCard;

    @ApiModelProperty(value = "邮箱", example = "邮箱")
    @Length(max = ValidInfoConstant.EMAIL_LENGTH, message = ValidInfoConstant.EMAIL_LENGTH_MESSAGE)
    @Pattern(regexp = ValidInfoConstant.EMAIL_REGEXP, message = ValidInfoConstant.EMAIL_REGEXP_MESSAGE)
    private String email;

    @ApiModelProperty(value = "微信号", example = "微信号")
    @Length(max = ValidInfoConstant.WECHAT_LENGTH, message = ValidInfoConstant.WECHAT_LENGTH_MESSAGE)
    @Pattern(regexp = ValidInfoConstant.WECHAT_REGEXP, message = ValidInfoConstant.WECHAT_REGEXP_MESSAGE)
    private String wechat;

    @ApiModelProperty(value = "移动电话", example = "移动电话")
    @Length(max = ValidInfoConstant.PHONE_LENGTH, message = ValidInfoConstant.PHONE_LENGTH_MESSAGE)
    @Pattern(regexp = ValidInfoConstant.PHONE_REGEXP, message = ValidInfoConstant.PHONE_REGEXP_MESSAGE)
    private String phone;

    @ApiModelProperty(value = "住址", example = "住址")
    @Length(max = ValidInfoConstant.ADDRESS_LENGTH, message = ValidInfoConstant.ADDRESS_LENGTH_MESSAGE)
    private String address;

    @ApiModelProperty(value = "籍贯", example = "籍贯")
    private String origin;

}
