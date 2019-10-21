package com.wego.web.controllers;


import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wego.web.domains.UserDTO;
import com.wego.web.serviceimpl.UserServiceImpl;


@Controller
@RequestMapping("/user/*")
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired Map<String, Object>map;	
	@Autowired UserDTO user;
	@Autowired UserServiceImpl userserviceimpl;
	
	@PostMapping("/join")
	public @ResponseBody Map<?,?> join(@RequestBody UserDTO param) {
		logger.info("AJAX 가 보낸 아이디와 비밀번호 {}",param.getUid()+","+param.getPwd()+","+param.getUname());	
		user.setUid(param.getUid());
		user.setPwd(param.getUid());
		user.setUname(param.getUname());
		user.setBirth(param.getBirth());
		user.setGender(param.getGender());
		user.setPettype(param.getPettype());
		user.setTel(param.getTel());
		userserviceimpl.join(param);
		Map<String,Object> map = new HashMap<>();
		map.put("uid", param.getUid());
		map.put("pwd", param.getPwd());
		map.put("uname", param.getUname());
		map.put("birth", param.getBirth());
		map.put("gender", param.getGender());
		map.put("pettype", param.getPettype());
		map.put("tel", param.getTel());
		logger.info("MAP에 담긴 아이디와 비번{}",map.get("uid")+","+map.get("pwd")+","+map.get("uname"));
		return map;
	}
	@PostMapping("/login")
	public @ResponseBody UserDTO login (@RequestBody UserDTO param){
		logger.info("AJAX 로그인 후 아이디 비밀번호{}",param.getUid()+","+param.getPwd()+","+param.getUname());
		user.setUid(param.getUid());
		user.setPwd(param.getPwd());
		user.setUname(param.getUname());
		user=userserviceimpl.login(param);
		logger.info("user 에 담긴 사용자 정보 {}",user.toString());
		return user;
		
	}
	
	
}
