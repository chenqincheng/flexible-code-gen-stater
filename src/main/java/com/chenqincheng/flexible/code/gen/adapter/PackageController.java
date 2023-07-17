package com.chenqincheng.flexible.code.gen.adapter;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 包名
 */
@RestController
@RequestMapping(value = "/package")
public class PackageController {

    @PostMapping("")
    @Operation(summary = "新增")
    public Long add() {
        return null;
    }


}
