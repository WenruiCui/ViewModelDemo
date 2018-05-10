package com.wenrui.newaspreviewjava.ui.main;

/**
 * author:崔文睿
 * mail:cuiwenrui@meituan.com
 * Created on 2018/5/10
 */
public class User {

    private int userId;
    private String userName;

    public User() {
        this.userId = 0;
        this.userName = "";
    }

    public User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void increaseId() {
        this.userId++;
    }
}
