package com.ers.db;

import com.ers.entity.ApproveDenyEntity;
import com.ers.entity.EmployeeBillEntity;
import com.ers.model.ApproveDeny;
import com.ers.model.EmployeeBill;

public class ApproveDenyMapper {
	
	public static ApproveDenyEntity mapAprroveDeny(ApproveDeny e) {
		ApproveDenyEntity entity=new ApproveDenyEntity();
		entity.setAmount(e.getAmount());
		entity.setEid(e.getEid());
		entity.setBillNumber(e.getBillNumber());
		entity.setEmail(e.getEmail());
		entity.setName(e.getName());
		entity.setReimbursementType(e.getReimbursementtype());
		entity.setStatus(e.getStatus());
		
	
	
		return entity;
		
	}

}
