package com.module.yf.dao;

import com.module.yf.model.InspectionResult;

import java.util.List;

public interface InspectionResultMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InspectionResult record);

    int insertSelective(InspectionResult record);

    InspectionResult selectByPrimaryKey(Integer id);

    List<InspectionResult> listAll();

    int updateByPrimaryKeySelective(InspectionResult record);

    int updateByPrimaryKey(InspectionResult record);
}