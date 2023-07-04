package com.chenqincheng.flexible.code.gen.infrastructure.database.dataobject;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 域名
 */
@Data
@TableName(value = "domain_name")
public class DomainNameDO {

    @TableId
    private Long id;

    private String alias;

    private String path;

    @TableLogic
    private Integer dr;

    @TableField(value = "update_time")
    private Date updateTime;

    @TableField(value = "update_time")
    private Date createTime;

}
