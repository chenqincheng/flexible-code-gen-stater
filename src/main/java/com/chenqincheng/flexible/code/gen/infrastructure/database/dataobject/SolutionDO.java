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
@TableName(value = "solution")
public class SolutionDO {

    @TableId
    private Long id;

    /**
     * 方案id
     */
    @TableField(value = "solution_id")
    private Long solutionId;

    /**
     * 名称
     */
    private String name;


    /**
     * 别名
     */
    private String alias;


    /**
     * 模块编码
     */
    private String code;

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
