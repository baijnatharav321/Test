package com.mindtree.empproducerrest.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.empproducerrest.entity.Employee;



@RestController
public class TestController {
	

	@RequestMapping(value="/employee",method=RequestMethod.GET)
	public Employee firstpage() {
		Employee emp = new Employee();
		emp.setEmpId("1");
		emp.setName("Priya");
		emp.setDesignations("engineer");
		return emp;
		
	}

}
