package com.ruoyi.staff.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.staff.mapper.OccupationMapper;
import com.ruoyi.staff.domain.Occupation;
import com.ruoyi.staff.service.IOccupationService;

/**
 * occupationService业务层处理
 * 
 * @author ruoyi
 * @date 2022-07-27
 */
@Service
public class OccupationServiceImpl implements IOccupationService 
{
    @Autowired
    private OccupationMapper occupationMapper;

    /**
     * 查询occupation
     * 
     * @param occupationId occupation主键
     * @return occupation
     */
    @Override
    public Occupation selectOccupationByOccupationId(Long occupationId)
    {
        return occupationMapper.selectOccupationByOccupationId(occupationId);
    }

    /**
     * 查询occupation列表
     * 
     * @param occupation occupation
     * @return occupation
     */
    @Override
    public List<Occupation> selectOccupationList(Occupation occupation)
    {
        return occupationMapper.selectOccupationList(occupation);
    }

    /**
     * 新增occupation
     * 
     * @param occupation occupation
     * @return 结果
     */
    @Override
    public int insertOccupation(Occupation occupation)
    {
        occupation.setCreateTime(DateUtils.getNowDate());
        return occupationMapper.insertOccupation(occupation);
    }

    /**
     * 修改occupation
     * 
     * @param occupation occupation
     * @return 结果
     */
    @Override
    public int updateOccupation(Occupation occupation)
    {
        occupation.setUpdateTime(DateUtils.getNowDate());
        return occupationMapper.updateOccupation(occupation);
    }

    /**
     * 批量删除occupation
     * 
     * @param occupationIds 需要删除的occupation主键
     * @return 结果
     */
    @Override
    public int deleteOccupationByOccupationIds(Long[] occupationIds)
    {
        return occupationMapper.deleteOccupationByOccupationIds(occupationIds);
    }

    /**
     * 删除occupation信息
     * 
     * @param occupationId occupation主键
     * @return 结果
     */
    @Override
    public int deleteOccupationByOccupationId(Long occupationId)
    {
        return occupationMapper.deleteOccupationByOccupationId(occupationId);
    }
}
