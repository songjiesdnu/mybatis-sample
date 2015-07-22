/**
 * Date:2015年7月22日下午3:22:20
 * Copyright (c) 2015, songjiesdnu@163.com All Rights Reserved.
 */
package info.songjie365.mybatis.sample.custom;

import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.mapping.DatabaseIdProvider;

/**
 * Function: TODO ADD FUNCTION. <br/>
 * date: 2015年7月22日 下午3:22:20 <br/>
 *
 * @author songjiesdnu@163.com
 * @version 
 * @since JDK 1.6
 */
public class MyDatavbaseIdProvider implements DatabaseIdProvider {
	Properties props = null;
	@Override
	public void setProperties(Properties p) {
		//p代表mybatis中针对databaseIdProvider配置的属性
		props = p;
	}

	@Override
	public String getDatabaseId(DataSource dataSource) throws SQLException {
		//根据使用的数据源，返回不同的databaseId。这里一直返回mysql。
		return "mysql";
	}
}

