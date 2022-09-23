package com.hiringhunt.employee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

	List<Employee> findByEmail(String email);

	List<Employee> findBySkill1(String skill1);

	List<Employee> findBySkill2(String skill2);
     
}
