package com.javaex.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaex.service.UserService;
import com.javaex.vo.UserVo;

@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	//회원가입 폼
	@RequestMapping(value = "/joinForm", method = { RequestMethod.GET, RequestMethod.POST })
	public String joinForm() {
		System.out.println("UserCon > joinForm()");
		
		return "user/joinForm";
	}
	
	//회원가입
	@RequestMapping(value = "/join", method = { RequestMethod.GET, RequestMethod.POST })
	public String join(@ModelAttribute UserVo userVo) {
		System.out.println("UserCon > join()");
		
		userService.join(userVo);
		
		return "user/joinSuccess";
	}
	
	//로그인폼
	@RequestMapping(value = "/loginForm", method = { RequestMethod.GET, RequestMethod.POST })
	public String loginForm() {
		System.out.println("UserCon > longinForm()");
		
		return "user/loginForm";
	}
	
	//로그인
	@RequestMapping(value = "/login", method = { RequestMethod.GET, RequestMethod.POST })
	public String login(@ModelAttribute UserVo userVo, HttpSession session) {
		System.out.println("UserCon > login()");
		
		UserVo authUser = userService.login(userVo);
		
		/* 세션에 저장 */
		if(authUser != null) { //로그인성공
			System.out.println("로그인 성공");
			session.setAttribute("authUser", authUser);
			return "redirect:/";
			
		}else {  //로그인실패
			System.out.println("로그인 실패");
			return "redirect:/user/loginForm";
		}
		
	}
	
	//로그아웃
	@RequestMapping(value = "/logout", method = { RequestMethod.GET, RequestMethod.POST })
	public String logout(HttpSession session) {
		System.out.println("UserCon > logout()");
		
		session.removeAttribute("authUser");
		
		return "redirect:/";
	}
	
	
	
	
	
	
	
	
}
