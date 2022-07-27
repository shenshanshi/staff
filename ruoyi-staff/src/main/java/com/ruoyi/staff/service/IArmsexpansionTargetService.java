package com.ruoyi.staff.service;

import java.util.List;
import com.ruoyi.staff.domain.ArmsexpansionTarget;

/**
 * 扩军目标Service接口
 * 
 * @author ruoyi
 * @date 2022-07-27
 */
public interface IArmsexpansionTargetService 
{
    /**
     * 查询扩军目标
     * 
     * @param targetId 扩军目标主键
     * @return 扩军目标
     */
    public ArmsexpansionTarget selectArmsexpansionTargetByTargetId(Long targetId);

    /**
     * 查询扩军目标列表
     * 
     * @param armsexpansionTarget 扩军目标
     * @return 扩军目标集合
     */
    public List<ArmsexpansionTarget> selectArmsexpansionTargetList(ArmsexpansionTarget armsexpansionTarget);

    /**
     * 新增扩军目标
     * 
     * @param armsexpansionTarget 扩军目标
     * @return 结果
     */
    public int insertArmsexpansionTarget(ArmsexpansionTarget armsexpansionTarget);

    /**
     * 修改扩军目标
     * 
     * @param armsexpansionTarget 扩军目标
     * @return 结果
     */
    public int updateArmsexpansionTarget(ArmsexpansionTarget armsexpansionTarget);

    /**
     * 批量删除扩军目标
     * 
     * @param targetIds 需要删除的扩军目标主键集合
     * @return 结果
     */
    public int deleteArmsexpansionTargetByTargetIds(Long[] targetIds);

    /**
     * 删除扩军目标信息
     * 
     * @param targetId 扩军目标主键
     * @return 结果
     */
    public int deleteArmsexpansionTargetByTargetId(Long targetId);
}
