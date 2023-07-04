package com.chenqincheng.flexible.code.gen.infrastructure.database.dataobject;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 包
 */
@Data
@TableName(value = "package")
public class PackageDO {

    @TableId
    private Long id;

    @TableField(value = "parent_id")
    private Long parentId;

    private String alias;

    private String path;

    @TableLogic
    private Integer dr;

    @TableField(value = "update_time")
    private Date updateTime;

    @TableField(value = "create_time")
    private Date createTime;
}
