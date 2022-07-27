package com.ruoyi.staff.service;

import java.util.List;
import com.ruoyi.staff.domain.Sysusertocompany;

/**
 * 用户单位关联Service接口
 * 
 * @author ruoyi
 * @date 2022-07-27
 */
public interface ISysusertocompanyService 
{
    /**
     * 查询用户单位关联
     * 
     * @param uid 用户单位关联主键
     * @return 用户单位关联
     */
    public Sysusertocompany selectSysusertocompanyByUid(Long uid);

    /**
     * 查询用户单位关联列表
     * 
     * @param sysusertocompany 用户单位关联
     * @return 用户单位关联集合
     */
    public List<Sysusertocompany> selectSysusertocompanyList(Sysusertocompany sysusertocompany);

    /**
     * 新增用户单位关联
     * 
     * @param sysusertocompany 用户单位关联
     * @return 结果
     */
    public int insertSysusertocompany(Sysusertocompany sysusertocompany);

    /**
     * 修改用户单位关联
     * 
     * @param sysusertocompany 用户单位关联
     * @return 结果
     */
    public int updateSysusertocompany(Sysusertocompany sysusertocompany);

    /**
     * 批量删除用户单位关联
     * 
     * @param uids 需要删除的用户单位关联主键集合
     * @return 结果
     */
    public int deleteSysusertocompanyByUids(Long[] uids);

    /**
     * 删除用户单位关联信息
     * 
     * @param uid 用户单位关联主键
     * @return 结果
     */
    public int deleteSysusertocompanyByUid(Long uid);
}
