package com.chenqincheng.flexible.code.gen.adapter;

import com.chenqincheng.flexible.code.gen.application.dto.SingleTableGenCmd;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/gen")
public class GenController {


    @PostMapping("/single-table")
    @Operation(summary = "新增")
    public Long add(@RequestBody SingleTableGenCmd genCmd) {
        return null;
    }


}
