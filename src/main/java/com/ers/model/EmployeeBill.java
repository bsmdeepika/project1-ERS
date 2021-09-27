package com.ers.model;

public class EmployeeBill {
	private Integer id;
	private String name;
	private Integer billNumber;
	private Integer amount;
	private String reimbursementType;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
	@Override
	public String toString() {
		return "EmployeeBill [id=" + id + ", name=" + name + ", billNumber=" + billNumber + ", amount=" + amount
				+ ", reimbursementType=" + reimbursementType + "]";
	}
	public EmployeeBill(Integer id, String name, Integer billNumber, Integer amount, String reimbursementType) {
		super();
		this.id = id;
		this.name = name;
		this.billNumber = billNumber;
		this.amount = amount;
		this.reimbursementType = reimbursementType;
	}
	public EmployeeBill() {}
	public String getReimbursementType() {
		return reimbursementType;
	}
	public void setReimbursementType(String reimbursementType) {
		this.reimbursementType = reimbursementType;
	}
	

}
