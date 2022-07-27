package com.ruoyi.staff.mapper;

import com.ruoyi.common.core.domain.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM sys_user WHERE user_id = #{id}")
    SysUser getUserById(@Param("id") Long id);

}
