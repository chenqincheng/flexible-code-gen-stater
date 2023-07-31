package com.chenqincheng.flexible.code.gen.adapter;

import com.chenqincheng.flexible.code.gen.application.dto.LabelValueDto;
import com.chenqincheng.flexible.code.gen.application.dto.project.ProjectAddCmd;
import com.chenqincheng.flexible.code.gen.application.dto.project.ProjectEditCmd;
import com.chenqincheng.flexible.code.gen.application.dto.project.ProjectDto;
import com.chenqincheng.flexible.code.gen.application.dto.project.ProjectRequest;
import com.chenqincheng.flexible.code.gen.application.service.IProjectService;
import com.github.pagehelper.PageInfo;
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
    private IProjectService projectService;

    @PostMapping("")
    @Operation(summary = "新增")
    public Long add(@RequestBody ProjectAddCmd addCmd) {
        return projectService.add(addCmd);
    }

    @PutMapping("")
    @Operation(summary = "修改")
    public Long edit(@RequestBody ProjectEditCmd editCmd) {
        return projectService.edit(editCmd);
    }



    @GetMapping("/{id}")
    @Operation(summary = "详情")
    public ProjectDto get(@PathVariable Long id) {
        return projectService.get(id);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "删除")
    public Boolean remove(@PathVariable Long id) {
        return projectService.remove(id);
    }

    @GetMapping("/dropdown")
    @Operation(summary = "下拉菜单")
    public List<LabelValueDto> dropdown(@RequestParam(required = false) String keyword){
        return projectService.dropdown(keyword);
    }

    @PostMapping("/page")
    @Operation(summary = "分页")
    public PageInfo<ProjectDto> page(@RequestBody ProjectRequest request){
        return projectService.page(request);
    }


}
