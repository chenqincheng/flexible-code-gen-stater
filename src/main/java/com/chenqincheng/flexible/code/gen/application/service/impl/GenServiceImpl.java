package com.chenqincheng.flexible.code.gen.application.service.impl;

import com.chenqincheng.flexible.code.gen.application.dto.SingleFile;
import com.chenqincheng.flexible.code.gen.application.dto.SingleFileGenCmd;
import com.chenqincheng.flexible.code.gen.application.service.IGenService;
import org.springframework.stereotype.Service;

@Service
public class GenServiceImpl implements IGenService {



    @Override
    public Boolean genSingleFile(SingleFileGenCmd genCmd) {
        SingleFile singleFile = new SingleFile();


        return null;
    }
}
