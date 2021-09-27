package com.ers.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ers.entity.EmployeeEntity;
import com.ers.service.EmployeeRegistrationServiceImpl;


public class ManagerLoginServlet extends HttpServlet {
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		//String Type=request.getParameter("type");
		
		Integer newid=Integer.parseInt(id);
EmployeeRegistrationServiceImpl employeeService =new EmployeeRegistrationServiceImpl();
	EmployeeEntity e=employeeService.managerlogin(newid, password);
	RequestDispatcher rd=null;
if(e==null) {
	out.println("Incorrect credentials");
	rd=request.getRequestDispatcher("index.jsp");
	rd.forward(request, response);
}
else{
	rd=request.getRequestDispatcher("ManagerHome.html");
	rd.forward(request, response);
}
	
	
		
		
	}

	

}
