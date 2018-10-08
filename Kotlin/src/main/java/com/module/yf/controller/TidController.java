package com.module.yf.controller;

import com.module.yf.common.Constant;
import com.module.yf.domain.BaseResp;
import com.module.yf.domain.TidReq;
import com.module.yf.model.TidModel;
import com.module.yf.service.TidService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import java.util.List;
import java.util.Map;

//锡膏Controller
@Controller
@RequestMapping(produces = {"application/json;charset=UTF-8"}, value = {"/tidCenter"})
public class TidController extends BaseController {

    @Inject
    TidService tidService;

    @RequestMapping(value = {"/scanCodeForQuery"}, method = {RequestMethod.POST})
    @ResponseBody
    public BaseResp<String> scanCodeForQuery(@RequestBody Map<String, Object> param) {
        BaseResp resp = new BaseResp();

        String code = param.get("code").toString();

        if (StringUtils.isEmpty(code)) {
            resp.setStatus(-1);
            resp.setMessage("条码为空");
            return resp;
        }

        List<TidModel> tid = this.tidService.getTidByCode(code);

        System.out.println(tid.size());

        if (tid == null || tid.size() < 0) {
            resp.setStatus(-1);
            resp.setMessage("暂无记录或条码不存在");
            return resp;
        }

        resp.setStatus(0);
        resp.setMessage("操作成功");
        resp.setData(tid);
        return resp;
    }


    @RequestMapping(value = {"/scanCodeForInsert"}, method = {org.springframework.web.bind.annotation.RequestMethod.POST})
    @ResponseBody
    public BaseResp<String> scanCodeForInsert(@RequestBody TidReq req) {
        BaseResp resp = new BaseResp();
        String code = req.getCode();
        String type = req.getType();

        System.out.println(type);

        if (StringUtils.isEmpty(code)) {
            resp.setStatus(-1);
            resp.setMessage("条码为空");
            return resp;
        }

        if (code.length() != 19) {
            resp.setStatus(-1);
            resp.setMessage("条码不合规定");
            return resp;
        }

        if (StringUtils.isEmpty(type)){
            resp.setStatus(-1);
            resp.setMessage("扫描类型不能为空");
            return resp;
        }

        String ret = this.tidService.checkAndRecord(code,session.getAttribute("User").toString(),type);

        if(ret.equals(Constant.Tid.RECORD_SUCCESS) || ret.equals(Constant.Tid.RECORD_SUCCESS_ABANDON)) {
            resp.setStatus(0);
        }else {
            resp.setStatus(-1);
        }

        resp.setMessage(ret);
        return resp;
    }

}
