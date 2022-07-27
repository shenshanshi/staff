package com.ruoyi.staff.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.staff.mapper.ArmsexpansionTargetMapper;
import com.ruoyi.staff.domain.ArmsexpansionTarget;
import com.ruoyi.staff.service.IArmsexpansionTargetService;

/**
 * 扩军目标Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-07-27
 */
@Service
public class ArmsexpansionTargetServiceImpl implements IArmsexpansionTargetService 
{
    @Autowired
    private ArmsexpansionTargetMapper armsexpansionTargetMapper;

    /**
     * 查询扩军目标
     * 
     * @param targetId 扩军目标主键
     * @return 扩军目标
     */
    @Override
    public ArmsexpansionTarget selectArmsexpansionTargetByTargetId(Long targetId)
    {
        return armsexpansionTargetMapper.selectArmsexpansionTargetByTargetId(targetId);
    }

    /**
     * 查询扩军目标列表
     * 
     * @param armsexpansionTarget 扩军目标
     * @return 扩军目标
     */
    @Override
    public List<ArmsexpansionTarget> selectArmsexpansionTargetList(ArmsexpansionTarget armsexpansionTarget)
    {
        return armsexpansionTargetMapper.selectArmsexpansionTargetList(armsexpansionTarget);
    }

    /**
     * 新增扩军目标
     * 
     * @param armsexpansionTarget 扩军目标
     * @return 结果
     */
    @Override
    public int insertArmsexpansionTarget(ArmsexpansionTarget armsexpansionTarget)
    {
        armsexpansionTarget.setCreateTime(DateUtils.getNowDate());
        return armsexpansionTargetMapper.insertArmsexpansionTarget(armsexpansionTarget);
    }

    /**
     * 修改扩军目标
     * 
     * @param armsexpansionTarget 扩军目标
     * @return 结果
     */
    @Override
    public int updateArmsexpansionTarget(ArmsexpansionTarget armsexpansionTarget)
    {
        armsexpansionTarget.setUpdateTime(DateUtils.getNowDate());
        return armsexpansionTargetMapper.updateArmsexpansionTarget(armsexpansionTarget);
    }

    /**
     * 批量删除扩军目标
     * 
     * @param targetIds 需要删除的扩军目标主键
     * @return 结果
     */
    @Override
    public int deleteArmsexpansionTargetByTargetIds(Long[] targetIds)
    {
        return armsexpansionTargetMapper.deleteArmsexpansionTargetByTargetIds(targetIds);
    }

    /**
     * 删除扩军目标信息
     * 
     * @param targetId 扩军目标主键
     * @return 结果
     */
    @Override
    public int deleteArmsexpansionTargetByTargetId(Long targetId)
    {
        return armsexpansionTargetMapper.deleteArmsexpansionTargetByTargetId(targetId);
    }
}
