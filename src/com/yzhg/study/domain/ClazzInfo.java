package com.yzhg.study.domain;


/**
 * 配置班级信息表
 */
public class ClazzInfo {

    /*班级ID*/
    private Long clazzId;

    /*班级编号*/
    private Long clazzCode;

    /*班级名称*/
    private String clazzName;

    /*班级地址*/
    private String clazzAddress;

    /*班主任姓名*/
    private String clazzBoss;

    public Long getClazzId() {
        return clazzId;
    }

    public void setClazzId(Long clazzId) {
        this.clazzId = clazzId;
    }

    public Long getClazzCode() {
        return clazzCode;
    }

    public void setClazzCode(Long clazzCode) {
        this.clazzCode = clazzCode;
    }

    public String getClazzName() {
        return clazzName;
    }

    public void setClazzName(String clazzName) {
        this.clazzName = clazzName;
    }

    public String getClazzAddress() {
        return clazzAddress;
    }

    public void setClazzAddress(String clazzAddress) {
        this.clazzAddress = clazzAddress;
    }

    public String getClazzBoss() {
        return clazzBoss;
    }

    public void setClazzBoss(String clazzBoss) {
        this.clazzBoss = clazzBoss;
    }

    @Override
    public String toString() {
        return "ClazzInfo{" +
                "clazzId=" + clazzId +
                ", clazzCode=" + clazzCode +
                ", clazzName='" + clazzName + '\'' +
                ", clazzAddress='" + clazzAddress + '\'' +
                ", clazzBoss='" + clazzBoss + '\'' +
                '}';
    }
}
