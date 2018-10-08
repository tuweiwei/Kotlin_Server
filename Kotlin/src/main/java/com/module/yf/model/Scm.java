package com.module.yf.model;

import java.util.Date;

public class Scm {
    private String scmDm;

    private String scmMc;

    private String scmLb;

    private String scmZldm;

    private String scmGzdm;

    private String scmXbdm;

    private String scmNo;

    private String scmCzry;

    private Boolean scmZtbz;

    private Date scmJlrq;

    private String scmJlry;

    private Date scmGgrq;

    private String scmGgry;

    private String scmBz;

    private Integer scmId;

    private String scmMsg;

    private String scmTxt;

    public Scm(String scmDm, String scmMc, String scmLb, String scmZldm, String scmGzdm, String scmXbdm, String scmNo, String scmCzry, Boolean scmZtbz, Date scmJlrq, String scmJlry, Date scmGgrq, String scmGgry, String scmBz, Integer scmId, String scmMsg, String scmTxt) {
        this.scmDm = scmDm;
        this.scmMc = scmMc;
        this.scmLb = scmLb;
        this.scmZldm = scmZldm;
        this.scmGzdm = scmGzdm;
        this.scmXbdm = scmXbdm;
        this.scmNo = scmNo;
        this.scmCzry = scmCzry;
        this.scmZtbz = scmZtbz;
        this.scmJlrq = scmJlrq;
        this.scmJlry = scmJlry;
        this.scmGgrq = scmGgrq;
        this.scmGgry = scmGgry;
        this.scmBz = scmBz;
        this.scmId = scmId;
        this.scmMsg = scmMsg;
        this.scmTxt = scmTxt;
    }

    public Scm() {
        super();
    }

    public String getScmDm() {
        return scmDm;
    }

    public void setScmDm(String scmDm) {
        this.scmDm = scmDm == null ? null : scmDm.trim();
    }

    public String getScmMc() {
        return scmMc;
    }

    public void setScmMc(String scmMc) {
        this.scmMc = scmMc == null ? null : scmMc.trim();
    }

    public String getScmLb() {
        return scmLb;
    }

    public void setScmLb(String scmLb) {
        this.scmLb = scmLb == null ? null : scmLb.trim();
    }

    public String getScmZldm() {
        return scmZldm;
    }

    public void setScmZldm(String scmZldm) {
        this.scmZldm = scmZldm == null ? null : scmZldm.trim();
    }

    public String getScmGzdm() {
        return scmGzdm;
    }

    public void setScmGzdm(String scmGzdm) {
        this.scmGzdm = scmGzdm == null ? null : scmGzdm.trim();
    }

    public String getScmXbdm() {
        return scmXbdm;
    }

    public void setScmXbdm(String scmXbdm) {
        this.scmXbdm = scmXbdm == null ? null : scmXbdm.trim();
    }

    public String getScmNo() {
        return scmNo;
    }

    public void setScmNo(String scmNo) {
        this.scmNo = scmNo == null ? null : scmNo.trim();
    }

    public String getScmCzry() {
        return scmCzry;
    }

    public void setScmCzry(String scmCzry) {
        this.scmCzry = scmCzry == null ? null : scmCzry.trim();
    }

    public Boolean getScmZtbz() {
        return scmZtbz;
    }

    public void setScmZtbz(Boolean scmZtbz) {
        this.scmZtbz = scmZtbz;
    }

    public Date getScmJlrq() {
        return scmJlrq;
    }

    public void setScmJlrq(Date scmJlrq) {
        this.scmJlrq = scmJlrq;
    }

    public String getScmJlry() {
        return scmJlry;
    }

    public void setScmJlry(String scmJlry) {
        this.scmJlry = scmJlry == null ? null : scmJlry.trim();
    }

    public Date getScmGgrq() {
        return scmGgrq;
    }

    public void setScmGgrq(Date scmGgrq) {
        this.scmGgrq = scmGgrq;
    }

    public String getScmGgry() {
        return scmGgry;
    }

    public void setScmGgry(String scmGgry) {
        this.scmGgry = scmGgry == null ? null : scmGgry.trim();
    }

    public String getScmBz() {
        return scmBz;
    }

    public void setScmBz(String scmBz) {
        this.scmBz = scmBz == null ? null : scmBz.trim();
    }

    public Integer getScmId() {
        return scmId;
    }

    public void setScmId(Integer scmId) {
        this.scmId = scmId;
    }

    public String getScmMsg() {
        return scmMsg;
    }

    public void setScmMsg(String scmMsg) {
        this.scmMsg = scmMsg == null ? null : scmMsg.trim();
    }

    public String getScmTxt() {
        return scmTxt;
    }

    public void setScmTxt(String scmTxt) {
        this.scmTxt = scmTxt == null ? null : scmTxt.trim();
    }
}