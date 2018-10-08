package com.module.yf.dao;

import com.module.yf.model.Scm;

public interface ScmMapper {
    int deleteByPrimaryKey(String scmDm);

    int insert(Scm record);

    int insertSelective(Scm record);

    Scm selectByPrimaryKey(String scmDm);

    int updateByPrimaryKeySelective(Scm record);

    int updateByPrimaryKey(Scm record);
}