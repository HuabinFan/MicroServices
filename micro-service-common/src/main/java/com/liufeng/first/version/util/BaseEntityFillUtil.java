package com.liufeng.first.version.util;

import com.liufeng.first.version.core.entitys.BaseEntity;

import java.util.Date;

/**
 * @author: HB
 * @dateTime: 2022/10/20 21:17
 * @WeChatAccount: Java技术与生活
 * @description: 填充基础实体信息
 */
public class BaseEntityFillUtil {

    public static void setBaseEntity(BaseEntity entity, boolean isCreate) {
        entity.setUpdateBy("");
        entity.setUpdateTime(new Date());
        if (isCreate) {
            entity.setCreateBy("");
            entity.setCreateTime(new Date());
        }
    }
}
