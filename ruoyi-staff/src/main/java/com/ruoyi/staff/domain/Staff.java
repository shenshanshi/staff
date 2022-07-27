package com.ruoyi.staff.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 人员对象 staff
 * 
 * @author ruoyi
 * @date 2022-07-27
 */
public class Staff extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 人员id */
    private Long staffId;

    /** 姓名 */
    @Excel(name = "姓名")
    private String staffName;

    /** 人力编码 */
    @Excel(name = "人力编码")
    private String manpowernumber;

    /** 性别 */
    @Excel(name = "性别")
    private Long sex;

    /** 学历 */
    @Excel(name = "学历")
    private String educationalbackground;

    /** 毕业学校 */
    @Excel(name = "毕业学校")
    private String graduationschool;

    /** 入职时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "入职时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date entrytime;

    /** 出生年月 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "出生年月", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birthday;

    /** 是否党员 */
    @Excel(name = "是否党员")
    private String ispartymember;

    /** 人员编码 */
    @Excel(name = "人员编码")
    private String personnelcode;

    /** 岗位id */
    @Excel(name = "岗位id")
    private Long occupationId;

    /** 所属单位id */
    @Excel(name = "所属单位id")
    private Long companyId;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

    public void setStaffId(Long staffId) 
    {
        this.staffId = staffId;
    }

    public Long getStaffId() 
    {
        return staffId;
    }
    public void setStaffName(String staffName) 
    {
        this.staffName = staffName;
    }

    public String getStaffName() 
    {
        return staffName;
    }
    public void setManpowernumber(String manpowernumber) 
    {
        this.manpowernumber = manpowernumber;
    }

    public String getManpowernumber() 
    {
        return manpowernumber;
    }
    public void setSex(Long sex) 
    {
        this.sex = sex;
    }

    public Long getSex() 
    {
        return sex;
    }
    public void setEducationalbackground(String educationalbackground) 
    {
        this.educationalbackground = educationalbackground;
    }

    public String getEducationalbackground() 
    {
        return educationalbackground;
    }
    public void setGraduationschool(String graduationschool) 
    {
        this.graduationschool = graduationschool;
    }

    public String getGraduationschool() 
    {
        return graduationschool;
    }
    public void setEntrytime(Date entrytime) 
    {
        this.entrytime = entrytime;
    }

    public Date getEntrytime() 
    {
        return entrytime;
    }
    public void setBirthday(Date birthday) 
    {
        this.birthday = birthday;
    }

    public Date getBirthday() 
    {
        return birthday;
    }
    public void setIspartymember(String ispartymember) 
    {
        this.ispartymember = ispartymember;
    }

    public String getIspartymember() 
    {
        return ispartymember;
    }
    public void setPersonnelcode(String personnelcode) 
    {
        this.personnelcode = personnelcode;
    }

    public String getPersonnelcode() 
    {
        return personnelcode;
    }
    public void setOccupationId(Long occupationId) 
    {
        this.occupationId = occupationId;
    }

    public Long getOccupationId() 
    {
        return occupationId;
    }
    public void setCompanyId(Long companyId) 
    {
        this.companyId = companyId;
    }

    public Long getCompanyId() 
    {
        return companyId;
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
            .append("staffId", getStaffId())
            .append("staffName", getStaffName())
            .append("manpowernumber", getManpowernumber())
            .append("sex", getSex())
            .append("educationalbackground", getEducationalbackground())
            .append("graduationschool", getGraduationschool())
            .append("entrytime", getEntrytime())
            .append("birthday", getBirthday())
            .append("ispartymember", getIspartymember())
            .append("personnelcode", getPersonnelcode())
            .append("occupationId", getOccupationId())
            .append("companyId", getCompanyId())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
