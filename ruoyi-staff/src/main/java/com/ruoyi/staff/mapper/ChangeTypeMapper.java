package com.ruoyi.staff.mapper;

import java.util.List;
import com.ruoyi.staff.domain.ChangeType;

/**
 * 变动类型Mapper接口
 * 
 * @author ruoyi
 * @date 2022-07-27
 */
public interface ChangeTypeMapper 
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
     * 删除变动类型
     * 
     * @param typeId 变动类型主键
     * @return 结果
     */
    public int deleteChangeTypeByTypeId(Long typeId);

    /**
     * 批量删除变动类型
     * 
     * @param typeIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteChangeTypeByTypeIds(Long[] typeIds);
}
