package com.hiringhunt.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer userId;
	private String firstName;
	private String lastName;
	private long employeeId;
	private String company;
	@Column(unique=true,nullable=false,length=40)
	private String email;
	@Column(unique=true,nullable=false,length=40)
	private String password;
	
	@Enumerated(EnumType.STRING)
	private Role role;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(String firstName, String lastName, long employeeId, String company, String email, String password,
			Role role) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.company = company;
		this.email = email;
		this.password = password;
		this.role = role;
	}


	public Integer getUserId() {
		return userId;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public long getEmployeeId() {
		return employeeId;
	}


	public String getCompany() {
		return company;
	}


	public String getEmail() {
		return email;
	}


	public String getPassword() {
		return password;
	}


	public Role getRole() {
		return role;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public void setRole(Role role) {
		this.role = role;
	}
	
	
	
	
	
	
}
