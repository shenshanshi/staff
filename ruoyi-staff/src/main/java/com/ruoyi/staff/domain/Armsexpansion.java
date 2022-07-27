package com.ruoyi.staff.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 扩军对象 armsexpansion
 * 
 * @author ruoyi
 * @date 2022-07-27
 */
public class Armsexpansion extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 扩军id */
    private Long armsexpansionId;

    /** 扩军名 */
    @Excel(name = "扩军名")
    private String armsexpansionName;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

    public void setArmsexpansionId(Long armsexpansionId) 
    {
        this.armsexpansionId = armsexpansionId;
    }

    public Long getArmsexpansionId() 
    {
        return armsexpansionId;
    }
    public void setArmsexpansionName(String armsexpansionName) 
    {
        this.armsexpansionName = armsexpansionName;
    }

    public String getArmsexpansionName() 
    {
        return armsexpansionName;
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
            .append("armsexpansionId", getArmsexpansionId())
            .append("armsexpansionName", getArmsexpansionName())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
