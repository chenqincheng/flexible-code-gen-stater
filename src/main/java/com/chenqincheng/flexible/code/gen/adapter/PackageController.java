package com.chenqincheng.flexible.code.gen.adapter;

import com.chenqincheng.flexible.code.gen.application.dto.LabelValueDto;
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
import java.util.List;

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

    @PutMapping("")
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
    public PageInfo<PackageDto> page(@RequestBody PackageRequest request) {
        return packageService.page(request);
    }


    @GetMapping("/dropdown")
    @Operation(summary = "下拉菜单")
    public List<LabelValueDto> dropdown(@RequestParam(required = false) String keyword){
        return packageService.dropdown(keyword);
    }

}
