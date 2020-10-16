package com.ysc.admin.controller;

import com.ysc.admin.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("getUser/{id}")
    public String GetUser(@PathVariable int id){
        return sysUserService.Sel(id).toString();
    }

    @RequestMapping(value = "createUser",method = RequestMethod.POST)
    public int CreateUser(String account,String passWord,String name){
        return sysUserService.AddUser(account,passWord,name);
    }
}
