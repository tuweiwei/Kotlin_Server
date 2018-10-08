package com.module.yf.dao;

import com.module.yf.model.Oplh;

public interface OplhMapper {
    int deleteByPrimaryKey(Integer oplhId);

    int insert(Oplh record);

    int insertSelective(Oplh record);

    Oplh selectByPrimaryKey(Integer oplhId);

    int updateByPrimaryKeySelective(Oplh record);

    int updateByPrimaryKey(Oplh record);
}