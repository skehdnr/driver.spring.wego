package com.wego.web.mappers;

import org.springframework.stereotype.Repository;

import com.wego.web.domains.DepartmentDTO;
import com.wego.web.domains.EmployeeDTO;
@Repository
public interface EmployeeMapper {
	public void insertEmployee(EmployeeDTO param);
	public EmployeeDTO selectByempNoeName(EmployeeDTO param,DepartmentDTO db);
}
