package com.module.yf.model;

public class Rbac_User {
    private Integer id;

    private String userno;

    private String password;

    private String chinaname;

    private String usericon;

    private String workdept;

    private Integer score;

    public Rbac_User(Integer id, String userno, String password, String chinaname, String usericon, String workdept, Integer score) {
        this.id = id;
        this.userno = userno;
        this.password = password;
        this.chinaname = chinaname;
        this.usericon = usericon;
        this.workdept = workdept;
        this.score = score;
    }

    public Rbac_User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserno() {
        return userno;
    }

    public void setUserno(String userno) {
        this.userno = userno == null ? null : userno.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getChinaname() {
        return chinaname;
    }

    public void setChinaname(String chinaname) {
        this.chinaname = chinaname == null ? null : chinaname.trim();
    }

    public String getUsericon() {
        return usericon;
    }

    public void setUsericon(String usericon) {
        this.usericon = usericon == null ? null : usericon.trim();
    }

    public String getWorkdept() {
        return workdept;
    }

    public void setWorkdept(String workdept) {
        this.workdept = workdept == null ? null : workdept.trim();
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}