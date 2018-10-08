package com.module.yf.model;

public class InspectionItem {
    private Integer id;

    private String equipname;

    private String equipno;

    private String fileno;

    private String spotinspectionitem;

    private String frequency;

    public InspectionItem(Integer id, String equipname, String equipno, String fileno, String spotinspectionitem, String frequency) {
        this.id = id;
        this.equipname = equipname;
        this.equipno = equipno;
        this.fileno = fileno;
        this.spotinspectionitem = spotinspectionitem;
        this.frequency = frequency;
    }

    public InspectionItem() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getFileno() {
        return fileno;
    }

    public void setFileno(String fileno) {
        this.fileno = fileno == null ? null : fileno.trim();
    }

    public String getSpotinspectionitem() {
        return spotinspectionitem;
    }

    public void setSpotinspectionitem(String spotinspectionitem) {
        this.spotinspectionitem = spotinspectionitem == null ? null : spotinspectionitem.trim();
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency == null ? null : frequency.trim();
    }
}