package com.ruoyi.staff.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.staff.mapper.StaffMapper;
import com.ruoyi.staff.domain.Staff;
import com.ruoyi.staff.service.IStaffService;

/**
 * 人员Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-07-27
 */
@Service
public class StaffServiceImpl implements IStaffService 
{
    @Autowired
    private StaffMapper staffMapper;

    /**
     * 查询人员
     * 
     * @param staffId 人员主键
     * @return 人员
     */
    @Override
    public Staff selectStaffByStaffId(Long staffId)
    {
        return staffMapper.selectStaffByStaffId(staffId);
    }

    /**
     * 查询人员列表
     * 
     * @param staff 人员
     * @return 人员
     */
    @Override
    public List<Staff> selectStaffList(Staff staff)
    {
        return staffMapper.selectStaffList(staff);
    }

    /**
     * 新增人员
     * 
     * @param staff 人员
     * @return 结果
     */
    @Override
    public int insertStaff(Staff staff)
    {
        staff.setCreateTime(DateUtils.getNowDate());
        return staffMapper.insertStaff(staff);
    }

    /**
     * 修改人员
     * 
     * @param staff 人员
     * @return 结果
     */
    @Override
    public int updateStaff(Staff staff)
    {
        staff.setUpdateTime(DateUtils.getNowDate());
        return staffMapper.updateStaff(staff);
    }

    /**
     * 批量删除人员
     * 
     * @param staffIds 需要删除的人员主键
     * @return 结果
     */
    @Override
    public int deleteStaffByStaffIds(Long[] staffIds)
    {
        return staffMapper.deleteStaffByStaffIds(staffIds);
    }

    /**
     * 删除人员信息
     * 
     * @param staffId 人员主键
     * @return 结果
     */
    @Override
    public int deleteStaffByStaffId(Long staffId)
    {
        return staffMapper.deleteStaffByStaffId(staffId);
    }
}
