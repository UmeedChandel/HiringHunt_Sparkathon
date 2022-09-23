package com.hiringhunt.employee;

import java.util.List;

public interface EmployeeService {
	//Add new employee
	public Employee addEmployee(Employee employee);
	
	//view all employees
	 List<Employee> viewAllEmployee();
	 
	 //edit employee
	 public Employee editEmployeeDetails(Employee employee);
	 //delete employee
	 public void deleteEmployee(long empId);
	 //search by email
	 List<Employee> searchByEmail(String email);
	 //search by skill
	 List<Employee> searchBySkill1(String skill1);
	 List<Employee> searchBySkill2(String skill2);
	 
}
