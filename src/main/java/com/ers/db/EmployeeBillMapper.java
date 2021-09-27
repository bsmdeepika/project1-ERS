package com.ers.db;

import com.ers.entity.EmployeeBillEntity;
import com.ers.entity.EmployeeEntity;
import com.ers.model.Employee;
import com.ers.model.EmployeeBill;

public class EmployeeBillMapper {
	public static EmployeeBillEntity mapEmployeeBill(EmployeeBill e) {
		EmployeeBillEntity entity=new EmployeeBillEntity();
		entity.setAmount(e.getAmount());
		entity.setBillNumber(e.getBillNumber());
		entity.setEmployeeId(e.getId());
		entity.setEmployeeName(e.getName());
		entity.setReimbusementType(e.getReimbursementType());
		
		return entity;
		
	}

}
