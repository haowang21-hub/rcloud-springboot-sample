package com.rcloud.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.rcloud.framework.common.service.BaseService;
import com.rcloud.sample.entity.Dict;
import com.rcloud.sample.mapper.TBusiCogDictMapper;
import com.rcloud.springboot.datasource.TargetDataSource;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author wanghao
 * @since 2018-03-19
 */
@Service
@TargetDataSource("robot")
public class DictService implements BaseService<Dict, Integer> {

    @Autowired
    TBusiCogDictMapper dictMapper;

    public BaseMapper<Dict> getMapper() {
        return dictMapper;
    }

    public int updateByPk(Integer id, Dict data) {
        return 0;
    }
}
