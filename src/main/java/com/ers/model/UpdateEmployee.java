package com.ers.model;

public class UpdateEmployee {
	private String employeeId;
	private String employeeName;
	private String designation;
	private String department;
	private String email;
	private String type;
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "UpdateEmployee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", designation="
				+ designation + ", department=" + department + ", email=" + email + ", type=" + type + "]";
	}
	public UpdateEmployee(String employeeId, String employeeName, String designation, String department, String email,
			String type) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.designation = designation;
		this.department = department;
		this.email = email;
		this.type = type;
	}
	public UpdateEmployee() {
		super();
	}
	

}
