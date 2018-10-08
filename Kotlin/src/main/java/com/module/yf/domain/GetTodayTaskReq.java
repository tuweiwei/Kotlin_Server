package com.module.yf.domain;

public class GetTodayTaskReq extends BaseReq {
    private String userName;
    private String date;

    public GetTodayTaskReq() {
    }

    public GetTodayTaskReq(String userName, String date) {
        this.userName = userName;
        this.date = date;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}