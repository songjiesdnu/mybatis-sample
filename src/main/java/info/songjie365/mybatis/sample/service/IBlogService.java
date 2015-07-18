/**
 * Date:2015年7月18日下午1:44:27
 * Copyright (c) 2015, songjiesdnu@163.com All Rights Reserved.
 */
package info.songjie365.mybatis.sample.service;

import info.songjie365.mybatis.sample.domain.Blog;

import java.io.IOException;

/**
 * Function: blog服务接口. <br/>
 * date: 2015年7月18日 下午1:44:27 <br/>
 *
 * @author songjiesdnu@163.com
 * @version 
 * @since JDK 1.6
 */
public interface IBlogService {
	
	/**
	 * 根据blog id获取blog对象
	 * @author songjiesdnu@163.com
	 * @param id
	 * @return
	 * @since JDK 1.6
	 */
	public Blog selectBlogById(String id) throws IOException;
}
