package com.ruoyi.staff.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 扩军目标对象 armsexpansion_target
 * 
 * @author ruoyi
 * @date 2022-07-27
 */
public class ArmsexpansionTarget extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 目标id */
    private Long targetId;

    /** 所属岗位id */
    @Excel(name = "所属岗位id")
    private Long occupationId;

    /** 目标数 */
    @Excel(name = "目标数")
    private Long targetNumber;

    /** 年份 */
    @Excel(name = "年份")
    private Long year;

    /** 月份 */
    @Excel(name = "月份")
    private Long month;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

    public void setTargetId(Long targetId) 
    {
        this.targetId = targetId;
    }

    public Long getTargetId() 
    {
        return targetId;
    }
    public void setOccupationId(Long occupationId) 
    {
        this.occupationId = occupationId;
    }

    public Long getOccupationId() 
    {
        return occupationId;
    }
    public void setTargetNumber(Long targetNumber) 
    {
        this.targetNumber = targetNumber;
    }

    public Long getTargetNumber() 
    {
        return targetNumber;
    }
    public void setYear(Long year) 
    {
        this.year = year;
    }

    public Long getYear() 
    {
        return year;
    }
    public void setMonth(Long month) 
    {
        this.month = month;
    }

    public Long getMonth() 
    {
        return month;
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
            .append("targetId", getTargetId())
            .append("occupationId", getOccupationId())
            .append("targetNumber", getTargetNumber())
            .append("year", getYear())
            .append("month", getMonth())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
