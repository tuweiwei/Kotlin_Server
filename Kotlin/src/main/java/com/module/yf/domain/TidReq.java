package com.module.yf.domain;

public class TidReq extends BaseReq {
    private String code;
    private String type;

    public TidReq() {
    }

    public TidReq(String code, String type) {
        this.code = code;
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public String getType() {
        return type;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setType(String type) {
        this.type = type;
    }
}