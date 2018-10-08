package com.module.yf.model;

import java.util.Date;

public class Sem {
    private String semTm;

    private Integer semMoeid;

    private String semLb;

    private Boolean semZtbz;

    private Integer semId;

    private String semMain;

    private Integer semIsok;

    private Integer semWhdm;

    private Integer semSftr;

    private Integer semSfcc;

    private Integer semSfcscc;

    private Integer semSfcstr;

    private Integer semSffgtr;

    private Integer semSffgcc;

    private Integer semSfcsfgtr;

    private Integer semSfcsfgcc;

    private Date semTrdate;

    private Date semCcdate;

    private Date semCstrdate;

    private Date semCsccdate;

    private Date semFgtrdate;

    private Date semFgccdate;

    private Date semCsfgtrdate;

    private Date semCsfgccdate;

    private String semFgdh;

    private String semCsfgdh;

    private String semZcxb;

    private String semFgxb;

    private String semCszcxb;

    private String semCsfgxb;

    public Sem(String semTm, Integer semMoeid, String semLb, Boolean semZtbz, Integer semId, String semMain, Integer semIsok, Integer semWhdm, Integer semSftr, Integer semSfcc, Integer semSfcscc, Integer semSfcstr, Integer semSffgtr, Integer semSffgcc, Integer semSfcsfgtr, Integer semSfcsfgcc, Date semTrdate, Date semCcdate, Date semCstrdate, Date semCsccdate, Date semFgtrdate, Date semFgccdate, Date semCsfgtrdate, Date semCsfgccdate, String semFgdh, String semCsfgdh, String semZcxb, String semFgxb, String semCszcxb, String semCsfgxb) {
        this.semTm = semTm;
        this.semMoeid = semMoeid;
        this.semLb = semLb;
        this.semZtbz = semZtbz;
        this.semId = semId;
        this.semMain = semMain;
        this.semIsok = semIsok;
        this.semWhdm = semWhdm;
        this.semSftr = semSftr;
        this.semSfcc = semSfcc;
        this.semSfcscc = semSfcscc;
        this.semSfcstr = semSfcstr;
        this.semSffgtr = semSffgtr;
        this.semSffgcc = semSffgcc;
        this.semSfcsfgtr = semSfcsfgtr;
        this.semSfcsfgcc = semSfcsfgcc;
        this.semTrdate = semTrdate;
        this.semCcdate = semCcdate;
        this.semCstrdate = semCstrdate;
        this.semCsccdate = semCsccdate;
        this.semFgtrdate = semFgtrdate;
        this.semFgccdate = semFgccdate;
        this.semCsfgtrdate = semCsfgtrdate;
        this.semCsfgccdate = semCsfgccdate;
        this.semFgdh = semFgdh;
        this.semCsfgdh = semCsfgdh;
        this.semZcxb = semZcxb;
        this.semFgxb = semFgxb;
        this.semCszcxb = semCszcxb;
        this.semCsfgxb = semCsfgxb;
    }

    public Sem() {
        super();
    }

    public String getSemTm() {
        return semTm;
    }

    public void setSemTm(String semTm) {
        this.semTm = semTm == null ? null : semTm.trim();
    }

    public Integer getSemMoeid() {
        return semMoeid;
    }

    public void setSemMoeid(Integer semMoeid) {
        this.semMoeid = semMoeid;
    }

    public String getSemLb() {
        return semLb;
    }

    public void setSemLb(String semLb) {
        this.semLb = semLb == null ? null : semLb.trim();
    }

    public Boolean getSemZtbz() {
        return semZtbz;
    }

    public void setSemZtbz(Boolean semZtbz) {
        this.semZtbz = semZtbz;
    }

    public Integer getSemId() {
        return semId;
    }

    public void setSemId(Integer semId) {
        this.semId = semId;
    }

    public String getSemMain() {
        return semMain;
    }

    public void setSemMain(String semMain) {
        this.semMain = semMain == null ? null : semMain.trim();
    }

    public Integer getSemIsok() {
        return semIsok;
    }

    public void setSemIsok(Integer semIsok) {
        this.semIsok = semIsok;
    }

    public Integer getSemWhdm() {
        return semWhdm;
    }

    public void setSemWhdm(Integer semWhdm) {
        this.semWhdm = semWhdm;
    }

