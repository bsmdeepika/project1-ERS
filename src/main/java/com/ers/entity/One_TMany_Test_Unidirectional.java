package com.ers.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;



public class One_TMany_Test_Unidirectional {

	public static void main(String[] args) {
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		session.beginTransaction();
		
		ReimbursementRequest r1=new ReimbursementRequest();
	//	r1.setRid(11);
		r1.setAmount(5000.00);
		
		ReimbursementRequest r2=new ReimbursementRequest();
	//	r1.setRid(22);
		r1.setAmount(5000.00);
		
		Set<ReimbursementRequest> set=new HashSet();
		set.add(r1);
		set.add(r2);
		
		EmployeeEntity e=new EmployeeEntity();
	//	e.setEmployeeId(300);
		e.setDepartment("IT");
		e.setDesignation("SE");
		e.setEmployeeName("RAM");
		e.setEmail("ram@gmail.com");
		e.setPassword("123456");
		e.setType("Manager");
		e.setRequestset(set);
		
		
		try{
			session.save(e);
			session.flush();
			System.out.println("Data inserted successfully");
			
			
			/*List<EmployeeEntity> blist=session.createQuery("from EmployeeEntity b ").list();
			for( EmployeeEntity b: blist) {
				Set<ReimbursementRequest> sset=b.getRequestset();
				System.out.println(b.getEmployeeId());
				for( ReimbursementRequest ss:sset)
				{  System.out.println(ss.getRid()+"   "+ss.getAmount());
					
				}
				
			}*/
			
			
			
		}catch(HibernateException e1){
			e1.printStackTrace();
		}
		finally{
			session.getTransaction().commit();
			
			if(session!=null){
				session.close();
			}
		}
		
		
		
		
	}
	

}
