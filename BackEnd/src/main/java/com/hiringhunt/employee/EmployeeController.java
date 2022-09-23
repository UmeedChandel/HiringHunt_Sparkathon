package com.hiringhunt.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
   
	@Autowired
	private EmployeeService employeeService;
	
	
		
	
	@PostMapping("/post")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.addEmployee(employee),HttpStatus.CREATED);
	}
	
	@PutMapping("/edit")
	public Employee editEmployeeDetails(@RequestBody Employee employee) {
		return employeeService.editEmployeeDetails(employee);
	}
	
	@GetMapping("/viewAll")
	public List<Employee> viewAllEmployee(){
		return employeeService.viewAllEmployee();
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteEmployee(@PathVariable("id")Long empId) {
		employeeService.deleteEmployee(empId);
	}
	
	@GetMapping("/email/{email}")
	public ResponseEntity<List<Employee>> searchByEmail(@PathVariable("email")String email){
	
	List<Employee> emp= employeeService.searchByEmail(email);
				
	return new ResponseEntity<List<Employee>>(emp, HttpStatus.OK);	
	}
	
	@GetMapping("/{skill}")
	public ResponseEntity<List<Employee>> searchBySkill1(@PathVariable("skill") String skill1){
		List<Employee> e=employeeService.searchBySkill1(skill1);
		return new ResponseEntity<List<Employee>>(e,HttpStatus.OK);
 	}
	
	@GetMapping("/{skills}")
	public ResponseEntity<List<Employee>> searchBySkill2(@PathVariable("skills") String skill2){
		List<Employee> e=employeeService.searchBySkill2(skill2);
		return new ResponseEntity<List<Employee>>(e,HttpStatus.OK);
 	}
}


