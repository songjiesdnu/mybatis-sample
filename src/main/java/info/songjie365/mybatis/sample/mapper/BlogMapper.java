/**
 * Date:2015年7月18日下午12:16:02
 * Copyright (c) 2015, songjiesdnu@163.com All Rights Reserved.
 */
package info.songjie365.mybatis.sample.mapper;

import info.songjie365.mybatis.sample.domain.Blog;

/**
 * Function: blog的映射类. <br/>
 * date: 2015年7月18日 下午12:16:02 <br/>
 *
 * @author songjiesdnu@163.com
 * @version 
 * @since JDK 1.6
 */
public interface BlogMapper {

	/**
	 * 查询一条blog
	 * 
	 * @author songjiesdnu@163.com
	 * @param id
	 * @return
	 * @since JDK 1.6
	 */
	public Blog selectBlog(String id);
}

