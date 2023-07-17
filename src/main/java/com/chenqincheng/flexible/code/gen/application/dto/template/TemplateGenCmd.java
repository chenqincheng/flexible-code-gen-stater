package com.chenqincheng.flexible.code.gen.application.dto.template;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
public class TemplateGenCmd {

    @Schema(name = "模板id")
    private Long templateId;

    @Schema(name = "服务id")
    private Long serviceId;

    @Schema(name = "包名id")
    private Long packageId;

    @Schema(name = "生成id集合")
    private List<Long> columns;
}
