package com.ysc.admin.service;

import com.ysc.admin.dao.SysUserMapper;
import com.ysc.admin.model.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserService {
    @Autowired
    SysUserMapper sysUserMapper;
    public SysUser Sel(int id){
        return sysUserMapper.Sel(id);
    }

    public int AddUser(String account, String passWord, String name)
    {
        return  sysUserMapper.AddUser(account,passWord,name);
    }
}
