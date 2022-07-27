package com.ruoyi.staff.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 变动类型对象 change_type
 * 
 * @author ruoyi
 * @date 2022-07-27
 */
public class ChangeType extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 类型id */
    private Long typeId;

    /** 类型名 */
    @Excel(name = "类型名")
    private String typeName;

    /** 人员进出 */
    @Excel(name = "人员进出")
    private Long inandout;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

    public void setTypeId(Long typeId) 
    {
        this.typeId = typeId;
    }

    public Long getTypeId() 
    {
        return typeId;
    }
    public void setTypeName(String typeName) 
    {
        this.typeName = typeName;
    }

    public String getTypeName() 
    {
        return typeName;
    }
    public void setInandout(Long inandout) 
    {
        this.inandout = inandout;
    }

    public Long getInandout() 
    {
        return inandout;
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
            .append("typeId", getTypeId())
            .append("typeName", getTypeName())
            .append("inandout", getInandout())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
