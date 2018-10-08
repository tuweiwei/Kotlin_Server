package com.module.yf.service.impl;

import com.alibaba.druid.sql.visitor.functions.If;
import com.module.yf.common.Constant;
import com.module.yf.dao.TidModelMapper;
import com.module.yf.domain.BaseResp;
import com.module.yf.model.TidModel;
import com.module.yf.service.TidService;
import org.apache.commons.lang.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service("TidService")
public class TidServiceImpl implements TidService {

    @Autowired
    TidModelMapper tidModelMapper;

    public List<TidModel> getTidByCode(String code) {
        return tidModelMapper.selectByCode(code);
    }


    public TidModel getUserByUserName(String paramString) {
        return null;
    }


    @Override
    public String checkAndRecord(String code, String user, String typeParam) {

        StringBuilder resString = new StringBuilder();
        TidModel tidModelForInsert;
        //进行业务逻辑判断
        String mRecycleBz = "";
        //查询条码是否回收
        int res = tidModelMapper.selectIfRecycleByCode(code);

        if(res >= 1){
            return Constant.Tid.RECYCLED;
        }

        //1. 查询出当前的条码的最新记录   进行重复扫描等判断
        TidModel tidModel = this.tidModelMapper.selectLastByCode(code);
        String queryRecycle = tidModel.getTidBz();
        int id = tidModel.getTidId();
        Date date = tidModel.getTidJlrq();
        int type = tidModel.getTidZtbz();

        //最多两次回收
        String resStr = tidModelMapper.selectIsTwiceRecycle(code);
        if(resStr!= null && resStr.equals("1")){
            return Constant.Tid.REACHUSELimit;
        }

        //扫描时 根据回收标志 设置 当前的回收标志
        if(queryRecycle!= null && queryRecycle.equals("0")){
            int intRes = tidModelMapper.selectRecycleByCodeOfLast(code,"0");
            if (intRes < 3){
                mRecycleBz = "0";

            }else {
                mRecycleBz = "1";
            }
        }

        if(queryRecycle!= null && queryRecycle.equals("1")){
            int intRes = tidModelMapper.selectRecycleByCodeOfLast(code, "1");
            if (intRes < 3){
                mRecycleBz = "1";

            }else{

                mRecycleBz = "2";
            }
        }

        if(queryRecycle!= null && queryRecycle.equals("2")){
            int intRes = tidModelMapper.selectRecycleByCodeOfLast(code, "2");
            if (intRes <= 3){
                mRecycleBz = "2";

            }else {
                return Constant.Tid.REACHUSELimit;
            }
        }

        //判断阶段类型
        if (typeParam!= null && typeParam.equals("1")){

            int maxTime = tidModelMapper.selectUseMaxByCode(code);
            if(maxTime == 3){

                return Constant.Tid.REACHUSELimit;
            }

        }

        if (typeParam!= null && typeParam.equals("2")){

            if(type != 1){
                return Constant.Tid.FIRST_PROCEDURE_FAIL;
            }

            if(queryRecycle != null && queryRecycle == "1" || queryRecycle =="2"){
                if (Hours.hoursBetween(new DateTime(new Date()), new DateTime(date)).getHours() % 24 > 72){

                    return Constant.Tid.FIRST_TWICE_PHASE_TIMEOUT;
                }

            }

//            if (Days.daysBetween(new DateTime(new Date()), new DateTime(date)).getDays() / 30 > 3){
//
//                return
//            }

        }

        if (typeParam != null && typeParam.equals("3")){
            if(type != 2){
                return Constant.Tid.FIRST_PROCEDURE_FAIL;
            }

            //回温时间大于4小时 且 小于 96小时
            if(Hours.hoursBetween(new DateTime(new Date()), new DateTime(date)).getHours() % 24 < 4 &&
                    Hours.hoursBetween(new DateTime(new Date()), new DateTime(date)).getHours() % 24 > 96){

                return Constant.Tid.TEMPRATURE_ERROR;
            }

            //8小时判断
            List<String> todayCode = tidModelMapper.selectTodayCode();

            for (String mcode: todayCode) {

                //获取这个条码的类型状态 如果为3
                Map<String, Object> mType = tidModelMapper.selectTypeByCode(mcode);
                if (mType.get("tid_ztbz").toString() == "3"){

                    Date mDate = (Date)mType.get("tid_jlrq");
                    if (Hours.hoursBetween(new DateTime(new Date()), new DateTime(mDate)).getHours() % 24 > 8){

                        resString.append(mcode).append(",");
                    }

                }
            }

            if (resString.length() > 0){
                return resString.append("超时未回收").toString();
            }

        }

        if (typeParam!= null && typeParam.equals("4")){

            tidModelForInsert = new TidModel(code, Integer.valueOf(typeParam), new Date(), user,"9");

        }



        //通过上述检测后  即可入库
        tidModelForInsert = new TidModel(code,Integer.valueOf(typeParam), new Date(), user,mRecycleBz);
        int r = tidModelMapper.insertSelective(tidModelForInsert);

        if (typeParam.equals("4")){
            return Constant.Tid.RECORD_SUCCESS_ABANDON;
        }else {
            return Constant.Tid.RECORD_SUCCESS;
        }
    }
}