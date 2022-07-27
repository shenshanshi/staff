package com.ruoyi.staff.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 用工性质对象 employment_nature
 * 
 * @author ruoyi
 * @date 2022-07-27
 */
public class EmploymentNature extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 性质id */
    private Long natureId;

    /** 性质名 */
    @Excel(name = "性质名")
    private String natureName;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

    public void setNatureId(Long natureId) 
    {
        this.natureId = natureId;
    }

    public Long getNatureId() 
    {
        return natureId;
    }
    public void setNatureName(String natureName) 
    {
        this.natureName = natureName;
    }

    public String getNatureName() 
    {
        return natureName;
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
            .append("natureId", getNatureId())
            .append("natureName", getNatureName())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
