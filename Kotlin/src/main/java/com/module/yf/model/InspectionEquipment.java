package com.module.yf.model;

public class InspectionEquipment {
    private Integer id;

    private String equipmentno;

    private String equipmentname;

    private String line;

    private String usedepartment;

    private String maintainlevel;

    private String maintainperiod;

    public InspectionEquipment(Integer id, String equipmentno, String equipmentname, String line, String usedepartment, String maintainlevel, String maintainperiod) {
        this.id = id;
        this.equipmentno = equipmentno;
        this.equipmentname = equipmentname;
        this.line = line;
        this.usedepartment = usedepartment;
        this.maintainlevel = maintainlevel;
        this.maintainperiod = maintainperiod;
    }

    public InspectionEquipment() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEquipmentno() {
        return equipmentno;
    }

    public void setEquipmentno(String equipmentno) {
        this.equipmentno = equipmentno == null ? null : equipmentno.trim();
    }

    public String getEquipmentname() {
        return equipmentname;
    }

    public void setEquipmentname(String equipmentname) {
        this.equipmentname = equipmentname == null ? null : equipmentname.trim();
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line == null ? null : line.trim();
    }

    public String getUsedepartment() {
        return usedepartment;
    }

    public void setUsedepartment(String usedepartment) {
        this.usedepartment = usedepartment == null ? null : usedepartment.trim();
    }

    public String getMaintainlevel() {
        return maintainlevel;
    }

    public void setMaintainlevel(String maintainlevel) {
        this.maintainlevel = maintainlevel == null ? null : maintainlevel.trim();
    }

    public String getMaintainperiod() {
        return maintainperiod;
    }

    public void setMaintainperiod(String maintainperiod) {
        this.maintainperiod = maintainperiod == null ? null : maintainperiod.trim();
    }
}