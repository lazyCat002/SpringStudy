package com.ysc.admin.model;

public class SysUser {
    private Integer id;
    private String account;
    private String passWord;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "account='" + account + '\'' +
                ", passWord='" + passWord + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
