package com.chenqincheng.flexible.code.gen.adapter;

import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainDto;
import com.chenqincheng.flexible.code.gen.application.dto.pack.age.PackageAddCmd;
import com.chenqincheng.flexible.code.gen.application.dto.pack.age.PackageDto;
import com.chenqincheng.flexible.code.gen.application.dto.pack.age.PackageEditCmd;
import com.chenqincheng.flexible.code.gen.application.dto.pack.age.PackageRequest;
import com.chenqincheng.flexible.code.gen.application.service.IPackageService;
import com.github.pagehelper.PageInfo;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * 包名
 */
@RestController
@RequestMapping(value = "/package")
public class PackageController {

    @Resource
    private IPackageService packageService;

    @PostMapping("")
    @Operation(summary = "新增")
    public Long add(@RequestBody @Valid PackageAddCmd addCmd) {
        return packageService.add(addCmd);
    }

    @PostMapping("/edit")
    @Operation(summary = "更新")
    public boolean edit(@RequestBody @Valid PackageEditCmd editCmd) {
        return packageService.edit(editCmd);
    }


    @DeleteMapping("/{id}")
    @Operation(summary = "删除")
    public boolean delete(@PathVariable Long id) {
        return packageService.delete(id);
    }

    @GetMapping("/{id}")
    @Operation(summary = "获取")
    public DomainDto get(@PathVariable Long id) {
        return packageService.get(id);
    }

    @GetMapping("")
    @Operation(summary = "列表")
    public PageInfo<PackageDto> list(@RequestBody PackageRequest request) {
        return packageService.list(request);
    }

}
