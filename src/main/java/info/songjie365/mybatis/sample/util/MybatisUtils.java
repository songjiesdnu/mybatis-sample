/**
 * Date:2015年7月18日下午5:31:48
 * Copyright (c) 2015, songjiesdnu@163.com All Rights Reserved.
 */
package info.songjie365.mybatis.sample.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.io.IOException;
/**
 * Function: mybatis工具类. <br/>
 * date: 2015年7月18日 下午5:31:48 <br/>
 *
 * @author songjiesdnu@163.com
 * @version 
 * @since JDK 1.6
 */
public class MybatisUtils {
	private static SqlSessionFactory sqlSessionFactory = null;
	
	/**
	 * 返回SqlSessionFactory对象。
	 * 该方法保证在整个应用的生命周期中只存在一个SqlSessionFactory对象。并且，只使用一次SqlSessionFactoryBuilder的实例。</br>
	 * @author songjiesdnu@163.com
	 * @return
	 * @throws IOException
	 * @since JDK 1.6
	 */
	private static SqlSessionFactory getSqlSessionFactory() throws IOException{
		if(sqlSessionFactory != null){
			return sqlSessionFactory;
		}
		synchronized(MybatisUtils.class){
			if(sqlSessionFactory == null){
				String resource = "mybatis/mybatis-config.xml";
				InputStream inputStream = Resources.getResourceAsStream(resource);
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			}
		}
		return sqlSessionFactory;
	}
	
	/**
	 * 返回一个SqlSession对象
	 * @author songjiesdnu@163.com
	 * @return
	 * @throws IOException
	 * @since JDK 1.6
	 */
	public static SqlSession getSqlSession() throws IOException{
		return getSqlSessionFactory().openSession();
	}
	
	/**
	 * 关闭SqlSession
	 * @author songjiesdnu@163.com
	 * @param session
	 * @since JDK 1.6
	 */
	public static void closeSqlSession(SqlSession sqlSession){
		if(sqlSession != null){
			sqlSession.close();
		}
	}
}