package com.chenqincheng.flexible.code.gen.adapter;

import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainAddCmd;
import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainEditCmd;
import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainDto;
import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainRequest;
import com.chenqincheng.flexible.code.gen.application.service.IDomainService;
import com.github.pagehelper.PageInfo;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/edit")
    @Operation(summary = "更新")
    public boolean edit(@RequestBody @Valid DomainEditCmd editCmd) {
        return domainService.edit(editCmd);
    }


    @DeleteMapping("/{id}")
    @Operation(summary = "删除")
    public boolean delete(@PathVariable Long id) {
        return domainService.delete(id);
    }

    @GetMapping("/{id}")
    @Operation(summary = "获取")
    public DomainDto get(@PathVariable Long id) {
        return domainService.get(id);
    }

    @GetMapping("")
    @Operation(summary = "列表")
    public PageInfo<DomainDto> list(@RequestBody DomainRequest request) {
        return domainService.list(request);
    }


}
