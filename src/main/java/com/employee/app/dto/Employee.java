package com.employee.app.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_db")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	private String name;
	private String email;
	private double mobile;
	private String password;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String name, String email, double mobile,String password) {
		super();
		this.eid = eid;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.password=password;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getMobile() {
		return mobile;
	}

	public void setMobile(double mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
