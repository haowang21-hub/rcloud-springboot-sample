package com.rcloud.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rcloud.framework.common.controller.CrudController;
import com.rcloud.framework.common.service.BaseService;
import com.rcloud.sample.entity.Dict;
import com.rcloud.sample.entity.webmodel.DictModel;
import com.rcloud.sample.service.DictService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/dict")
@Api("词典维护")
public class DictController implements CrudController<Dict, Integer, DictModel> {

    @Autowired
    private DictService dictService;

    @Override
    public BaseService<Dict, Integer> getService() {
        return dictService;
    }
    
}
