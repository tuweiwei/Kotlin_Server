package com.module.yf.dao;

import com.module.yf.model.InspectionTask;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InspectionTaskMapper {
    int deleteByPrimaryKey(Integer id);

    int updateByID(Integer id);

    int insert(InspectionTask record);

    int insertSelective(InspectionTask record);

    InspectionTask selectByPrimaryKey(Integer id);

    List<InspectionTask> selectAll();

    List<InspectionTask> selectByUserameAndDate(@Param("username") String equipname, @Param("date") String date);

    List<InspectionTask> selectByUsername(String spotinspectionworker);

    int updateByPrimaryKeySelective(InspectionTask record);

    int updateByPrimaryKey(InspectionTask record);
}