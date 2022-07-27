package com.ruoyi.staff.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.staff.mapper.ChangeTypeMapper;
import com.ruoyi.staff.domain.ChangeType;
import com.ruoyi.staff.service.IChangeTypeService;

/**
 * 变动类型Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-07-27
 */
@Service
public class ChangeTypeServiceImpl implements IChangeTypeService 
{
    @Autowired
    private ChangeTypeMapper changeTypeMapper;

    /**
     * 查询变动类型
     * 
     * @param typeId 变动类型主键
     * @return 变动类型
     */
    @Override
    public ChangeType selectChangeTypeByTypeId(Long typeId)
    {
        return changeTypeMapper.selectChangeTypeByTypeId(typeId);
    }

    /**
     * 查询变动类型列表
     * 
     * @param changeType 变动类型
     * @return 变动类型
     */
    @Override
    public List<ChangeType> selectChangeTypeList(ChangeType changeType)
    {
        return changeTypeMapper.selectChangeTypeList(changeType);
    }

    /**
     * 新增变动类型
     * 
     * @param changeType 变动类型
     * @return 结果
     */
    @Override
    public int insertChangeType(ChangeType changeType)
    {
        changeType.setCreateTime(DateUtils.getNowDate());
        return changeTypeMapper.insertChangeType(changeType);
    }

    /**
     * 修改变动类型
     * 
     * @param changeType 变动类型
     * @return 结果
     */
    @Override
    public int updateChangeType(ChangeType changeType)
    {
        changeType.setUpdateTime(DateUtils.getNowDate());
        return changeTypeMapper.updateChangeType(changeType);
    }

    /**
     * 批量删除变动类型
     * 
     * @param typeIds 需要删除的变动类型主键
     * @return 结果
     */
    @Override
    public int deleteChangeTypeByTypeIds(Long[] typeIds)
    {
        return changeTypeMapper.deleteChangeTypeByTypeIds(typeIds);
    }

    /**
     * 删除变动类型信息
     * 
     * @param typeId 变动类型主键
     * @return 结果
     */
    @Override
    public int deleteChangeTypeByTypeId(Long typeId)
    {
        return changeTypeMapper.deleteChangeTypeByTypeId(typeId);
    }
}
