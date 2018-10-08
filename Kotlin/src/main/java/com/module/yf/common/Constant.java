package com.module.yf.common;

public class Constant {

    public static abstract interface Tid{

        public static final String RECYCLED = "已被回收";

        public static final String DUPLICATE_SCAN = "重复扫描";

        public static final String REACHUSELimit = "到达使用上限";

        public static final String RECORD_SUCCESS = "记录成功";

        public static final String RECORD_SUCCESS_ABANDON = "记录成功，已废弃";

        public static final String FIRST_PROCEDURE_FAIL = "前工序未通过";

        public static final String TEMPRATURE_ERROR = "回温时间必须在4~96小时之内";

        public static final String FIRST_TWICE_PHASE_TIMEOUT="此锡膏一二次使用期间,在冰箱时间超时";
    }
}