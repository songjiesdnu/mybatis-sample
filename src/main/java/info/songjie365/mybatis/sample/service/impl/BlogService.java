/**
 * Date:2015年7月18日下午1:45:08
 * Copyright (c) 2015, songjiesdnu@163.com All Rights Reserved.
 */
package info.songjie365.mybatis.sample.service.impl;

import info.songjie365.mybatis.sample.domain.Blog;
import info.songjie365.mybatis.sample.mapper.BlogMapper;
import info.songjie365.mybatis.sample.service.IBlogService;
import info.songjie365.mybatis.sample.util.MybatisUtils;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

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
	public Blog selectBlogById(String id) throws IOException {
		Blog blog = null;
		SqlSession sqlSession = MybatisUtils.getSqlSession();
		try{
			BlogMapper blogMapper = (BlogMapper)sqlSession.getMapper(BlogMapper.class);
			
			blog = blogMapper.selectBlog(id);
		}finally{
			MybatisUtils.closeSqlSession(sqlSession);
		}
		
		return blog;
	}
}
