package com.ers.model;

public class ApproveDeny {
	private Integer eid;
	private String name;
	private Integer billNumber;
	private String reimbursementtype;
	private String status;
	private String email;
	private Integer amount;
	
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
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
	public String getReimbursementtype() {
		return reimbursementtype;
	}
	public void setReimbursementtype(String reimbursementtype) {
		this.reimbursementtype = reimbursementtype;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public ApproveDeny() {
	}
	public ApproveDeny(Integer eid, String name, Integer billNumber, String reimbursementtype, String status,
			String email, Integer amount) {
		super();
		this.eid = eid;
		this.name = name;
		this.billNumber = billNumber;
		this.reimbursementtype = reimbursementtype;
		this.status = status;
		this.email = email;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "ApproveDeny [eid=" + eid + ", name=" + name + ", billNumber=" + billNumber + ", reimbursementtype="
				+ reimbursementtype + ", status=" + status + ", email=" + email + ", amount=" + amount + "]";
	}
	
	
}
