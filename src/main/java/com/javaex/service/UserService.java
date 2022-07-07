package com.javaex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.UserDao;
import com.javaex.vo.UserVo;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	//회원가입(join)
	public int join(UserVo userVo) {
		System.out.println("UserService > join()");
		
		int count = userDao.userInsert(userVo);
		
		return count;
	}
	
	//로그인(login)
	public UserVo login(UserVo userVo) {
		System.out.println("UserSV > login()");
		
		UserVo authUser = userDao.getUser(userVo);
		
		return authUser;
	}
	
	
	
	
	
	
	
	
}
