package com.module.yf.domain;

public class ScanForLineReq extends BaseReq {
    private String devNo;
    private String code;
    private String bltm;
    private String userID;
    private String isfg;
    private String isxnfg;

    public String getDevNo() {
        return devNo;
    }

    public void setDevNo(String devNo) {
        this.devNo = devNo;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBltm() {
        return bltm;
    }

    public void setBltm(String bltm) {
        this.bltm = bltm;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getIsfg() {
        return isfg;
    }

    public void setIsfg(String isfg) {
        this.isfg = isfg;
    }

    public String getIsxnfg() {
        return isxnfg;
    }

    public void setIsxnfg(String isxnfg) {
        this.isxnfg = isxnfg;
    }
}