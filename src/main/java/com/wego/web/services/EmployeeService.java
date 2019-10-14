package com.wego.web.services;

import org.springframework.stereotype.Component;

import com.wego.web.domains.DepartmentDTO;
import com.wego.web.domains.EmployeeDTO;
@Component
public interface EmployeeService {
	
	public void join(EmployeeDTO param);
	public EmployeeDTO login(EmployeeDTO param,DepartmentDTO db);

}
