package com.ruoyi.staff.mapper;

import java.util.List;
import com.ruoyi.staff.domain.Armsexpansion;

/**
 * 扩军Mapper接口
 * 
 * @author ruoyi
 * @date 2022-07-27
 */
public interface ArmsexpansionMapper 
{
    /**
     * 查询扩军
     * 
     * @param armsexpansionId 扩军主键
     * @return 扩军
     */
    public Armsexpansion selectArmsexpansionByArmsexpansionId(Long armsexpansionId);

    /**
     * 查询扩军列表
     * 
     * @param armsexpansion 扩军
     * @return 扩军集合
     */
    public List<Armsexpansion> selectArmsexpansionList(Armsexpansion armsexpansion);

    /**
     * 新增扩军
     * 
     * @param armsexpansion 扩军
     * @return 结果
     */
    public int insertArmsexpansion(Armsexpansion armsexpansion);

    /**
     * 修改扩军
     * 
     * @param armsexpansion 扩军
     * @return 结果
     */
    public int updateArmsexpansion(Armsexpansion armsexpansion);

    /**
     * 删除扩军
     * 
     * @param armsexpansionId 扩军主键
     * @return 结果
     */
    public int deleteArmsexpansionByArmsexpansionId(Long armsexpansionId);

    /**
     * 批量删除扩军
     * 
     * @param armsexpansionIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteArmsexpansionByArmsexpansionIds(Long[] armsexpansionIds);
}
