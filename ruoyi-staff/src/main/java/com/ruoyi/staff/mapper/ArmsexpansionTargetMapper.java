package com.ruoyi.staff.mapper;

import java.util.List;
import com.ruoyi.staff.domain.ArmsexpansionTarget;

/**
 * 扩军目标Mapper接口
 * 
 * @author ruoyi
 * @date 2022-07-27
 */
public interface ArmsexpansionTargetMapper 
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
     * 删除扩军目标
     * 
     * @param targetId 扩军目标主键
     * @return 结果
     */
    public int deleteArmsexpansionTargetByTargetId(Long targetId);

    /**
     * 批量删除扩军目标
     * 
     * @param targetIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteArmsexpansionTargetByTargetIds(Long[] targetIds);
}
