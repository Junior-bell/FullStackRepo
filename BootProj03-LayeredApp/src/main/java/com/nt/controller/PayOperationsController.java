package com.nt.controller;
//PayOperationsController.java

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;

@Controller("payroll")
public class PayOperationsController {

	@Autowired
	private IEmployeeMgmtService service;
	
	public List<Employee> showEmployeesByDesgs(String desg1,String desg2,String desg3) throws Exception{
		System.out.println("PayOperationsController.showEmployeesByDesgs()");
		//use service
		List<Employee> list=service.fetchEmployeesByDesgs(desg1, desg2, desg3);
		
		return list;
	}
	
}
