package com.ruoyi.staff.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.staff.mapper.SysusertocompanyMapper;
import com.ruoyi.staff.domain.Sysusertocompany;
import com.ruoyi.staff.service.ISysusertocompanyService;

/**
 * 用户单位关联Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-07-27
 */
@Service
public class SysusertocompanyServiceImpl implements ISysusertocompanyService 
{
    @Autowired
    private SysusertocompanyMapper sysusertocompanyMapper;

    /**
     * 查询用户单位关联
     * 
     * @param uid 用户单位关联主键
     * @return 用户单位关联
     */
    @Override
    public Sysusertocompany selectSysusertocompanyByUid(Long uid)
    {
        return sysusertocompanyMapper.selectSysusertocompanyByUid(uid);
    }

    /**
     * 查询用户单位关联列表
     * 
     * @param sysusertocompany 用户单位关联
     * @return 用户单位关联
     */
    @Override
    public List<Sysusertocompany> selectSysusertocompanyList(Sysusertocompany sysusertocompany)
    {
        return sysusertocompanyMapper.selectSysusertocompanyList(sysusertocompany);
    }

    /**
     * 新增用户单位关联
     * 
     * @param sysusertocompany 用户单位关联
     * @return 结果
     */
    @Override
    public int insertSysusertocompany(Sysusertocompany sysusertocompany)
    {
        sysusertocompany.setCreateTime(DateUtils.getNowDate());
        return sysusertocompanyMapper.insertSysusertocompany(sysusertocompany);
    }

    /**
     * 修改用户单位关联
     * 
     * @param sysusertocompany 用户单位关联
     * @return 结果
     */
    @Override
    public int updateSysusertocompany(Sysusertocompany sysusertocompany)
    {
        sysusertocompany.setUpdateTime(DateUtils.getNowDate());
        return sysusertocompanyMapper.updateSysusertocompany(sysusertocompany);
    }

    /**
     * 批量删除用户单位关联
     * 
     * @param uids 需要删除的用户单位关联主键
     * @return 结果
     */
    @Override
    public int deleteSysusertocompanyByUids(Long[] uids)
    {
        return sysusertocompanyMapper.deleteSysusertocompanyByUids(uids);
    }

    /**
     * 删除用户单位关联信息
     * 
     * @param uid 用户单位关联主键
     * @return 结果
     */
    @Override
    public int deleteSysusertocompanyByUid(Long uid)
    {
        return sysusertocompanyMapper.deleteSysusertocompanyByUid(uid);
    }
}
