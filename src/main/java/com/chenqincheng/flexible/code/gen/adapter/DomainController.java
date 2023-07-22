package com.chenqincheng.flexible.code.gen.adapter;

import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainAddCmd;
import com.chenqincheng.flexible.code.gen.application.service.IDomainService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * 域
 */
@RestController
@RequestMapping(value = "/domain")
public class DomainController {

    @Resource
    private IDomainService domainService;


    @PostMapping("")
    @Operation(summary = "新增")
    public Long add(@RequestBody @Valid DomainAddCmd addCmd) {
        return domainService.add(addCmd);
    }

    /**
     * 写更新、删除、查询等接口
     */
    public void update() {
    }

    public void delete() {
    }


    public void get() {
    }


}
