package com.ruoyi.staff.mapper;

import java.util.List;
import com.ruoyi.staff.domain.Staff;

/**
 * 人员Mapper接口
 * 
 * @author ruoyi
 * @date 2022-07-27
 */
public interface StaffMapper 
{
    /**
     * 查询人员
     * 
     * @param staffId 人员主键
     * @return 人员
     */
    public Staff selectStaffByStaffId(Long staffId);

    /**
     * 查询人员列表
     * 
     * @param staff 人员
     * @return 人员集合
     */
    public List<Staff> selectStaffList(Staff staff);

    /**
     * 新增人员
     * 
     * @param staff 人员
     * @return 结果
     */
    public int insertStaff(Staff staff);

    /**
     * 修改人员
     * 
     * @param staff 人员
     * @return 结果
     */
    public int updateStaff(Staff staff);

    /**
     * 删除人员
     * 
     * @param staffId 人员主键
     * @return 结果
     */
    public int deleteStaffByStaffId(Long staffId);

    /**
     * 批量删除人员
     * 
     * @param staffIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteStaffByStaffIds(Long[] staffIds);
}
