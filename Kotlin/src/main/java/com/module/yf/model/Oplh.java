package com.module.yf.model;

import java.util.Date;

public class Oplh {
    private Integer oplhId;

    private String oplhCptm;

    private String oplhWztm;

    private Date oplhKssj;

    private Date oplhJssj;

    private Integer oplhZtbz;

    private String oplhBldm;

    private String oplhSjry;

    private String oplhXjry;

    private Integer oplhGwbz;

    private Integer oplhGwnumber;

    private Date oplhGwks;

    private Date oplhGwjs;

    private Integer oplhIsfg;

    public Oplh(Integer oplhId, String oplhCptm, String oplhWztm, Date oplhKssj, Date oplhJssj, Integer oplhZtbz, String oplhBldm, String oplhSjry, String oplhXjry, Integer oplhGwbz, Integer oplhGwnumber, Date oplhGwks, Date oplhGwjs, Integer oplhIsfg) {
        this.oplhId = oplhId;
        this.oplhCptm = oplhCptm;
        this.oplhWztm = oplhWztm;
        this.oplhKssj = oplhKssj;
        this.oplhJssj = oplhJssj;
        this.oplhZtbz = oplhZtbz;
        this.oplhBldm = oplhBldm;
        this.oplhSjry = oplhSjry;
        this.oplhXjry = oplhXjry;
        this.oplhGwbz = oplhGwbz;
        this.oplhGwnumber = oplhGwnumber;
        this.oplhGwks = oplhGwks;
        this.oplhGwjs = oplhGwjs;
        this.oplhIsfg = oplhIsfg;
    }

    public Oplh() {
        super();
    }

    public Integer getOplhId() {
        return oplhId;
    }

    public void setOplhId(Integer oplhId) {
        this.oplhId = oplhId;
    }

    public String getOplhCptm() {
        return oplhCptm;
    }

    public void setOplhCptm(String oplhCptm) {
        this.oplhCptm = oplhCptm == null ? null : oplhCptm.trim();
    }

    public String getOplhWztm() {
        return oplhWztm;
    }

    public void setOplhWztm(String oplhWztm) {
        this.oplhWztm = oplhWztm == null ? null : oplhWztm.trim();
    }

    public Date getOplhKssj() {
        return oplhKssj;
    }

    public void setOplhKssj(Date oplhKssj) {
        this.oplhKssj = oplhKssj;
    }

    public Date getOplhJssj() {
        return oplhJssj;
    }

    public void setOplhJssj(Date oplhJssj) {
        this.oplhJssj = oplhJssj;
    }

    public Integer getOplhZtbz() {
        return oplhZtbz;
    }

    public void setOplhZtbz(Integer oplhZtbz) {
        this.oplhZtbz = oplhZtbz;
    }

    public String getOplhBldm() {
        return oplhBldm;
    }

    public void setOplhBldm(String oplhBldm) {
        this.oplhBldm = oplhBldm == null ? null : oplhBldm.trim();
    }

    public String getOplhSjry() {
        return oplhSjry;
    }

    public void setOplhSjry(String oplhSjry) {
        this.oplhSjry = oplhSjry == null ? null : oplhSjry.trim();
    }

    public String getOplhXjry() {
        return oplhXjry;
    }

    public void setOplhXjry(String oplhXjry) {
        this.oplhXjry = oplhXjry == null ? null : oplhXjry.trim();
    }

    public Integer getOplhGwbz() {
        return oplhGwbz;
    }

    public void setOplhGwbz(Integer oplhGwbz) {
        this.oplhGwbz = oplhGwbz;
    }

    public Integer getOplhGwnumber() {
        return oplhGwnumber;
    }

    public void setOplhGwnumber(Integer oplhGwnumber) {
        this.oplhGwnumber = oplhGwnumber;
    }

    public Date getOplhGwks() {
        return oplhGwks;
    }

    public void setOplhGwks(Date oplhGwks) {
        this.oplhGwks = oplhGwks;
    }

    public Date getOplhGwjs() {
        return oplhGwjs;
    }

    public void setOplhGwjs(Date oplhGwjs) {
        this.oplhGwjs = oplhGwjs;
    }

    public Integer getOplhIsfg() {
        return oplhIsfg;
    }

    public void setOplhIsfg(Integer oplhIsfg) {
        this.oplhIsfg = oplhIsfg;
    }
}