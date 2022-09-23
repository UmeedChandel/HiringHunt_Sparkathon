package com.hiringhunt.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	
	@Override
	public Employee addEmployee(Employee employee) {
		return employeeRepository.save(employee);
		
	}


	@Override
	public List<Employee> viewAllEmployee() {
		return employeeRepository.findAll();
	}


	@Override
	public Employee editEmployeeDetails(Employee employee) {
		
		return employeeRepository.save(employee);
	}


	


	@Override
	public List<Employee> searchByEmail(String email) {
		List<Employee> list=employeeRepository.findByEmail(email);
		if (list.isEmpty()) {
			throw new EmployeeException("No such email found");
		} else {
			return list;
		}
	}


	@Override
	public List<Employee> searchBySkill1(String skill1) {
		List<Employee> l=employeeRepository.findBySkill1(skill1);
		if (l.isEmpty()) {
			throw new EmployeeException("No such skills found");
		} else {
			return l;
		}
	}


	@Override
	public List<Employee> searchBySkill2(String skill2) {
		List<Employee> ll=employeeRepository.findBySkill2(skill2);
		if (ll.isEmpty()) {
			throw new EmployeeException("No such skills found");
		} else {
			return ll;
		}
	}


	@Override
	public void deleteEmployee(long empId) {
		employeeRepository.deleteById(empId);
		
	}
	
	

}
