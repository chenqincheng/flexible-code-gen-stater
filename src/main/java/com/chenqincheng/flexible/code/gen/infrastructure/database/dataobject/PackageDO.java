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

    @TableField(value = "name")
    private String name;

    @TableField(value = "code")
    private String code;

    @TableField(value = "parent_id")
    private Long parentId;

    @TableField(value = "alias")
    private String alias;

    @TableField(value = "path")
    private String path;

    @TableField(value = "description")
    private String description;

    @TableLogic
    private Integer is_deleted;

    @TableField(value = "created_at")
    private Date createdAt;

    @TableField(value = "created_by")
    private Long createdBy;

    @TableField(value = "updated_at")
    private Date updatedAt;

    @TableField(value = "updated_by")
    private Long updatedBy;
}
