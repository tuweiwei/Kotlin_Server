package com.module.yf.dao;

import com.module.yf.model.Op400;

public interface Op400Mapper {
    int deleteByPrimaryKey(Integer op400Id);

    int insert(Op400 record);

    int insertSelective(Op400 record);

    Op400 selectByPrimaryKey(Integer op400Id);

    int updateByPrimaryKeySelective(Op400 record);

    int updateByPrimaryKey(Op400 record);
}