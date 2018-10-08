package com.module.yf.service.impl;

import com.module.yf.dao.InspectionItemMapper;
import com.module.yf.dao.InspectionResultMapper;
import com.module.yf.dao.InspectionTaskMapper;
import com.module.yf.domain.GetTodayTaskReq;
import com.module.yf.model.InspectionItem;
import com.module.yf.model.InspectionResult;
import com.module.yf.model.InspectionTask;
import com.module.yf.service.InspectionTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("InspectionTaskService")
public class InspectionTaskServiceImpl implements InspectionTaskService {

    @Autowired
    InspectionTaskMapper inspectionTaskMapper;

    @Autowired
    InspectionResultMapper inspectionResultMapper;

    @Autowired
    InspectionItemMapper inspectionItemMapper;

    public List<InspectionTask> listTask(String username) {
        return inspectionTaskMapper.selectByUsername(username);
    }

    public List<InspectionTask> listAllTask() {
        return inspectionTaskMapper.selectAll();
    }

    public int uploadTaskResult(InspectionResult inspectionResult) {
        return inspectionResultMapper.insertSelective(inspectionResult);
    }

    public List<InspectionResult> listAllTaskResult() {
        return inspectionResultMapper.listAll();
    }

    public List<InspectionItem> listItemsByEquipNameAndFrequency(String equipName, String frequency) {
        return inspectionItemMapper.selectByEquipNameAndFrequency(equipName, frequency);
    }

    @Override
    public List<InspectionTask> listTodayTaskByUsername(String username, String date) {
        return inspectionTaskMapper.selectByUserameAndDate(username, date);
    }


    @Override
    public int updateTaskStatus(Integer taskID) {
        return inspectionTaskMapper.updateByID(taskID);
    }


    public List<InspectionTask> listFutureTaskByUsername(String username) {
        return null;
    }

}
