package com.javaex.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.BlogVo;

@Repository
public class BlogDao {
	
	@Autowired
	SqlSession sqlSession;
	
	public BlogVo visitblog(BlogVo blogVo) {
		System.out.println("blogDao > visitblog");
		
		BlogVo blogId = sqlSession.selectOne("blog.visitblog", blogVo);
		
		return blogId;
	}
}
