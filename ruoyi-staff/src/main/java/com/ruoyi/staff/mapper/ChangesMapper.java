package com.ruoyi.staff.mapper;

import java.util.List;
import com.ruoyi.staff.domain.Changes;

/**
 * 人员变动Mapper接口
 * 
 * @author ruoyi
 * @date 2022-07-27
 */
public interface ChangesMapper 
{
    /**
     * 查询人员变动
     * 
     * @param changeId 人员变动主键
     * @return 人员变动
     */
    public Changes selectChangesByChangeId(Long changeId);

    /**
     * 查询人员变动列表
     * 
     * @param changes 人员变动
     * @return 人员变动集合
     */
    public List<Changes> selectChangesList(Changes changes);

    /**
     * 新增人员变动
     * 
     * @param changes 人员变动
     * @return 结果
     */
    public int insertChanges(Changes changes);

    /**
     * 修改人员变动
     * 
     * @param changes 人员变动
     * @return 结果
     */
    public int updateChanges(Changes changes);

    /**
     * 删除人员变动
     * 
     * @param changeId 人员变动主键
     * @return 结果
     */
    public int deleteChangesByChangeId(Long changeId);

    /**
     * 批量删除人员变动
     * 
     * @param changeIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteChangesByChangeIds(Long[] changeIds);
}
