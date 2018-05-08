package com.rcloud.sample.entity.webmodel;

import com.rcloud.framework.common.entity.web.Model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("词典信息")
@SuppressWarnings("serial")
public class DictModel implements Model {

    /**
     * 词典标识
     */
    @ApiModelProperty(value = "词典标识", example = "graph.river")
    private String dictIdentify;

    /**
     * 词典名称
     */
    @ApiModelProperty(value = "词典名称", example = "图谱河流")
    private String dictName;

    /**
     * 词典类型 0-系统词典，1-自定义词典
     */
    @ApiModelProperty(value = "词典类型", example = "1")
    private Integer dictType;

}
