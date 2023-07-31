package com.chenqincheng.flexible.code.gen.domain.pack.age;

import com.chenqincheng.flexible.code.gen.domain.DomainFactory;
import com.chenqincheng.flexible.code.gen.domain.Entity;
import com.chenqincheng.flexible.code.gen.domain.gateway.PackageGateway;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Resource;

@Data
@NoArgsConstructor
@Entity
@Slf4j
public class Package {

    /**
     * id
     */
    private Long id;

    /**
     * 父id
     */
    private Long parentId;

    /**
     * 名称
     */
    private String name;


    /**
     * 编码
     */
    private String code;


    /**
     * 别名
     */
    private String alias;


    /**
     * 路径
     */
    private String path;

    /**
     * 描述
     */
    private String description;

    /**
     * 是否删除
     */
    private Boolean isDeleted;


    @Resource
    private PackageGateway packageGateway;


    public boolean edit() {
        return packageGateway.edit(this);
    }

    public static Package valueOf() {
        Package account = DomainFactory.get(Package.class);
        return account;
    }

}
