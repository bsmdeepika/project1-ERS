package com.ers.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.ers.db.HibernateUtil;
import com.ers.model.Employee;
import com.ers.model.UpdateEmployee;
import com.ers.service.EmployeeRegistrationServiceImpl;


public class UpdateEmployeeServlet extends HttpServlet {
    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String empid=request.getParameter("id");
		String name=request.getParameter("name");
		String des=request.getParameter("des");
		String dep=request.getParameter("dep");
		String email=request.getParameter("email");
		String type=request.getParameter("type");
	
		
		Employee um=new Employee();
		um.setEmployeeId(Integer.parseInt(empid));
		um.setEmployeeName(name);
		um.setDepartment(dep);
		um.setDesignation(des);
		um.setEmail(email);
		um.setType(type);
		
		
EmployeeRegistrationServiceImpl employeeService =new EmployeeRegistrationServiceImpl();
		
		employeeService.updateEmployee(um);
		
		RequestDispatcher rd=request.getRequestDispatcher("employeehome.html");
		
		rd.forward(request, response);
	}

	

}
