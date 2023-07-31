package com.chenqincheng.flexible.code.gen.application.service.impl;

import com.chenqincheng.flexible.code.gen.application.assembler.DomainAssembler;
import com.chenqincheng.flexible.code.gen.application.dto.LabelValueDto;
import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainAddCmd;
import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainEditCmd;
import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainDto;
import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainRequest;
import com.chenqincheng.flexible.code.gen.application.service.IDomainService;
import com.chenqincheng.flexible.code.gen.domain.domain.Domain;
import com.chenqincheng.flexible.code.gen.domain.gateway.DomainGateway;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class DomainServiceImpl implements IDomainService {

    @Resource
    private DomainGateway domainGateway;


    @Override
    public Long add(DomainAddCmd addCmd) {
        return domainGateway.add(addCmd);
    }

    @Override
    public boolean delete(Long id) {
        return domainGateway.delete(id);
    }

    @Override
    public DomainDto get(Long id) {
        Domain domain = domainGateway.get(id);
        return DomainAssembler.INSTANCE.domain2dto(domain);
    }

    @Override
    public boolean edit(DomainEditCmd editCmd) {
        return domainGateway.edit(editCmd);
    }

    @Override
    public PageInfo<DomainDto> page(DomainRequest request) {
        // 设置分页信息
        PageHelper.startPage(request.getPageNum(), request.getPageSize());

        // 获取原始数据列表
        List<DomainDto> domainList = domainGateway.list(request);

        // 构造 PageInfo，并保留原始的分页信息
        PageInfo<DomainDto> pageInfo = new PageInfo<>(domainList);
        return pageInfo;
    }

    @Override
    public List<LabelValueDto> dropdown(String keyword) {
        return domainGateway.dropdown(keyword);
    }
}
