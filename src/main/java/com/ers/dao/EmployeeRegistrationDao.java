package com.ers.dao;
import java.util.List;

import com.ers.entity.ApproveDenyEntity;
import com.ers.entity.EmployeeBillEntity;
import com.ers.entity.EmployeeEntity;
import com.ers.model.ApproveDeny;
import com.ers.model.Employee;
import com.ers.model.EmployeeBill;
import com.ers.model.UpdateEmployee;

public interface EmployeeRegistrationDao {
	public void addEmployee(Employee e);
	public void addapprovedeny(ApproveDeny ad);
	public void addReimbursementDetails(EmployeeBill e);
	 public List<EmployeeEntity> displayAllEmployees();
	 public void updateEmployee(Employee e);
	 public EmployeeEntity employeelogin(String id,String pass);
	 public EmployeeEntity managerlogin(String id,String pass);
	 public List<EmployeeBillEntity> displayAllReimbursement();
	 public List<EmployeeEntity> detailsofemployee(Integer id);
	 public List<ApproveDenyEntity> allreqwithstatus();
	 public List<ApproveDenyEntity> reimforemp(Integer newid);
	 public List<ApproveDenyEntity> viewapproved();
	 public List<ApproveDenyEntity> viewrejected();
	 public List<ApproveDenyEntity> displayreimofemp(Integer newid);
}