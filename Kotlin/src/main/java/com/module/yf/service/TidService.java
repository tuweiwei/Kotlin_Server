package com.module.yf.service;

import com.module.yf.model.TidModel;

import java.util.List;

public interface TidService {

    List<TidModel> getTidByCode(String code);

    TidModel getUserByUserName(String paramString);

    String checkAndRecord(String code, String user, String type);
}
