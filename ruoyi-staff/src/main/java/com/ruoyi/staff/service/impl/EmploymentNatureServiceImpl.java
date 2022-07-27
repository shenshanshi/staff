package com.ruoyi.staff.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.staff.mapper.EmploymentNatureMapper;
import com.ruoyi.staff.domain.EmploymentNature;
import com.ruoyi.staff.service.IEmploymentNatureService;

/**
 * 用工性质Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-07-27
 */
@Service
public class EmploymentNatureServiceImpl implements IEmploymentNatureService 
{
    @Autowired
    private EmploymentNatureMapper employmentNatureMapper;

    /**
     * 查询用工性质
     * 
     * @param natureId 用工性质主键
     * @return 用工性质
     */
    @Override
    public EmploymentNature selectEmploymentNatureByNatureId(Long natureId)
    {
        return employmentNatureMapper.selectEmploymentNatureByNatureId(natureId);
    }

    /**
     * 查询用工性质列表
     * 
     * @param employmentNature 用工性质
     * @return 用工性质
     */
    @Override
    public List<EmploymentNature> selectEmploymentNatureList(EmploymentNature employmentNature)
    {
        return employmentNatureMapper.selectEmploymentNatureList(employmentNature);
    }

    /**
     * 新增用工性质
     * 
     * @param employmentNature 用工性质
     * @return 结果
     */
    @Override
    public int insertEmploymentNature(EmploymentNature employmentNature)
    {
        employmentNature.setCreateTime(DateUtils.getNowDate());
        return employmentNatureMapper.insertEmploymentNature(employmentNature);
    }

    /**
     * 修改用工性质
     * 
     * @param employmentNature 用工性质
     * @return 结果
     */
    @Override
    public int updateEmploymentNature(EmploymentNature employmentNature)
    {
        employmentNature.setUpdateTime(DateUtils.getNowDate());
        return employmentNatureMapper.updateEmploymentNature(employmentNature);
    }

    /**
     * 批量删除用工性质
     * 
     * @param natureIds 需要删除的用工性质主键
     * @return 结果
     */
    @Override
    public int deleteEmploymentNatureByNatureIds(Long[] natureIds)
    {
        return employmentNatureMapper.deleteEmploymentNatureByNatureIds(natureIds);
    }

    /**
     * 删除用工性质信息
     * 
     * @param natureId 用工性质主键
     * @return 结果
     */
    @Override
    public int deleteEmploymentNatureByNatureId(Long natureId)
    {
        return employmentNatureMapper.deleteEmploymentNatureByNatureId(natureId);
    }
}
