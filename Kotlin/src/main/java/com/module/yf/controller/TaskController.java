package com.module.yf.controller;

import com.module.yf.domain.*;
import com.module.yf.model.InspectionItem;
import com.module.yf.model.InspectionResult;
import com.module.yf.model.InspectionTask;
import com.module.yf.model.Rbac_User;
import com.module.yf.service.InspectionTaskService;
import com.module.yf.service.UserService;
import com.module.yf.utils.DateUtil;
import com.module.yf.utils.push.PushSender;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

//点检任务Contrller
@Controller
@RequestMapping("/spotInspection")
public class TaskController extends BaseController {

    @Autowired
    InspectionTaskService inspectionTaskService;


    //查询所有的任务 结果   后台使用
    @RequestMapping(value = {"/listAllTaskResult"}, method = {RequestMethod.POST})
    @ResponseBody
    public BaseResp listAllTaskResult() {
        BaseResp resp = new BaseResp();

        List<InspectionResult> taskResults = this.inspectionTaskService.listAllTaskResult();

        if (taskResults!= null && taskResults.size() > 0 ) {
            resp.setStatus(0);
            resp.setMessage("查询成功");
            resp.setData(taskResults);
            return resp;
        }

        resp.setStatus(-1);
        resp.setMessage("暂无相关点检结果");
        return resp;
    }

    //查询出 所有任务  后端使用
    @RequestMapping(value = {"/listAllTask"}, method = {RequestMethod.POST})
    @ResponseBody
    public BaseResp listAllTask( ){
        BaseResp<List<InspectionTask>> resp = new BaseResp<List<InspectionTask>>();

        List<InspectionTask> tasks = this.inspectionTaskService.listAllTask();

        if (tasks != null && tasks.size() > 0 ) {
            resp.setStatus(0);
            resp.setMessage("查询成功");
            resp.setData(tasks);
            return resp;
        }

        resp.setStatus(-1);
        resp.setMessage("没有分配任何任务");
        return resp;
    }













    //用户登陆后查询任务  前台使用
    @RequestMapping(value = {"/listTaskByUser"}, method = {RequestMethod.POST})
    @ResponseBody
    public BaseResp listTaskByUser(@RequestBody Map<String, Object>  params) {

        BaseResp resp = new BaseResp();

        String username = params.get("username").toString();

        if (StringUtils.isEmpty(username)){
            resp.setStatus(-1);
            resp.setMessage("参数错误");

            return resp;
        }

        if (session.getAttribute("User") == null){
            resp.setStatus(-1);
            resp.setMessage("用户未登录");

            return resp;
        }

        List<InspectionTask> tasks = inspectionTaskService.listTask(username);

        if (tasks != null && tasks.size() > 0) {
            resp.setStatus(0);
            resp.setMessage("查询成功");
            resp.setData(tasks);
            return resp;
        }

        resp.setStatus(0);
        resp.setMessage("当前无任务");
        return resp;
    }


    //查询出 用户 当天 所有任务（<= new Date()）   前台使用
    @RequestMapping(value = {"/listTodayTaskByUser"}, method = {RequestMethod.POST})
    @ResponseBody
    public BaseResp listTodayTaskByUser(@RequestBody GetTodayTaskReq todayTask){
        BaseResp resp = new BaseResp();

        List<InspectionTask> todayTasks = this.inspectionTaskService.listTodayTaskByUsername(todayTask.getUserName(),todayTask.getDate() + " 23:59:59");

        if (todayTasks != null && todayTasks.size() > 0 ) {
            resp.setStatus(0);
            resp.setMessage("查询成功");
            resp.setData(todayTasks);
            return resp;
        }

        resp.setStatus(-1);
        resp.setMessage("当前没有分配任何任务");
        return resp;
    }


    //更新点检任务状态todo  前台使用
    @RequestMapping(value = {"/updateTaskStatus"}, method = {RequestMethod.POST})
    @ResponseBody
    public BaseResp updateTaskStatus(@RequestBody UpdateTaskStatusReq param){
        BaseResp resp = new BaseResp();
        this.inspectionTaskService.updateTaskStatus(param.getTaskID());

        resp.setStatus(0);
        resp.setMessage("此设备已点检完成");
        return resp;
    }


    //上传任务 完成结果    前台使用
    @RequestMapping(value = {"/uploadTaskResult"}, method = {RequestMethod.POST})
    @ResponseBody
    public BaseResp register(@RequestBody TaskResultReq taskResult) {
        BaseResp<List<InspectionTask>> resp = new BaseResp<List<InspectionTask>>();

        Integer taskid = taskResult.getTaskid();
        String equipid =  taskResult.getEquipno();
        String frequency = taskResult.getFrequency();
        String item = taskResult.getItem();
        String itemValue = taskResult.getItemValue();
        String result = taskResult.getResult();
        String username = taskResult.getUsername();
        String remark = taskResult.getRemark();
        String imagePath = taskResult.getImage();

        Date date = new Date();
        InspectionResult inspectionResult = new InspectionResult(taskid,equipid,frequency,item,itemValue,username,result,remark,imagePath,date);

        int res = this.inspectionTaskService.uploadTaskResult(inspectionResult);

        if (res > 0 ) {
            resp.setStatus(0);
            resp.setMessage("上传成功");
            return resp;
        }

        resp.setStatus(-1);
        resp.setMessage("上传失败");
        return resp;
    }



    //查询出 任务的 具体 详情（即设备的具体点检项目）  前台使用
    @RequestMapping(value = {"/listcurCheckItems"}, method = {RequestMethod.POST})
    @ResponseBody
    public BaseResp listcurCheckItems(@RequestBody GetInspectionItemsReq req) {
        BaseResp resp = new BaseResp();

        String equipmentName = req.getEquipmnetName();
        String frequency = req.getFrequency();

        if (StringUtils.isEmpty(equipmentName) || StringUtils.isEmpty(frequency)){

            resp.setStatus(-1);
            resp.setMessage("参数传递有误");
            return resp;
        }

        List<InspectionItem> taskInspectItems = this.inspectionTaskService.listItemsByEquipNameAndFrequency(equipmentName, frequency);

        if (taskInspectItems!= null && taskInspectItems.size() > 0 ) {
            resp.setStatus(0);
            resp.setMessage("查询成功");
            resp.setData(taskInspectItems);
            return resp;
        }

        resp.setStatus(-1);
        resp.setMessage("请先维护相关点检项目");
        return resp;
    }

}
