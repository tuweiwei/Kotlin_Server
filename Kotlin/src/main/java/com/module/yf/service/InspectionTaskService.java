package com.module.yf.service;

import com.module.yf.domain.GetTodayTaskReq;
import com.module.yf.model.InspectionItem;
import com.module.yf.model.InspectionResult;
import com.module.yf.model.InspectionTask;

import java.util.Date;
import java.util.List;

public interface InspectionTaskService {

    //用户 的任务
    List<InspectionTask> listTask(String username);

    //所有任务
    List<InspectionTask> listAllTask();

    //上传 任务结果
    int uploadTaskResult(InspectionResult inspectionResult);

    //所有 点检任务 的结果
    List<InspectionResult> listAllTaskResult();

    //某一任务 的点检项目
    List<InspectionItem> listItemsByEquipNameAndFrequency(String equipName, String frequency);

    //当天的任务
    List<InspectionTask> listTodayTaskByUsername(String username, String date);

    //即将要做的任务 已提前分配
    List<InspectionTask> listFutureTaskByUsername(String username);


    int updateTaskStatus(Integer taskID);
}
