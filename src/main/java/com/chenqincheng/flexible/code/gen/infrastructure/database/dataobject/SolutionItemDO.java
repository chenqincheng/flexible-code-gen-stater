package com.chenqincheng.flexible.code.gen.infrastructure.database.dataobject;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 域
 */
@Data
@TableName(value = "solution_item")
public class SolutionItemDO {

    @TableId
    private Long id;

    /**
     * 方案模块id
     */
    @TableField(value = "solution_module_id")
    private Long solutionModuleId;


    @TableField(value = "package_id")
    private Long packageId;

    @TableField(value = "template_id")
    private Long templateId;

    /**
     * 类型
     */
    private String name;

    /**
     * 类型
     */
    private String type;



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
