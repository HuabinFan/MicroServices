package com.liufeng.test.springboot.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.liufeng.first.version.entitys.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @author: HB
 * @dateTime: 2022/8/26 14:12
 * @WeChatAccount: Java技术与生活
 * @description: 学生实体
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName(value = "sbd_student")
public class Student extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @ApiModelProperty(value = "学生编码")
    private String code;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "学号")
    @TableField(value = "student_no")
    private String stuNo;

    @ApiModelProperty(value = "性别")
    private Character gender;

    @ApiModelProperty(value = "出生日期")
    private Date birthday;

    @ApiModelProperty(value = "身份证号")
    @TableField(value = "ID_CARD")
    private String idCard;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "微信号")
    private String wechat;

    @ApiModelProperty(value = "移动电话")
    private String phone;

    @ApiModelProperty(value = "住址")
    private String address;

    @ApiModelProperty(value = "籍贯")
    private String origin;

    @TableLogic
    private String deleteFlag;

}
