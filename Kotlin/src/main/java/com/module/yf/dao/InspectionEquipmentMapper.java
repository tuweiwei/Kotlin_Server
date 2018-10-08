package com.module.yf.dao;

import com.module.yf.model.InspectionEquipment;

public interface InspectionEquipmentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InspectionEquipment record);

    int insertSelective(InspectionEquipment record);

    InspectionEquipment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(InspectionEquipment record);

    int updateByPrimaryKey(InspectionEquipment record);
}