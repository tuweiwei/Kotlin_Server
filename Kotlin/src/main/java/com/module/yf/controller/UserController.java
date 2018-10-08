package com.module.yf.controller;

import com.module.yf.domain.*;
import com.module.yf.model.Rbac_User;
import com.module.yf.service.UserService;
import com.module.yf.utils.DateUtil;
import com.module.yf.utils.push.PushSender;

import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


//用户Controller
@Controller
@RequestMapping(produces = {"application/json;charset=UTF-8"}, value = {"/userCenter"})
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = {"/login"}, method = {org.springframework.web.bind.annotation.RequestMethod.POST})
    @ResponseBody
    public BaseResp<Rbac_User> loginByPwd(@RequestBody LoginReq req) {
        BaseResp resp = new BaseResp();
 
        String username = req.getUserName();
        //String pwd = req.getPwd();
 
        if (StringUtils.isEmpty(username)) {
            resp.setStatus(-1);
            resp.setMessage("用户名为空");
            return resp;
        }

        Rbac_User userInfo = this.userService.getUserByUserName(username);

        if (userInfo == null) {
            resp.setStatus(-1);
            resp.setMessage("用户不存在");
            return resp;
        }
//        if (!pwd.equals(userInfo.getUserpassword())) {
//            resp.setStatus(-1);
//            resp.setMessage("密码错误");
//            return resp;
//        }
 
        //userInfo.setUserpassword(null);
        resp.setStatus(0);
        resp.setMessage("登录成功");
        resp.setData(userInfo);
        session.setAttribute("User",username);
        return resp;
    }










    private void sendMessage(Integer userId, String pushId) {
        String curTime = DateUtil.format(new Date(), DateUtil.FORMAT_LONG_NEW);
//        MessageInfo msg = new MessageInfo();
//        msg.setMsgIcon("http://osea2fxp7.bkt.clouddn.com/108x108.png");
//        msg.setMsgTitle("登录成功");
//        msg.setMsgContent("恭喜您登录成功");
//        msg.setMsgTime(curTime);
//        msg.setUserId(userId);
//        this.messageService.addMessage(msg);
 
        PushSender.sendLoginEvent(pushId);
    }

    @RequestMapping(value = {"/resetPwd"}, method = {org.springframework.web.bind.annotation.RequestMethod.POST})
    @ResponseBody
    public BaseResp<String> resetPwd(@RequestBody ModifyPwdReq req) {
        BaseResp resp = new BaseResp();
 
        String mobile = req.getMobile();
        String pwd = req.getPwd();
 
        if (StringUtils.isEmpty(mobile)) {
            resp.setStatus(-1);
            resp.setMessage("用户名为空");
            return resp;
        }
 
        if (StringUtils.isEmpty(pwd)) {
            resp.setStatus(-1);
            resp.setMessage("密码为空");
            return resp;
        }

        Rbac_User userInfo = this.userService.getUserByUserName(mobile);
        if (userInfo == null) {
            resp.setStatus(-1);
            resp.setMessage("用户不存在");
            return resp;
        }
 
        userInfo.setPassword(pwd);
        int result = this.userService.modifyUser(userInfo);
 
        if (result > 0) {
            resp.setStatus(0);
            resp.setMessage("密码修改成功");
            return resp;
        }
        resp.setStatus(-1);
        resp.setMessage("密码修改失败");
        return resp;
    }




    @RequestMapping(value = {"/register"}, method = {org.springframework.web.bind.annotation.RequestMethod.POST})
    @ResponseBody
    public BaseResp register(@RequestBody RegisterReq req) {
        BaseResp resp = new BaseResp();
 
        String mobile = req.getMobile();

        Rbac_User userInfo = this.userService.getUserByUserName(mobile);
        if (userInfo != null) {
            resp.setStatus(-1);
            resp.setMessage("账号已被注册");
            return resp;
        }
 
        userInfo = new Rbac_User();
        userInfo.setUserno(mobile);
        userInfo.setPassword(req.getPwd());
        this.userService.addUser(userInfo);
 
        resp.setStatus(0);
 
        return resp;
    }


    @RequestMapping(value = {"/editUser"}, method = {org.springframework.web.bind.annotation.RequestMethod.POST})
    @ResponseBody
    public BaseResp<Rbac_User> editUser(@RequestBody EditUserReq req) {
        BaseResp resp = new BaseResp();

        Rbac_User userInfo = this.userService.getUserByUserName(req.getUserName());

        System.out.println(this.request.getHeader("token"));
        if (userInfo == null) {
            resp.setStatus(-1);
            resp.setMessage("用户不存在");
            return resp;
        }

        userInfo.setId(Integer.valueOf(this.request.getHeader("token")));
        userInfo.setChinaname(req.getUserName());
        userInfo.setUsericon(req.getUserIcon());


        this.userService.modifyUser(userInfo);

        resp.setStatus(0);
        resp.setData(userInfo);
        return resp;
    }
}
