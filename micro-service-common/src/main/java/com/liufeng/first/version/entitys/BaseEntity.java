package com.liufeng.first.version.entitys;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.liufeng.first.version.annotations.IgnoreRegisterField;
import com.liufeng.first.version.constants.DateTimeConstant;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: HB
 * @dateTime: 2022/8/26 10:46
 * @WeChatAccount: Java技术与生活
 * @description: 数据库基础实体类
 */
@Data
public class BaseEntity implements Serializable {

    @IgnoreRegisterField
    @ApiModelProperty(value = "备注信息")
    private String remark;

    @IgnoreRegisterField
    @ApiModelProperty(value = "创建人")
    private String createBy;

    @IgnoreRegisterField
    @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern = DateTimeConstant.DEFAULT_TIME_PATTERN)
    private Date createTime;

    @IgnoreRegisterField
    @ApiModelProperty(value = "修改人")
    private String updateBy;

    @IgnoreRegisterField
    @ApiModelProperty(value = "修改时间")
    @JsonFormat(pattern = DateTimeConstant.DEFAULT_TIME_PATTERN)
    private Date updateTime;

}
