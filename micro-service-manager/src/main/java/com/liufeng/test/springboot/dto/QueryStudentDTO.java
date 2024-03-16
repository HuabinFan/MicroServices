package com.liufeng.test.springboot.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author: HB
 * @dateTime: 2022/9/7 19:28
 * @wechatAccount: Java技术与生活
 * @description: 查询学生信息DTO类，包括模糊搜索和高级搜索
 */
@Data
public class QueryStudentDTO implements Serializable {

    /**
     * 在Mapper映射中需要写模糊查询的条件
     */
    @ApiModelProperty(value = "模糊查询条件", example = "学号/身份证号/微信号")
    private String matchParam;

    /**
     * 下边字段用于高级搜索
     */
    @ApiModelProperty(value = "性别", example = "性别")
    private String gender;

    @ApiModelProperty(value = "籍贯", example = "籍贯")
    private String origin;

}
