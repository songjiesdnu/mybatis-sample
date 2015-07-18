/**
 * Date:2015年7月18日下午12:23:04
 * Copyright (c) 2015, songjiesdnu@163.com All Rights Reserved.
 */
package info.songjie365.mybatis.sample.domain;

/**
 * Function: domain对象的抽象类. <br/>
 * date: 2015年7月18日 下午12:23:04 <br/>
 *
 * @author songjiesdnu@163.com
 * @version 
 * @since JDK 1.6
 */
public class AbstractEntity {
	protected String id;

	/**
	 * id.
	 *
	 * @return  the id
	 * @since   JDK 1.6
	 */
	public String getId() {
		return id;
	}

	/**
	 * id.
	 *
	 * @param   id    the id to set
	 * @since   JDK 1.6
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	
}

