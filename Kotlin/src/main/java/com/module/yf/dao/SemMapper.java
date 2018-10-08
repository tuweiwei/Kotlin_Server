package com.module.yf.dao;

import com.module.yf.model.Sem;

public interface SemMapper {
    int deleteByPrimaryKey(String semTm);

    int insert(Sem record);

    int insertSelective(Sem record);

    Sem selectByPrimaryKey(String semTm);

    int updateByPrimaryKeySelective(Sem record);

    int updateByPrimaryKey(Sem record);
}