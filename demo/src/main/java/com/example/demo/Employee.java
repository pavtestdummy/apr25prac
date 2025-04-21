package com.example.demo;

public class Employee {
	
	String empno;
	String ename;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String empno, String ename) {
		super();
		this.empno = empno;
		this.ename = ename;
	}

	public String getEmpno() {
		return empno;
	}
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	

}
