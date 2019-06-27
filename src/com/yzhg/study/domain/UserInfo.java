package com.yzhg.study.domain;


/***
 * 用户表
 * 		登录用表
 */
public class UserInfo {

    private Long userId;

    //用户姓名
    private String userName;
    //用户密码
    private String userPsw;
    //用户手机号
    private long userPhone;
    //用户性别  0 表示女  1表示男
    private int userSex;
    //用户年龄
    private int userAge;
    //所在班级
    private int clazzCode;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPsw() {
        return userPsw;
    }

    public void setUserPsw(String userPsw) {
        this.userPsw = userPsw;
    }

    public long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(long userPhone) {
        this.userPhone = userPhone;
    }

    public int getUserSex() {
        return userSex;
    }

    public void setUserSex(int userSex) {
        this.userSex = userSex;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public int getClazzCode() {
        return clazzCode;
    }

    public void setClazzCode(int clazzCode) {
        this.clazzCode = clazzCode;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPsw='" + userPsw + '\'' +
                ", userPhone=" + userPhone +
                ", userSex=" + userSex +
                ", userAge=" + userAge +
                ", clazzCode=" + clazzCode +
                '}';
    }
}
