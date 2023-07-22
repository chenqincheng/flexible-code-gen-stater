package com.chenqincheng.flexible.code.gen.application.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class LabelValueDto {

    @Schema(name = "文案")
    private String label;

    @Schema(name = "值")
    private String value;

}
