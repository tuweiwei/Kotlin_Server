package com.module.yf.service.impl;

import com.module.yf.dao.Rbac_UserMapper;
import com.module.yf.model.Rbac_User;
import com.module.yf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl  implements UserService {

    @Autowired
    private Rbac_UserMapper userInfoMapper;

    public Rbac_User getUserById(int paramInt) {
        return userInfoMapper.selectByPrimaryKey(paramInt);
    }

    public Rbac_User getUserByUserName(String paramString) {
        return userInfoMapper.selectByUsername(paramString);
    }

    public void addUser(Rbac_User paramUserInfo) {

    }

    public int modifyUser(Rbac_User paramUserInfo) {
        return userInfoMapper.updateByPrimaryKeySelective(paramUserInfo);
    }
}

