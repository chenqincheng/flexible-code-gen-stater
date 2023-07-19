package com.chenqincheng.flexible.code.gen.infrastructure.database.dataobject;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName(value = "project")
public class ServiceDO {

    @TableId
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 编码
     */
    private String code;


    /**
     * 描述
     */
    @TableField(value = "description")
    private String description;

    @TableLogic(value = "0", delval = "1")
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
