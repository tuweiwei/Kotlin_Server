package com.module.yf.dao;

import com.module.yf.model.InspectionItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InspectionItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InspectionItem record);

    int insertSelective(InspectionItem record);

    InspectionItem selectByPrimaryKey(Integer id);

    List<InspectionItem> selectByEquipNameAndFrequency(@Param("equipname") String equipname, @Param("frequency") String frequency);

    int updateByPrimaryKeySelective(InspectionItem record);

    int updateByPrimaryKey(InspectionItem record);
}