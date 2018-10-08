package com.module.yf.model;

import java.util.Date;

public class InspectionResult {
    private Integer id;

    private Integer taskid;

    private String equipmentid;

    private String frequency;

    private String item;

    private String itemvalue;

    private String result;

    private String resultimg;

    private Date createdate;

    private String username;

    private String remark;

    public InspectionResult(Integer id, Integer taskid, String equipmentid, String frequency, String item, String itemvalue, String result, String resultimg, Date createdate, String username, String remark) {
        this.id = id;
        this.taskid = taskid;
        this.equipmentid = equipmentid;
        this.frequency = frequency;
        this.item = item;
        this.itemvalue = itemvalue;
        this.result = result;
        this.resultimg = resultimg;
        this.createdate = createdate;
        this.username = username;
        this.remark = remark;
    }

    public InspectionResult(Integer taskid, String equipmentid, String frequency, String item, String itemvalue,String username,  String result,  String remark,String resultimg, Date createdate) {
        this.taskid = taskid;
        this.equipmentid = equipmentid;
        this.frequency = frequency;
        this.item = item;
        this.itemvalue = itemvalue;
        this.result = result;
        this.resultimg = resultimg;
        this.createdate = createdate;
        this.username = username;
        this.remark = remark;
    }


    public InspectionResult() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTaskid() {
        return taskid;
    }

    public void setTaskid(Integer taskid) {
        this.taskid = taskid;
    }

    public String getEquipmentid() {
        return equipmentid;
    }

    public void setEquipmentid(String equipmentid) {
        this.equipmentid = equipmentid == null ? null : equipmentid.trim();
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency == null ? null : frequency.trim();
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item == null ? null : item.trim();
    }

    public String getItemvalue() {
        return itemvalue;
    }

    public void setItemvalue(String itemvalue) {
        this.itemvalue = itemvalue == null ? null : itemvalue.trim();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public String getResultimg() {
        return resultimg;
    }

    public void setResultimg(String resultimg) {
        this.resultimg = resultimg == null ? null : resultimg.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}