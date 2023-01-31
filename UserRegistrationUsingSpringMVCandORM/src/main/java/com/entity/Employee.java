package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EmployeeDetails")
public class Employee {
	@Id
	@Column(name="EmployeeName")
	private String name;
	@Column(name="EmployeeEmail")
	private String email;
	@Column(name="EmployeeContact")
	private String phoneNumber;
	@Column(name="EmployeeGender")
	private String gender;
	@Column(name="EmployeeAddress")
	private String address;
	@Column(name="EmployeeSalary")
	private String salary;
	@Column(name="EmployeeDept")
	private String departmentName;
	@Column(name="Specialization")
	private String specialization;
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getGender() {
		return gender;
	}
	public String getAddress() {
		return address;
	}
	public String getSalary() {
		return salary;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + ", gender=" + gender
				+ ", address=" + address + ", salary=" + salary + ", departmentName=" + departmentName
				+ ", specialization=" + specialization + "]";
	}
	
}
