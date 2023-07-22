package com.chenqincheng.flexible.code.gen.adapter;

import com.chenqincheng.flexible.code.gen.application.dto.SingleFileGenCmd;
import com.chenqincheng.flexible.code.gen.application.dto.SingleTableGenCmd;
import com.chenqincheng.flexible.code.gen.application.service.IGenService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/gen")
public class GenController {

    @Resource
    private IGenService genService;


    @PostMapping("/single-file")
    @Operation(summary = "单文件生成")
    public Boolean singleFile(@RequestBody SingleFileGenCmd genCmd) {
        return genService.genSingleFile(genCmd);
    }


    @PostMapping("/single-table")
    @Operation(summary = "单表生成")
    public Long singleTable(@RequestBody SingleTableGenCmd genCmd) {
        return null;
    }

}
