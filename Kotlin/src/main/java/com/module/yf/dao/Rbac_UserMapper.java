package com.module.yf.dao;

import com.module.yf.model.Rbac_User;

public interface Rbac_UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Rbac_User record);

    int insertSelective(Rbac_User record);

    Rbac_User selectByPrimaryKey(Integer id);

    Rbac_User selectByUsername(String username);

    int updateByPrimaryKeySelective(Rbac_User record);

    int updateByPrimaryKey(Rbac_User record);
}