package com.web.team1.serviceimpl;

import com.web.team1.domains.DepartmentBean;
import com.web.team1.domains.EmployeeBean;
import com.web.team1.services.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{
	private static EmployeeServiceImpl instance = new EmployeeServiceImpl();
	public static EmployeeServiceImpl getInstance() {
		return instance;
	}
	
	private EmployeeServiceImpl() {}

	@Override
	public void join(EmployeeBean param) {
		System.out.println("서비스 조인!!!!"+param.toString());
		
	}

	@Override
	public EmployeeBean login(EmployeeBean param, DepartmentBean db) {

		return null;
	}

}