package com.module.yf.model;

import java.util.Date;

public class InspectionTask {
    private Integer id;

    private String spotinspectionworker;

    private String equipname;

    private String equipno;

    private Date executetime;

    private String frequency;

    private String curstatus;

    private Date createdate;

    private Boolean isvalid;

    public InspectionTask(Integer id, String spotinspectionworker, String equipname, String equipno, Date executetime, String frequency, String curstatus, Date createdate, Boolean isvalid) {
        this.id = id;
        this.spotinspectionworker = spotinspectionworker;
        this.equipname = equipname;
        this.equipno = equipno;
        this.executetime = executetime;
        this.frequency = frequency;
        this.curstatus = curstatus;
        this.createdate = createdate;
        this.isvalid = isvalid;
    }

    public InspectionTask() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSpotinspectionworker() {
        return spotinspectionworker;
    }

    public void setSpotinspectionworker(String spotinspectionworker) {
        this.spotinspectionworker = spotinspectionworker == null ? null : spotinspectionworker.trim();
    }

    public String getEquipname() {
        return equipname;
    }

    public void setEquipname(String equipname) {
        this.equipname = equipname == null ? null : equipname.trim();
    }

    public String getEquipno() {
        return equipno;
    }

    public void setEquipno(String equipno) {
        this.equipno = equipno == null ? null : equipno.trim();
    }

    public Date getExecutetime() {
        return executetime;
    }

    public void setExecutetime(Date executetime) {
        this.executetime = executetime;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency == null ? null : frequency.trim();
    }

    public String getCurstatus() {
        return curstatus;
    }

    public void setCurstatus(String curstatus) {
        this.curstatus = curstatus == null ? null : curstatus.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Boolean getIsvalid() {
        return isvalid;
    }

    public void setIsvalid(Boolean isvalid) {
        this.isvalid = isvalid;
    }
}