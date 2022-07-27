package com.ruoyi.staff.mapper;

import java.util.List;
import com.ruoyi.staff.domain.EmploymentNature;

/**
 * 用工性质Mapper接口
 * 
 * @author ruoyi
 * @date 2022-07-27
 */
public interface EmploymentNatureMapper 
{
    /**
     * 查询用工性质
     * 
     * @param natureId 用工性质主键
     * @return 用工性质
     */
    public EmploymentNature selectEmploymentNatureByNatureId(Long natureId);

    /**
     * 查询用工性质列表
     * 
     * @param employmentNature 用工性质
     * @return 用工性质集合
     */
    public List<EmploymentNature> selectEmploymentNatureList(EmploymentNature employmentNature);

    /**
     * 新增用工性质
     * 
     * @param employmentNature 用工性质
     * @return 结果
     */
    public int insertEmploymentNature(EmploymentNature employmentNature);

    /**
     * 修改用工性质
     * 
     * @param employmentNature 用工性质
     * @return 结果
     */
    public int updateEmploymentNature(EmploymentNature employmentNature);

    /**
     * 删除用工性质
     * 
     * @param natureId 用工性质主键
     * @return 结果
     */
    public int deleteEmploymentNatureByNatureId(Long natureId);

    /**
     * 批量删除用工性质
     * 
     * @param natureIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteEmploymentNatureByNatureIds(Long[] natureIds);
}
