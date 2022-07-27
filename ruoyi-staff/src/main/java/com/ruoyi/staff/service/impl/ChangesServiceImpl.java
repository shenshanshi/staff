package com.ruoyi.staff.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.staff.mapper.ChangesMapper;
import com.ruoyi.staff.domain.Changes;
import com.ruoyi.staff.service.IChangesService;

/**
 * 人员变动Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-07-27
 */
@Service
public class ChangesServiceImpl implements IChangesService 
{
    @Autowired
    private ChangesMapper changesMapper;

    /**
     * 查询人员变动
     * 
     * @param changeId 人员变动主键
     * @return 人员变动
     */
    @Override
    public Changes selectChangesByChangeId(Long changeId)
    {
        return changesMapper.selectChangesByChangeId(changeId);
    }

    /**
     * 查询人员变动列表
     * 
     * @param changes 人员变动
     * @return 人员变动
     */
    @Override
    public List<Changes> selectChangesList(Changes changes)
    {
        return changesMapper.selectChangesList(changes);
    }

    /**
     * 新增人员变动
     * 
     * @param changes 人员变动
     * @return 结果
     */
    @Override
    public int insertChanges(Changes changes)
    {
        changes.setCreateTime(DateUtils.getNowDate());
        return changesMapper.insertChanges(changes);
    }

    /**
     * 修改人员变动
     * 
     * @param changes 人员变动
     * @return 结果
     */
    @Override
    public int updateChanges(Changes changes)
    {
        changes.setUpdateTime(DateUtils.getNowDate());
        return changesMapper.updateChanges(changes);
    }

    /**
     * 批量删除人员变动
     * 
     * @param changeIds 需要删除的人员变动主键
     * @return 结果
     */
    @Override
    public int deleteChangesByChangeIds(Long[] changeIds)
    {
        return changesMapper.deleteChangesByChangeIds(changeIds);
    }

    /**
     * 删除人员变动信息
     * 
     * @param changeId 人员变动主键
     * @return 结果
     */
    @Override
    public int deleteChangesByChangeId(Long changeId)
    {
        return changesMapper.deleteChangesByChangeId(changeId);
    }
}
