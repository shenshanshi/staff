package com.ruoyi.staff.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 人员变动对象 changes
 * 
 * @author ruoyi
 * @date 2022-07-27
 */
public class Changes extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 变动id */
    private Long changeId;

    /** 人员id */
    @Excel(name = "人员id")
    private Long staffId;

    /** 所属单位id */
    @Excel(name = "所属单位id")
    private Long companyId;

    /** 用工性质id */
    @Excel(name = "用工性质id")
    private Long natureId;

    /** 变动类型id */
    @Excel(name = "变动类型id")
    private Long typeId;

    /** 变动日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "变动日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date changeDate;

    /** 备注 */
    @Excel(name = "备注")
    private String changeRemarks;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

    public void setChangeId(Long changeId) 
    {
        this.changeId = changeId;
    }

    public Long getChangeId() 
    {
        return changeId;
    }
    public void setStaffId(Long staffId) 
    {
        this.staffId = staffId;
    }

    public Long getStaffId() 
    {
        return staffId;
    }
    public void setCompanyId(Long companyId) 
    {
        this.companyId = companyId;
    }

    public Long getCompanyId() 
    {
        return companyId;
    }
    public void setNatureId(Long natureId) 
    {
        this.natureId = natureId;
    }

    public Long getNatureId() 
    {
        return natureId;
    }
    public void setTypeId(Long typeId) 
    {
        this.typeId = typeId;
    }

    public Long getTypeId() 
    {
        return typeId;
    }
    public void setChangeDate(Date changeDate) 
    {
        this.changeDate = changeDate;
    }

    public Date getChangeDate() 
    {
        return changeDate;
    }
    public void setChangeRemarks(String changeRemarks) 
    {
        this.changeRemarks = changeRemarks;
    }

    public String getChangeRemarks() 
    {
        return changeRemarks;
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
            .append("changeId", getChangeId())
            .append("staffId", getStaffId())
            .append("companyId", getCompanyId())
            .append("natureId", getNatureId())
            .append("typeId", getTypeId())
            .append("changeDate", getChangeDate())
            .append("changeRemarks", getChangeRemarks())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
