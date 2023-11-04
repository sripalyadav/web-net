package com.sripal.Emp_mngnt_project.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "EMDT")
@Data
public class Employee {
	

	@Id
	@Column(name = "EMployee_Id")
	private int employeeid;
	
	@Column(name = "Employee_Name")
	private String employeename;
	
	@Column(name = "Date Of Birth")
	private String dob;

@Column(name = "Age")
	private String age;

	
	@Column(name = "Gender")
	private String gender;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "Password")
	private String password;
	
	@Column(name = "Address")
	private String address;
	
	@Column(name = "Mobile")
	private long mobile;
	
	
	
	
}
