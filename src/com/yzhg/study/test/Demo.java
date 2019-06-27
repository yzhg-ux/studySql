package com.yzhg.study.test;


import com.yzhg.study.domain.UserInfo;
import com.yzhg.study.utils.ClassUtils;
import com.yzhg.study.utils.HibernateUtils;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;
import java.util.Random;

public class Demo {

    public static void main(String[] args) {
        // getUserInfo();
        //getUserInfo("yzhg","123456");

        List<UserInfo> userInfo = getUserInfo();
        for (UserInfo info : userInfo) {
            String md5Encode = ClassUtils.md5Encode(info.getUserPsw()).toUpperCase();
            System.out.println(md5Encode);
            info.setUserPsw(md5Encode);
            updateClazzCode(info);
        }
    }




    /***
     * 使用HSql查询列表
     */
    public static List<UserInfo> getUserInfo() {
        String hql = "from UserInfo";
        Session session = HibernateUtils.openSession();
        Query query = session.createQuery(hql);
        List<UserInfo> list = query.list();
        session.close();
        return list;
    }

    /**
     * 查询clazzCode 为0的人
     */
    public static List<UserInfo> getClazzCode() {
        String hql = "from UserInfo where clazzCode = :clazzCode";
        Session session = HibernateUtils.openSession();
        Query query = session.createQuery(hql);
        query.setParameter("clazzCode", 0);
        List<UserInfo> list = query.list();
        return list;
    }

    /**
     * 更改班级号为0的 将号码更改为15
     */
    public static void updateClazzCode(UserInfo user){
        Session session = HibernateUtils.openSession();
        Transaction btx = session.beginTransaction(); // 获取到事物
        session.update(user);
        btx.commit();
        session.close();
    }

    /**
     * 添加用户
     *
     * @param userName 填入用户名
     */
    public static void addUser(String userName) {
        Session session = HibernateUtils.openSession();
        Transaction btx = session.beginTransaction(); // 获取到事物
        Random random = new Random();
        UserInfo user = new UserInfo();
        user.setUserName(userName);
        user.setUserPsw("123456");
        user.setUserPhone(ClassUtils.getPhone());
        user.setUserAge(random.nextInt(9) + 16);
        user.setUserSex(random.nextInt(2));
        user.setClazzCode(random.nextInt(15));
        session.save(user); // 保存
        btx.commit();
        session.close();
    }
}
