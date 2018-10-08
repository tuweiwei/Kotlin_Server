package com.module.yf.model;

import java.util.Date;

public class TidModel {
    private Integer tidId;

    private String tidTm;

    private Date tidTime;

    private Integer tidZtbz;

    private Date tidJlrq;

    private String tidJlry;

    private Integer tidExpirespan;

    private Date tidExpiredate;

    private String tidBz;

    public TidModel(Integer tidId, String tidTm, Date tidTime, Integer tidZtbz, Date tidJlrq, String tidJlry, Integer tidExpirespan, Date tidExpiredate, String tidBz) {
        this.tidId = tidId;
        this.tidTm = tidTm;
        this.tidTime = tidTime;
        this.tidZtbz = tidZtbz;
        this.tidJlrq = tidJlrq;
        this.tidJlry = tidJlry;
        this.tidExpirespan = tidExpirespan;
        this.tidExpiredate = tidExpiredate;
        this.tidBz = tidBz;
    }

    public TidModel(String tidTm, Integer tidZtbz, Date tidJlrq, String tidJlry, String tidBz) {
        this.tidTm = tidTm;
        this.tidZtbz = tidZtbz;
        this.tidJlrq = tidJlrq;
        this.tidJlry = tidJlry;
        this.tidBz = tidBz;
    }

    public TidModel() {
        super();
    }

    public Integer getTidId() {
        return tidId;
    }

    public void setTidId(Integer tidId) {
        this.tidId = tidId;
    }

    public String getTidTm() {
        return tidTm;
    }

    public void setTidTm(String tidTm) {
        this.tidTm = tidTm == null ? null : tidTm.trim();
    }

    public Date getTidTime() {
        return tidTime;
    }

    public void setTidTime(Date tidTime) {
        this.tidTime = tidTime;
    }

    public Integer getTidZtbz() {
        return tidZtbz;
    }

    public void setTidZtbz(Integer tidZtbz) {
        this.tidZtbz = tidZtbz;
    }

    public Date getTidJlrq() {
        return tidJlrq;
    }

    public void setTidJlrq(Date tidJlrq) {
        this.tidJlrq = tidJlrq;
    }

    public String getTidJlry() {
        return tidJlry;
    }

    public void setTidJlry(String tidJlry) {
        this.tidJlry = tidJlry == null ? null : tidJlry.trim();
    }

    public Integer getTidExpirespan() {
        return tidExpirespan;
    }

    public void setTidExpirespan(Integer tidExpirespan) {
        this.tidExpirespan = tidExpirespan;
    }

    public Date getTidExpiredate() {
        return tidExpiredate;
    }

    public void setTidExpiredate(Date tidExpiredate) {
        this.tidExpiredate = tidExpiredate;
    }

    public String getTidBz() {
        return tidBz;
    }

    public void setTidBz(String tidBz) {
        this.tidBz = tidBz == null ? null : tidBz.trim();
    }
}