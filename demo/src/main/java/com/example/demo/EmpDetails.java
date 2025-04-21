package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpDetails {

	@GetMapping("/app/{empno}")
	public Employee getEmpno(@PathVariable("empno")String empno)
	{
		String tempno=empno;
		String ename="Pavan_"+empno;
		System.out.println("in get details "+empno);
		return new Employee(tempno,ename);
				
		
	}
	
	
}
