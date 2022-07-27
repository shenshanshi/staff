package com.ruoyi.staff.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.staff.mapper.ArmsexpansionMapper;
import com.ruoyi.staff.domain.Armsexpansion;
import com.ruoyi.staff.service.IArmsexpansionService;

/**
 * 扩军Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-07-27
 */
@Service
public class ArmsexpansionServiceImpl implements IArmsexpansionService 
{
    @Autowired
    private ArmsexpansionMapper armsexpansionMapper;

    /**
     * 查询扩军
     * 
     * @param armsexpansionId 扩军主键
     * @return 扩军
     */
    @Override
    public Armsexpansion selectArmsexpansionByArmsexpansionId(Long armsexpansionId)
    {
        return armsexpansionMapper.selectArmsexpansionByArmsexpansionId(armsexpansionId);
    }

    /**
     * 查询扩军列表
     * 
     * @param armsexpansion 扩军
     * @return 扩军
     */
    @Override
    public List<Armsexpansion> selectArmsexpansionList(Armsexpansion armsexpansion)
    {
        return armsexpansionMapper.selectArmsexpansionList(armsexpansion);
    }

    /**
     * 新增扩军
     * 
     * @param armsexpansion 扩军
     * @return 结果
     */
    @Override
    public int insertArmsexpansion(Armsexpansion armsexpansion)
    {
        armsexpansion.setCreateTime(DateUtils.getNowDate());
        return armsexpansionMapper.insertArmsexpansion(armsexpansion);
    }

    /**
     * 修改扩军
     * 
     * @param armsexpansion 扩军
     * @return 结果
     */
    @Override
    public int updateArmsexpansion(Armsexpansion armsexpansion)
    {
        armsexpansion.setUpdateTime(DateUtils.getNowDate());
        return armsexpansionMapper.updateArmsexpansion(armsexpansion);
    }

    /**
     * 批量删除扩军
     * 
     * @param armsexpansionIds 需要删除的扩军主键
     * @return 结果
     */
    @Override
    public int deleteArmsexpansionByArmsexpansionIds(Long[] armsexpansionIds)
    {
        return armsexpansionMapper.deleteArmsexpansionByArmsexpansionIds(armsexpansionIds);
    }

    /**
     * 删除扩军信息
     * 
     * @param armsexpansionId 扩军主键
     * @return 结果
     */
    @Override
    public int deleteArmsexpansionByArmsexpansionId(Long armsexpansionId)
    {
        return armsexpansionMapper.deleteArmsexpansionByArmsexpansionId(armsexpansionId);
    }
}
