package com.module.yf.domain;

public class GetInspectionItemsReq extends BaseReq {
    private String equipmnetName;
    private String frequency;

    public GetInspectionItemsReq() {
    }

    public GetInspectionItemsReq(String equipmnetName, String frequency) {
        this.equipmnetName = equipmnetName;
        this.frequency = frequency;
    }

    public String getEquipmnetName() {
        return equipmnetName;
    }

    public void setEquipmnetName(String equipmnetName) {
        this.equipmnetName = equipmnetName;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }
}