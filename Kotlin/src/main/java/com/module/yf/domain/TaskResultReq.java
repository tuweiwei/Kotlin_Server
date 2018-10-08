package com.module.yf.domain;

import com.module.yf.model.InspectionTask;

import java.util.Date;

public class TaskResultReq extends BaseReq {
    private Integer taskid;

    private String equipno;

    private String frequency;

    private String item;

    private String itemValue;

    private String username;

    private String result;

    private String remark;

    private String image;

    public TaskResultReq() {
    }

    public TaskResultReq(Integer taskid, String equipno, String frequency, String item, String itemValue, String username, String result, String remark,String image) {
        this.taskid = taskid;
        this.equipno = equipno;
        this.frequency = frequency;
        this.item = item;
        this.itemValue = itemValue;
        this.username = username;
        this.result = result;
        this.remark = remark;
        this.image = image;
    }

    public Integer getTaskid() {
        return taskid;
    }

    public void setTaskid(Integer taskid) {
        this.taskid = taskid;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getEquipno() {
        return equipno;
    }

    public void setEquipno(String equipno) {
        this.equipno = equipno;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getItemValue() {
        return itemValue;
    }

    public void setItemValue(String itemValue) {
        this.itemValue = itemValue;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}