package com.chenqincheng.flexible.code.gen.adapter;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 模板分类
 */
@RestController
@RequestMapping(value = "/template/category")
public class TemplateCategoryController {

    @PostMapping("")
    @Operation(summary = "新增")
    public Long add() {
        return null;
    }


}
