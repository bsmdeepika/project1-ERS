package com.ers.dao;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ers.db.ApproveDenyMapper;
import com.ers.db.EmployeeBillMapper;
import com.ers.db.EmployeeMapper;
import com.ers.db.HibernateUtil;
import com.ers.entity.ApproveDenyEntity;
import com.ers.entity.EmployeeBillEntity;
import com.ers.entity.EmployeeEntity;
import com.ers.model.ApproveDeny;
import com.ers.model.Employee;
import com.ers.model.EmployeeBill;
import com.ers.model.UpdateEmployee;

public class EmployeeRegistrationDaoImpl {
	public void updateEmployee(Employee e)
	{
		try {
			Session session=HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction(); 
			EmployeeEntity ee = EmployeeMapper.mapEmployee(e);
			EmployeeEntity ee1 = session.get(EmployeeEntity.class,ee.getEmployeeId());
			//ee1.setEmployeeId(ee.getEmployeeId());
			ee1.setPassword(ee.getPassword());
			ee1.setEmployeeName(ee.getEmployeeName());
			ee1.setDepartment(ee.getDepartment());
			ee1.setDesignation(ee.getDesignation());
			ee1.setEmail(ee.getEmail());
			ee1.setType(ee.getType());
			
			session.merge(ee1);
			session.flush();
			System.out.println("Profile updated.....");
			
			session.getTransaction().commit();
			//session.close();
			
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
	}
	public List<ApproveDenyEntity> allreqwithstatus(){
		List<ApproveDenyEntity> adlist=new ArrayList<ApproveDenyEntity>();
		try {
			
			Session session=HibernateUtil.getSessionFactory().openSession();
			Query que=session.createQuery("from ApproveDenyEntity ade");
			adlist=que.list();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return adlist;
	}
	
	public List<EmployeeEntity> displayAllEmployees(){
		List<EmployeeEntity> elist=new ArrayList<EmployeeEntity>();
		
try {
			
			Session session=HibernateUtil.getSessionFactory().openSession();
			Query q=session.createQuery("from EmployeeEntity e"); //native ,namedquery,hql
			elist=q.list();	
			
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
		 
		return elist;
	}
	public void addapprovedeny(ApproveDeny ad) {
		try {
			Session session=HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(ApproveDenyMapper.mapAprroveDeny(ad));
			System.out.println("Status updated into the database......");
			session.getTransaction().commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 public void addEmployee(Employee e) {
		
		try {
			
			Session session=HibernateUtil.getSessionFactory().openSession();
			//session i sused for communicating with db
			session.beginTransaction();  //insert,update,delete,  not required for select
			session.save(EmployeeMapper.mapEmployee(e));
			System.out.println("employee inserted...");
			session.getTransaction().commit();
			
			
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
		 
	 }
	 public void addReimbursementDetails(EmployeeBill e) {

			try {
				Session session=HibernateUtil.getSessionFactory().openSession();
				session.beginTransaction();
				session.save(EmployeeBillMapper.mapEmployeeBill(e));
				System.out.println("bill details inserted...");
				session.getTransaction().commit();
				
			} catch (HibernateException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
	 }
	
	public EmployeeEntity employeelogin(Integer id,String pass) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		EmployeeEntity ee=null;
		List<EmployeeEntity> list=new ArrayList<EmployeeEntity>();
		try {
			
			Query q=session.createQuery("FROM EmployeeEntity e  WHERE e.employeeId=:id and e.password=:pass");
			q.setParameter("id", id);
			q.setParameter("pass", pass);
			list=q.list();
			System.out.println(id+" "+pass);
			if(!list.isEmpty()) {
				ee=list.get(0);
			}
		} catch (HibernateException e1) {
			// TODO Auto-generated catch block
			e1.getMessage();
		}
		finally {
			if(session!=null) {
				session.close();
			}
		}
		System.out.println(ee);
		return ee;
		
	 }
	public EmployeeEntity managerlogin(Integer id,String pass) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		EmployeeEntity ee=null;
		List<EmployeeEntity> list=new ArrayList<EmployeeEntity>();
		try {
			
			Query q=session.createQuery("FROM EmployeeEntity e  WHERE e.employeeId=:id and e.password=:pass");
			q.setParameter("id", id);
			q.setParameter("pass", pass);
			list=q.list();
			System.out.println(id+" "+pass);
			if(!list.isEmpty()) {
				ee=list.get(0);
			}
		} catch (HibernateException e1) {
			// TODO Auto-generated catch block
			e1.getMessage();
		}
		finally {
			if(session!=null) {
				session.close();
			}
		}
		System.out.println(ee);
		return ee;
		
	 }
	
	 public List<EmployeeBillEntity> displayAllReimbursement(){
		 List<EmployeeBillEntity> list=new ArrayList<EmployeeBillEntity>();
			
		 try {
		 			
		 			Session session=HibernateUtil.getSessionFactory().openSession();
		 			Query q=session.createQuery("from EmployeeBillEntity e"); 
		 			list=q.list();	
		 			
		 		} catch (Exception e1) {
		 			
		 			e1.printStackTrace();
		 		}
		 		 
		 		return list;
		 	}
		 
	 public List<EmployeeEntity> detailsofemployee(Integer id){
		 List<EmployeeEntity> elist=new ArrayList<EmployeeEntity>();
		 try {
			Session session=HibernateUtil.getSessionFactory().openSession();
			 String q="From EmployeeEntity f where f.employeeId=\'"+id+"\'";
			 Query q1=session.createQuery(q);
			 elist=q1.list();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return elist;
	 }
	 public List<ApproveDenyEntity> reimforemp(Integer newid){
		 List<ApproveDenyEntity> elist=new ArrayList<ApproveDenyEntity>();
		 try {
			Session session=HibernateUtil.getSessionFactory().openSession();
			 String q="From ApproveDenyEntity f where f.eid=\'"+newid+"\' ";
			 Query q1=session.createQuery(q);
			 elist=q1.list();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return elist;
		 
	 }
	 public List<ApproveDenyEntity> viewapproved(){
		 List<ApproveDenyEntity> elist=new ArrayList<ApproveDenyEntity>();
		 try {
			Session session=HibernateUtil.getSessionFactory().openSession();
			 String q="From ApproveDenyEntity f where f.status='accepted'";
			 Query q1=session.createQuery(q);
			 elist=q1.list();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return elist;
	 }
	 public List<ApproveDenyEntity> viewrejected(){
		 List<ApproveDenyEntity> elist=new ArrayList<ApproveDenyEntity>();
		 try {
			Session session=HibernateUtil.getSessionFactory().openSession();
			 String q="From ApproveDenyEntity f where f.status='rejected'";
			 Query q1=session.createQuery(q);
			 elist=q1.list();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return elist;
	 }
	 public List<ApproveDenyEntity> displayreimofemp(Integer newid){
		 List<ApproveDenyEntity> elist=new ArrayList<ApproveDenyEntity>();
		 try {
			Session session=HibernateUtil.getSessionFactory().openSession();
			 String q="From ApproveDenyEntity f where f.eid=\'"+newid+"\'";
			 Query q1=session.createQuery(q);
			 elist=q1.list();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return elist;
	 }
	 
}

