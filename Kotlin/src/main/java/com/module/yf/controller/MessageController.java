package com.module.yf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(produces = {"application/json;charset=UTF-8"}, value = {"/msg"})
public class MessageController extends BaseController {

//    @Autowired
//    private MessageService messageService;
//
//    @RequestMapping(value = {"/getList"}, method = {org.springframework.web.bind.annotation.RequestMethod.POST})
//    @ResponseBody
//    public BaseResp<List<MessageInfo>> getList() {
//        BaseResp resp = new BaseResp();
//
//        if ((this.request.getHeader("token") == null) || (this.request.getHeader("token").equals(""))) {
//            resp.setStatus(0);
//            resp.setMessage("未登录");
//            return resp;
//        }
//
//        List list = this.messageService.getMessageList(Integer.valueOf(this.request.getHeader("token")));
//        if ((list == null) || (list.size() == 0)) {
//            resp.setStatus(0);
//            resp.setMessage("列表为空");
//            return resp;
//        }
//
//        resp.setStatus(0);
//        resp.setMessage("列表获取成功");
//        resp.setData(list);
//        return resp;
   // }
}