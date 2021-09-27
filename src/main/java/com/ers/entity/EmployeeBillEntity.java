package com.ers.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="finalreimbursement")
public class EmployeeBillEntity {
	private Integer employeeId;
	private String employeeName;
	@Id
	private Integer billNumber;
	private Integer amount;
	private String reimbusementType;
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Integer getBillNumber() {
		return billNumber;
	}
	public void setBillNumber(Integer billNumber) {
		this.billNumber = billNumber;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String getReimbusementType() {
		return reimbusementType;
	}
	public void setReimbusementType(String reimbusementType) {
		this.reimbusementType = reimbusementType;
	}
	
	
}
