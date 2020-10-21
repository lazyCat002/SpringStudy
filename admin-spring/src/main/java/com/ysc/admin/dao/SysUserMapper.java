package com.ysc.admin.dao;

import com.ysc.admin.model.SysUser;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserMapper {
    SysUser Sel(int id);
    int AddUser(String account, String passWord, String name);
}