    public Integer getSemSftr() {
        return semSftr;
    }

    public void setSemSftr(Integer semSftr) {
        this.semSftr = semSftr;
    }

    public Integer getSemSfcc() {
        return semSfcc;
    }

    public void setSemSfcc(Integer semSfcc) {
        this.semSfcc = semSfcc;
    }

    public Integer getSemSfcscc() {
        return semSfcscc;
    }

    public void setSemSfcscc(Integer semSfcscc) {
        this.semSfcscc = semSfcscc;
    }

    public Integer getSemSfcstr() {
        return semSfcstr;
    }

    public void setSemSfcstr(Integer semSfcstr) {
        this.semSfcstr = semSfcstr;
    }

    public Integer getSemSffgtr() {
        return semSffgtr;
    }

    public void setSemSffgtr(Integer semSffgtr) {
        this.semSffgtr = semSffgtr;
    }

    public Integer getSemSffgcc() {
        return semSffgcc;
    }

    public void setSemSffgcc(Integer semSffgcc) {
        this.semSffgcc = semSffgcc;
    }

    public Integer getSemSfcsfgtr() {
        return semSfcsfgtr;
    }

    public void setSemSfcsfgtr(Integer semSfcsfgtr) {
        this.semSfcsfgtr = semSfcsfgtr;
    }

    public Integer getSemSfcsfgcc() {
        return semSfcsfgcc;
    }

    public void setSemSfcsfgcc(Integer semSfcsfgcc) {
        this.semSfcsfgcc = semSfcsfgcc;
    }

    public Date getSemTrdate() {
        return semTrdate;
    }

    public void setSemTrdate(Date semTrdate) {
        this.semTrdate = semTrdate;
    }

    public Date getSemCcdate() {
        return semCcdate;
    }

    public void setSemCcdate(Date semCcdate) {
        this.semCcdate = semCcdate;
    }

    public Date getSemCstrdate() {
        return semCstrdate;
    }

    public void setSemCstrdate(Date semCstrdate) {
        this.semCstrdate = semCstrdate;
    }

    public Date getSemCsccdate() {
        return semCsccdate;
    }

    public void setSemCsccdate(Date semCsccdate) {
        this.semCsccdate = semCsccdate;
    }

    public Date getSemFgtrdate() {
        return semFgtrdate;
    }

    public void setSemFgtrdate(Date semFgtrdate) {
        this.semFgtrdate = semFgtrdate;
    }

    public Date getSemFgccdate() {
        return semFgccdate;
    }

    public void setSemFgccdate(Date semFgccdate) {
        this.semFgccdate = semFgccdate;
    }

    public Date getSemCsfgtrdate() {
        return semCsfgtrdate;
    }

    public void setSemCsfgtrdate(Date semCsfgtrdate) {
        this.semCsfgtrdate = semCsfgtrdate;
    }

    public Date getSemCsfgccdate() {
        return semCsfgccdate;
    }

    public void setSemCsfgccdate(Date semCsfgccdate) {
        this.semCsfgccdate = semCsfgccdate;
    }

    public String getSemFgdh() {
        return semFgdh;
    }

    public void setSemFgdh(String semFgdh) {
        this.semFgdh = semFgdh == null ? null : semFgdh.trim();
    }

    public String getSemCsfgdh() {
        return semCsfgdh;
    }

    public void setSemCsfgdh(String semCsfgdh) {
        this.semCsfgdh = semCsfgdh == null ? null : semCsfgdh.trim();
    }

    public String getSemZcxb() {
        return semZcxb;
    }

    public void setSemZcxb(String semZcxb) {
        this.semZcxb = semZcxb == null ? null : semZcxb.trim();
    }

    public String getSemFgxb() {
        return semFgxb;
    }

    public void setSemFgxb(String semFgxb) {
        this.semFgxb = semFgxb == null ? null : semFgxb.trim();
    }

    public String getSemCszcxb() {
        return semCszcxb;
    }

    public void setSemCszcxb(String semCszcxb) {
        this.semCszcxb = semCszcxb == null ? null : semCszcxb.trim();
    }

    public String getSemCsfgxb() {
        return semCsfgxb;
    }

    public void setSemCsfgxb(String semCsfgxb) {
        this.semCsfgxb = semCsfgxb == null ? null : semCsfgxb.trim();
    }
}