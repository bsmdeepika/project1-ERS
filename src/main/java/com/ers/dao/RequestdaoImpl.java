package com.ers.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.ers.db.EmployeeMapper;
import com.ers.db.HibernateUtil;
import com.ers.entity.EmployeeEntity;
import com.ers.entity.ReimbursementRequest;

public class RequestdaoImpl implements RequestDao {
	public void updateRequest(Integer rid,String status) {
		
		 try {
				
				Session session=HibernateUtil.getSessionFactory().openSession();
				//session i sused for communicating with db
				session.beginTransaction();  //insert,update,delete,  not required for select
				
			
				ReimbursementRequest ee1=session.load(ReimbursementRequest.class, rid);
				ee1.setStatus(status);
				
				//session.delete(ee1);
				session.merge(ee1);  //update
			
				System.out.println("status...");
				session.getTransaction().commit();
				session.close();
				
			} catch (Exception e1) {
				
				e1.printStackTrace();
			}
		
	}
	
	 public List<Integer> displayAllRequests(){
		 
		 List<Integer> list=new ArrayList<Integer>();
		 
		 try {
				
				Session session=HibernateUtil.getSessionFactory().openSession();
				Query q=session.createQuery("select rid from ReimbursementRequest");
				//TypedQuery q1=session.
				
				list=q.list();	
				
			} catch (Exception e1) {
				
				e1.printStackTrace();
			}
			 
			return list;
		
		 
	 }

}
