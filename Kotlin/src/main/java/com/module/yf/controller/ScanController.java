package com.module.yf.controller;

import com.module.yf.domain.BaseResp;
import com.module.yf.domain.LoginReq;
import com.module.yf.model.Rbac_User;
import com.module.yf.service.UserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


//扫描Controller
@Controller
@RequestMapping(produces = {"application/json;charset=UTF-8"}, value = {"/Scan"})
public class ScanController extends BaseController {


}
