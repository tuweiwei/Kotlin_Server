package com.module.yf.domain;

public class UpdateTaskStatusReq {

    private Integer taskID;

    public UpdateTaskStatusReq() {
    }

    public UpdateTaskStatusReq(Integer taskID) {
        this.taskID = taskID;
    }

    public Integer getTaskID() {
        return taskID;
    }

    public void setTaskID(Integer taskID) {
        this.taskID = taskID;
    }
}
