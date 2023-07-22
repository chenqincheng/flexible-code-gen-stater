package com.chenqincheng.flexible.code.gen.adapter;

import com.chenqincheng.flexible.code.gen.application.dto.LabelValueDto;
import com.chenqincheng.flexible.code.gen.application.dto.template.TemplateAddCmd;
import com.chenqincheng.flexible.code.gen.application.dto.template.TemplateVO;
import com.chenqincheng.flexible.code.gen.application.service.ITemplateService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 模板
 */
@RestController
@RequestMapping(value = "/template")
public class TemplateController {

    @Resource
    private ITemplateService templateService;

    @PostMapping("")
    @Operation(summary = "新增")
    public Long add(@RequestBody TemplateAddCmd addCommand) {
        return templateService.add(addCommand);
    }


    @PutMapping("")
    @Operation(summary = "修改")
    public Long edit(@RequestBody TemplateAddCmd addCommand) {
        return templateService.edit(addCommand);
    }


    @GetMapping("/{id}")
    @Operation(summary = "新增")
    public TemplateVO query(@PathVariable Long id) {
        return templateService.query(id);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "删除")
    public TemplateVO remove(@PathVariable Long id) {
        return templateService.remove(id);
    }


    @GetMapping("/list")
    @Operation(summary = "下拉菜单")
    public List<LabelValueDto> dropdown(@RequestParam String keyword){
        return templateService.dropdown(keyword);
    }


}
