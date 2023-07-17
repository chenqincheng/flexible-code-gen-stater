package com.chenqincheng.flexible.code.gen.application.dto;

import com.chenqincheng.flexible.code.gen.application.dto.template.TemplateGenCmd;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
public class SingleTableGenCmd {
    @Schema(name = "表名")
    private Long tableName;

    @Schema(name = "生成内容集合")
    private List<TemplateGenCmd> genList;

}
