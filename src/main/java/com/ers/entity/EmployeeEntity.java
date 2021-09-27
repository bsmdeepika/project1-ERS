package com.ers.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="employeeproject1")
public class EmployeeEntity {
		@Id
		private Integer employeeId;
		private String password;
		private String employeeName;
		private String designation;
		public EmployeeEntity() {}
		@OneToMany(cascade=CascadeType.ALL,targetEntity=ReimbursementRequest.class)
		@JoinTable(name="emp_request")
	//	@JoinColumn(name="rid")
        Set<ReimbursementRequest> requestset;
		// EmployeeEntity () {}
		public Set<ReimbursementRequest> getRequestset() {
			return requestset;
		}
		public void setRequestset(Set<ReimbursementRequest> requestset) {
			this.requestset = requestset;
		}
	
		public void setEmployeeId(Integer employeeId) {
			this.employeeId=employeeId;
		}
		public Integer getEmployeeId() {
			return employeeId;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
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
		private String department;
		private String email;
		private String type;


}
