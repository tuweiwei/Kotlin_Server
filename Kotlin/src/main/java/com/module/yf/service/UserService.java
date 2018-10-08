package com.module.yf.service;

import com.module.yf.model.Rbac_User;

public interface UserService {
    Rbac_User getUserById(int paramInt);

    Rbac_User getUserByUserName(String paramString);

    void addUser(Rbac_User paramUserInfo);

    int modifyUser(Rbac_User paramUserInfo);
}
