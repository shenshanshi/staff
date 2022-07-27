package com.ruoyi.staff.service;

import java.util.List;
import com.ruoyi.staff.domain.Company;

/**
 * 单位Service接口
 * 
 * @author ruoyi
 * @date 2022-07-27
 */
public interface ICompanyService 
{
    /**
     * 查询单位
     * 
     * @param companyId 单位主键
     * @return 单位
     */
    public Company selectCompanyByCompanyId(Long companyId);

    /**
     * 查询单位列表
     * 
     * @param company 单位
     * @return 单位集合
     */
    public List<Company> selectCompanyList(Company company);

    /**
     * 新增单位
     * 
     * @param company 单位
     * @return 结果
     */
    public int insertCompany(Company company);

    /**
     * 修改单位
     * 
     * @param company 单位
     * @return 结果
     */
    public int updateCompany(Company company);

    /**
     * 批量删除单位
     * 
     * @param companyIds 需要删除的单位主键集合
     * @return 结果
     */
    public int deleteCompanyByCompanyIds(Long[] companyIds);

    /**
     * 删除单位信息
     * 
     * @param companyId 单位主键
     * @return 结果
     */
    public int deleteCompanyByCompanyId(Long companyId);
}
