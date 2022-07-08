package com.javaex.vo;

public class BlogVo {
	
	private String id;
	private String blogTitle;
	private String logoFIle;
	private String userName;
	
	public BlogVo() {
		
	}
	
	public BlogVo(String id, String blogTitle, String logoFIle, String userName) {
		this.id = id;
		this.blogTitle = blogTitle;
		this.logoFIle = logoFIle;
		this.userName = userName;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBlogTitle() {
		return blogTitle;
	}
	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}
	public String getLogoFIle() {
		return logoFIle;
	}
	public void setLogoFIle(String logoFIle) {
		this.logoFIle = logoFIle;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Override
	public String toString() {
		return "BlogVo [id=" + id + ", blogTitle=" + blogTitle + ", logoFIle=" + logoFIle + ", userName=" + userName
				+ "]";
	}
	
	
	
	
	
}
