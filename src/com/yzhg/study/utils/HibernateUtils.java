package com.yzhg.study.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * gitee 码云  代码上传地址 :
 *
 * 	https://gitee.com/yzhg0854/YzhgJavaDemo.git
 *
 */
public class HibernateUtils {

	private static SessionFactory sf;

	static {
		//Configuration 配置加载类,用于加载主配置  orm元数据加载
		Configuration conf = new Configuration();
		//指定配置文件 => 空参加载方法 加载src下hibernate.cfg.xml文件
		conf.configure();
		/**
		 * SessionFactory
		 * 根据配置信息,创建SessionFactory对象
		 * 负责保存和使用所有配置信息,消耗内存资源非常大
		 * 		属于线程安全的对象设计
		 */
		sf = conf.buildSessionFactory();
	}

	public static Session openSession() {
		/**
		 * 打开Session
		 * 表达Hibernate框架与数据库之间的连接(会话),session类似于
		 * 		JDBC年代的connection对象,还可以完成对数据库中数据的增删改查操作
		 * 		session是hibernate操作数据库的核心对象
		 */
		Session session = sf.openSession();
		return session;
	}

	public static Session getCurrentSession() {
		//获取一个与线程绑定的Session对象
		Session session = sf.getCurrentSession();
		return session;
	}


	/**



	 Configuration conf = new Configuration();
	 conf.configure();
	 SessionFactory sessionFactory = conf.buildSessionFactory();
	 Session session = sessionFactory.openSession();
	 Session currentSession = sessionFactory.getCurrentSession();
	 Transaction bx = session.beginTransaction();
	 Customer c = new Customer();  //没有ID 没有与session关联 => 瞬时状态
	 c.setCust_name("小米公司");    //瞬时状态
	 session.save(c); 			//保存 持久化状态,有id 有关联
	 bx.commit();
	 session.close();			// 游离|托管  状态,有Id ,没有关联
	 sessionFactory.close();

	 hibernate 一级缓存


	 */


}





