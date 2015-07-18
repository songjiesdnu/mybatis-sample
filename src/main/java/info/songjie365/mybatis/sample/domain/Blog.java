/**
 * Date:2015年7月18日下午12:14:44
 * Copyright (c) 2015, songjiesdnu@163.com All Rights Reserved.
 */

package info.songjie365.mybatis.sample.domain;

/**
 * Function: blog实体类. <br/>
 * date: 2015年7月18日 下午12:14:44 <br/>
 *
 * @author songjiesdnu@163.com
 * @version 
 * @since JDK 1.6
 */
public class Blog extends AbstractEntity{
	private String title;
	private String des;
	private String content;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}