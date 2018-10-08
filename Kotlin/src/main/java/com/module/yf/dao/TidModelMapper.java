package com.module.yf.dao;

import com.module.yf.model.TidModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TidModelMapper {
    int deleteByPrimaryKey(Integer tidId);

    int insert(TidModel record);

    int insertSelective(TidModel record);

    TidModel selectByPrimaryKey(Integer tidId);

    int updateByPrimaryKeySelective(TidModel record);

    int updateByPrimaryKey(TidModel record);

    List<TidModel> selectByCode(String code);

    int selectIfRecycleByCode(String code);

    TidModel selectLastByCode(String code);

    String selectIsTwiceRecycle(String code);

    int selectRecycleByCodeOfLast(@Param("code") String code, @Param("recycleFlag") String recycleFlag);

    List<String> selectTodayCode();

    Map<String,Object> selectTypeByCode(String mcode);

    int selectUseMaxByCode(String code);
}