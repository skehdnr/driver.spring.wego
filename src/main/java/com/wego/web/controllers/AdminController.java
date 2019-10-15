package com.wego.web.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wego.web.serviceimpl.AdminServiceImpl;
import com.wego.web.services.AdminService;



@Controller
@RequestMapping("/admin/*")
public class AdminController {
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	@Autowired AdminServiceImpl adminService;
	
	@GetMapping("/count")
	public String count (Model model) {
		int count = adminService.findTheNumberOfAdmins();
		model.addAttribute("count",count);
		return "home";
	}
	@GetMapping("/info")
	public String findAdminbyId(@RequestParam("eid") String eid, @RequestParam("pwd") String pwd) {
		
		return "home";
	}
	//test
}
