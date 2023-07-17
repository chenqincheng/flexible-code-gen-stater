package com.chenqincheng.flexible.code.gen.application.service.impl;

import com.chenqincheng.flexible.code.gen.application.dto.LabelValueVO;
import com.chenqincheng.flexible.code.gen.application.dto.service.ServiceAddCmd;
import com.chenqincheng.flexible.code.gen.application.dto.service.ServiceEditCmd;
import com.chenqincheng.flexible.code.gen.application.dto.service.ServiceVO;
import com.chenqincheng.flexible.code.gen.application.service.IServiceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceServiceImpl implements IServiceService {


    @Override
    public Long add(ServiceAddCmd addCmd) {
        return null;
    }

    @Override
    public Long edit(ServiceEditCmd editCmd) {
        return null;
    }

    @Override
    public ServiceVO get(Long id) {
        return null;
    }

    @Override
    public Boolean remove(Long id) {
        return null;
    }

    @Override
    public List<LabelValueVO> dropdown(String keyword) {
        return null;
    }
}
