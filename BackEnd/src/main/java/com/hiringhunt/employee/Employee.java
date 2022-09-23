package com.hiringhunt.employee;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	    @Id
	    long empId;
	    String firstname;
	    String lastname;
	    String organisation;
	    long phoneno;
	    String email;
	    String location;
	    String skill1;
	    String skill2;
	    String otherskills;
	    
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Employee(long empId, String firstname, String lastname, String organisation, long phoneno, String email,
				String location, String skill1, String skill2, String otherskills) {
			super();
			this.empId = empId;
			this.firstname = firstname;
			this.lastname = lastname;
			this.organisation = organisation;
			this.phoneno = phoneno;
			this.email = email;
			this.location = location;
			this.skill1 = skill1;
			this.skill2 = skill2;
			this.otherskills = otherskills;
		}

		public long getEmpId() {
			return empId;
		}

		public String getFirstname() {
			return firstname;
		}

		public String getLastname() {
			return lastname;
		}

		public String getOrganisation() {
			return organisation;
		}

		public long getPhoneno() {
			return phoneno;
		}

		public String getEmail() {
			return email;
		}

		public String getLocation() {
			return location;
		}

		public String getSkill1() {
			return skill1;
		}

		public String getSkill2() {
			return skill2;
		}

		public String getOtherskills() {
			return otherskills;
		}

		public void setEmpId(long empId) {
			this.empId = empId;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		public void setOrganisation(String organisation) {
			this.organisation = organisation;
		}

		public void setPhoneno(long phoneno) {
			this.phoneno = phoneno;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public void setSkill1(String skill1) {
			this.skill1 = skill1;
		}

		public void setSkill2(String skill2) {
			this.skill2 = skill2;
		}

		public void setOtherskills(String otherskills) {
			this.otherskills = otherskills;
		}
		
		

}