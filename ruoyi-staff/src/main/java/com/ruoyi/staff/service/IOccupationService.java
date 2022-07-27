package com.ruoyi.staff.service;

import java.util.List;
import com.ruoyi.staff.domain.Occupation;

/**
 * occupationService接口
 * 
 * @author ruoyi
 * @date 2022-07-27
 */
public interface IOccupationService 
{
    /**
     * 查询occupation
     * 
     * @param occupationId occupation主键
     * @return occupation
     */
    public Occupation selectOccupationByOccupationId(Long occupationId);

    /**
     * 查询occupation列表
     * 
     * @param occupation occupation
     * @return occupation集合
     */
    public List<Occupation> selectOccupationList(Occupation occupation);

    /**
     * 新增occupation
     * 
     * @param occupation occupation
     * @return 结果
     */
    public int insertOccupation(Occupation occupation);

    /**
     * 修改occupation
     * 
     * @param occupation occupation
     * @return 结果
     */
    public int updateOccupation(Occupation occupation);

    /**
     * 批量删除occupation
     * 
     * @param occupationIds 需要删除的occupation主键集合
     * @return 结果
     */
    public int deleteOccupationByOccupationIds(Long[] occupationIds);

    /**
     * 删除occupation信息
     * 
     * @param occupationId occupation主键
     * @return 结果
     */
    public int deleteOccupationByOccupationId(Long occupationId);
}
