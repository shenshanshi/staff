package com.ruoyi.staff.service;

import java.util.List;
import com.ruoyi.staff.domain.ChangeType;

/**
 * 变动类型Service接口
 * 
 * @author ruoyi
 * @date 2022-07-27
 */
public interface IChangeTypeService 
{
    /**
     * 查询变动类型
     * 
     * @param typeId 变动类型主键
     * @return 变动类型
     */
    public ChangeType selectChangeTypeByTypeId(Long typeId);

    /**
     * 查询变动类型列表
     * 
     * @param changeType 变动类型
     * @return 变动类型集合
     */
    public List<ChangeType> selectChangeTypeList(ChangeType changeType);

    /**
     * 新增变动类型
     * 
     * @param changeType 变动类型
     * @return 结果
     */
    public int insertChangeType(ChangeType changeType);

    /**
     * 修改变动类型
     * 
     * @param changeType 变动类型
     * @return 结果
     */
    public int updateChangeType(ChangeType changeType);

    /**
     * 批量删除变动类型
     * 
     * @param typeIds 需要删除的变动类型主键集合
     * @return 结果
     */
    public int deleteChangeTypeByTypeIds(Long[] typeIds);

    /**
     * 删除变动类型信息
     * 
     * @param typeId 变动类型主键
     * @return 结果
     */
    public int deleteChangeTypeByTypeId(Long typeId);
}
