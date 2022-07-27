package com.ruoyi.staff.controller;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.system.service.ISysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("用户管理")
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired
    private ISysUserService userService;


    @ApiOperation("修改密码")
    @PutMapping("/updataPwd")
    public AjaxResult updataPwd(@Param("username") String username,
                                @Param("oldPassword") String oldPassword,
                                @Param("newPassword") String newPassword){



        if(null == username || "".equals(username))
            return AjaxResult.error("用户名不能为空");

        if(null == oldPassword || "".equals(oldPassword))
            return AjaxResult.error("旧密码不能为空");

        if(null == newPassword || newPassword.length() < 6)
            return AjaxResult.error("新密码不能少于6位");

        SysUser user = userService.selectUserByUserName(username);

        if (user == null) return AjaxResult.error("该用户不存在");

        String password = user.getPassword();

//        System.out.println(password);
//        System.out.println(SecurityUtils.matchesPassword(newPassword, password));

        if (!SecurityUtils.matchesPassword(oldPassword, password))
        {
            return AjaxResult.error("修改密码失败，旧密码错误");
        }
        if (SecurityUtils.matchesPassword(newPassword, password))
        {
            return AjaxResult.error("新密码不能与旧密码相同");
        }



        if (userService.resetUserPwd(username, SecurityUtils.encryptPassword(newPassword)) > 0)
        {
            return AjaxResult.success("修改密码成功");
        }
        return AjaxResult.error("修改密码异常，请联系管理员");


    }






}
