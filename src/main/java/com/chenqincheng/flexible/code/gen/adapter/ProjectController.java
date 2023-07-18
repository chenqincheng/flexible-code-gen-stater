package com.chenqincheng.flexible.code.gen.adapter;

import com.chenqincheng.flexible.code.gen.application.dto.LabelValueVO;
import com.chenqincheng.flexible.code.gen.application.dto.project.ProjectAddCmd;
import com.chenqincheng.flexible.code.gen.application.dto.project.ProjectEditCmd;
import com.chenqincheng.flexible.code.gen.application.dto.project.ProjectVO;
import com.chenqincheng.flexible.code.gen.application.service.IProjectService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 项目
 */
@RestController
@RequestMapping(value = "/project")
public class ProjectController {

    @Resource
    private IProjectService service;

    @PostMapping("")
    @Operation(summary = "新增")
    public Long add(@RequestBody ProjectAddCmd addCmd) {
        return service.add(addCmd);
    }

    @PutMapping("")
    @Operation(summary = "修改")
    public Long edit(@RequestBody ProjectEditCmd editCmd) {
        return service.edit(editCmd);
    }


    @GetMapping("/{id}")
    @Operation(summary = "详情")
    public ProjectVO get(@PathVariable Long id) {
        return service.get(id);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "删除")
    public Boolean remove(@PathVariable Long id) {
        return service.remove(id);
    }


    @GetMapping("/list")
    @Operation(summary = "下拉菜单")
    public List<LabelValueVO> dropdown(@RequestParam String keyword){
        return service.dropdown(keyword);
    }


}
