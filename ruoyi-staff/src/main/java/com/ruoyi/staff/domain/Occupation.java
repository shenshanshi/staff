package com.ruoyi.staff.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * occupation对象 occupation
 * 
 * @author ruoyi
 * @date 2022-07-27
 */
public class Occupation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 岗位id */
    private Long occupationId;

    /** 岗位名 */
    @Excel(name = "岗位名")
    private String occupationName;

    /** 所属扩军id */
    @Excel(name = "所属扩军id")
    private Long armsexpansionId;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

    public void setOccupationId(Long occupationId) 
    {
        this.occupationId = occupationId;
    }

    public Long getOccupationId() 
    {
        return occupationId;
    }
    public void setOccupationName(String occupationName) 
    {
        this.occupationName = occupationName;
    }

    public String getOccupationName() 
    {
        return occupationName;
    }
    public void setArmsexpansionId(Long armsexpansionId) 
    {
        this.armsexpansionId = armsexpansionId;
    }

    public Long getArmsexpansionId() 
    {
        return armsexpansionId;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("occupationId", getOccupationId())
            .append("occupationName", getOccupationName())
            .append("armsexpansionId", getArmsexpansionId())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
