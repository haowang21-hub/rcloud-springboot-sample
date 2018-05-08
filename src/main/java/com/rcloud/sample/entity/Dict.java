package com.rcloud.sample.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * <p>
 * </p>
 *
 * @author wanghao
 * @since 2018-03-19
 */
@TableName("T_BUSI_COG_DICT")
public class Dict implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID自增长
     */
    @TableId(value = "dict_id", type = IdType.AUTO)
    private Integer dictId;
    /**
     * 词典标识
     */
    private String dictIdentify;
    /**
     * 词典名称
     */
    private String dictName;
    /**
     * 词典类型 0-系统词典，1-自定义词典
     */
    private Integer dictType;
    /**
     * 创建时间
     */
    private Date crtDt;
    /**
     * 最后修改时间
     */
    private Date updDt;
    /**
     * 备注
     */
    private String nt;

    public Integer getDictId() {
        return dictId;
    }

    public void setDictId(Integer dictId) {
        this.dictId = dictId;
    }

    public String getDictIdentify() {
        return dictIdentify;
    }

    public void setDictIdentify(String dictIdentify) {
        this.dictIdentify = dictIdentify;
    }

    public String getDictName() {
        return dictName;
    }

    public void setDictName(String dictName) {
        this.dictName = dictName;
    }

    public Integer getDictType() {
        return dictType;
    }

    public void setDictType(Integer dictType) {
        this.dictType = dictType;
    }

    public Date getCrtDt() {
        return crtDt;
    }

    public void setCrtDt(Date crtDt) {
        this.crtDt = crtDt;
    }

    public Date getUpdDt() {
        return updDt;
    }

    public void setUpdDt(Date updDt) {
        this.updDt = updDt;
    }

    public String getNt() {
        return nt;
    }

    public void setNt(String nt) {
        this.nt = nt;
    }

    @Override
    public String toString() {
        return "TBusiCogDict{" + ", dictId=" + dictId + ", dictIdentify=" + dictIdentify + ", dictName=" + dictName
            + ", dictType=" + dictType + ", crtDt=" + crtDt + ", updDt=" + updDt + ", nt=" + nt + "}";
    }
}
