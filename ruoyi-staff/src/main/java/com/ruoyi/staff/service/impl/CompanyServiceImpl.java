package com.ruoyi.staff.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.staff.mapper.CompanyMapper;
import com.ruoyi.staff.domain.Company;
import com.ruoyi.staff.service.ICompanyService;

/**
 * 单位Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-07-27
 */
@Service
public class CompanyServiceImpl implements ICompanyService 
{
    @Autowired
    private CompanyMapper companyMapper;

    /**
     * 查询单位
     * 
     * @param companyId 单位主键
     * @return 单位
     */
    @Override
    public Company selectCompanyByCompanyId(Long companyId)
    {
        return companyMapper.selectCompanyByCompanyId(companyId);
    }

    /**
     * 查询单位列表
     * 
     * @param company 单位
     * @return 单位
     */
    @Override
    public List<Company> selectCompanyList(Company company)
    {
        return companyMapper.selectCompanyList(company);
    }

    /**
     * 新增单位
     * 
     * @param company 单位
     * @return 结果
     */
    @Override
    public int insertCompany(Company company)
    {
        company.setCreateTime(DateUtils.getNowDate());
        return companyMapper.insertCompany(company);
    }

    /**
     * 修改单位
     * 
     * @param company 单位
     * @return 结果
     */
    @Override
    public int updateCompany(Company company)
    {
        company.setUpdateTime(DateUtils.getNowDate());
        return companyMapper.updateCompany(company);
    }

    /**
     * 批量删除单位
     * 
     * @param companyIds 需要删除的单位主键
     * @return 结果
     */
    @Override
    public int deleteCompanyByCompanyIds(Long[] companyIds)
    {
        return companyMapper.deleteCompanyByCompanyIds(companyIds);
    }

    /**
     * 删除单位信息
     * 
     * @param companyId 单位主键
     * @return 结果
     */
    @Override
    public int deleteCompanyByCompanyId(Long companyId)
    {
        return companyMapper.deleteCompanyByCompanyId(companyId);
    }
}
