package com.ers.service;

import java.util.List;

import com.ers.dao.EmployeeRegistrationDaoImpl;
import com.ers.entity.ApproveDenyEntity;
import com.ers.entity.EmployeeBillEntity;
import com.ers.entity.EmployeeEntity;
import com.ers.model.ApproveDeny;
import com.ers.model.Employee;
import com.ers.model.EmployeeBill;
import com.ers.model.UpdateEmployee;

public class EmployeeRegistrationServiceImpl implements EmployeeRegistrationService {
	EmployeeRegistrationDaoImpl employeeDao=new EmployeeRegistrationDaoImpl();
	 public void addEmployee(Employee e) {
		 employeeDao.addEmployee(e);
		 
	 }
	 public void updateEmployee(Employee e){
		 employeeDao.updateEmployee(e);
	 }
	 public List<EmployeeEntity> displayAllEmployees(){
		 
		 return employeeDao.displayAllEmployees();
	 }
	 public void addReimbursementDetails(EmployeeBill ee) {
		 employeeDao.addReimbursementDetails(ee);
	 }
	 public EmployeeEntity employeelogin(Integer id,String pass) {
		return  employeeDao.employeelogin(id, pass);
	 }
	 public EmployeeEntity managerlogin(Integer id,String pass) {
		 return employeeDao.managerlogin(id, pass);
	 }
	 public List<EmployeeBillEntity> displayAllReimbursement(){
		return  employeeDao.displayAllReimbursement();
	 }
	 public List<EmployeeEntity> detailsofemployee(Integer id){
		return  employeeDao.detailsofemployee(id);
	 }
	 public void addapprovedeny(ApproveDeny ad) {
		 employeeDao.addapprovedeny(ad);
	 }
	 public List<ApproveDenyEntity> allreqwithstatus(){
		 return employeeDao.allreqwithstatus();
	 }
	 public List<ApproveDenyEntity> reimforemp(Integer newid){
		 return employeeDao.reimforemp(newid);
	 }
	 public List<ApproveDenyEntity> viewapproved(){
		 return employeeDao.viewapproved();
	 }
	 public List<ApproveDenyEntity> viewrejected(){
		 return employeeDao.viewrejected();
	 }
	 public List<ApproveDenyEntity> displayreimofemp(Integer newid){
		 return employeeDao.displayreimofemp(newid);
	 }
}
