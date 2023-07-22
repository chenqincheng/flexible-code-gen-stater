package com.chenqincheng.flexible.code.gen.adapter;

import com.chenqincheng.flexible.code.gen.application.dto.LabelValueDto;
import com.chenqincheng.flexible.code.gen.application.dto.service.ServiceAddCmd;
import com.chenqincheng.flexible.code.gen.application.dto.service.ServiceEditCmd;
import com.chenqincheng.flexible.code.gen.application.dto.service.ServiceVO;
import com.chenqincheng.flexible.code.gen.application.service.IServiceService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * 服务
 */
@RestController
@RequestMapping(value = "/service")
public class ServiceController {

    @Resource
    private IServiceService serviceService;

    @PostMapping("")
    @Operation(summary = "新增")
    public Long add(@RequestBody @Valid ServiceAddCmd addCmd) {
        return serviceService.add(addCmd);
    }

    @PutMapping("")
    @Operation(summary = "修改")
    public Long edit(@RequestBody ServiceEditCmd editCmd) {
        return serviceService.edit(editCmd);
    }


    @GetMapping("/{id}")
    @Operation(summary = "新增")
    public ServiceVO get(@PathVariable Long id) {
        return serviceService.get(id);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "删除")
    public Boolean remove(@PathVariable Long id) {
        return serviceService.remove(id);
    }


    @GetMapping("/list")
    @Operation(summary = "下拉菜单")
    public List<LabelValueDto> dropdown(@RequestParam String keyword){
        return serviceService.dropdown(keyword);
    }


}
