package com.chenqincheng.flexible.code.gen.adapter;

import com.chenqincheng.flexible.code.gen.application.dto.LabelValueDto;
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
import java.util.List;

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

    @PutMapping("")
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

    @PostMapping("/page")
    @Operation(summary = "分页")
    public PageInfo<DomainDto> page(@RequestBody DomainRequest request) {
        return domainService.page(request);
    }

    @GetMapping("/dropdown")
    @Operation(summary = "下拉菜单")
    public List<LabelValueDto> dropdown(@RequestParam(required = false) String keyword){
        return domainService.dropdown(keyword);
    }


}
