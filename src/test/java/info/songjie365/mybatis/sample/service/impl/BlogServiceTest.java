/**
 * Date:2015年7月18日下午7:06:57
 * Copyright (c) 2015, songjiesdnu@163.com All Rights Reserved.
 */
package info.songjie365.mybatis.sample.service.impl;

import static org.junit.Assert.*;
import info.songjie365.mybatis.sample.domain.Blog;
import info.songjie365.mybatis.sample.service.IBlogService;

import java.io.IOException;

import org.junit.Test;

/**
 * Function: BlogService测试类. <br/>
 * date: 2015年7月18日 下午7:06:57 <br/>
 *
 * @author songjiesdnu@163.com
 * @version 
 * @since JDK 1.6
 */
public class BlogServiceTest {
	
	@Test
	public void selectBlogByIdTest() throws IOException{
		String blogId = "100";
		IBlogService blogService = new BlogService();
		Blog blog = blogService.selectBlogById(blogId);
		String title = blog.getTitle();
		assertNotNull("blog的标题不能为空", title);
	}
}