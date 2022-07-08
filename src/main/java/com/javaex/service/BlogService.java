package com.javaex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.BlogDao;
import com.javaex.vo.BlogVo;

@Service
public class BlogService {
	
	@Autowired
	BlogDao blogDao;
	
	public BlogVo blogmain(BlogVo blogVo) {
		System.out.println("blogSer>blogmain()");
		
		BlogVo blogId = blogDao.visitblog(blogVo);
		
		return blogId;
	}
	
}
