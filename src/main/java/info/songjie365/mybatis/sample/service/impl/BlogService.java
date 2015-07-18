/**
 * Date:2015年7月18日下午1:45:08
 * Copyright (c) 2015, songjiesdnu@163.com All Rights Reserved.
 */
package info.songjie365.mybatis.sample.service.impl;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import info.songjie365.mybatis.sample.domain.Blog;
import info.songjie365.mybatis.sample.mapper.BlogMapper;
import info.songjie365.mybatis.sample.service.IBlogService;

/**
 * Function: blog服务实现类. <br/>
 * date: 2015年7月18日 下午1:45:08 <br/>
 *
 * @author songjiesdnu@163.com
 * @version 
 * @since JDK 1.6
 */
public class BlogService implements IBlogService {
	
	/**
	 * @see info.songjie365.mybatis.sample.service.IBlogService#selectBlogById(java.lang.String)
	 */
	@Override
	public Blog selectBlogById(String id) {
		String resource = "mybatis/mybatis-config.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		SqlSessionFactory  sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		BlogMapper blogMapper = (BlogMapper)sqlSession.getMapper(BlogMapper.class);
		
		Blog blog = blogMapper.selectBlog(id);
		return blog;
	}
	
	public static void main(String[] args) {
		String blogId = "100";
		IBlogService blogService = new BlogService();
		Blog blog = blogService.selectBlogById(blogId);
		System.out.println(blog.getTitle());
	}

}