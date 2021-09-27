package com.ers.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ers.entity.EmployeeEntity;
import com.ers.service.EmployeeRegistrationServiceImpl;

/**
 * Servlet implementation class DisplayEmployeeServlet
 */
public class DisplayEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String id=request.getParameter("id");
		Integer newid=Integer.parseInt(id);
		EmployeeRegistrationServiceImpl employeeService =new EmployeeRegistrationServiceImpl();
		PrintWriter out=response.getWriter();
		List<EmployeeEntity> elist=employeeService.detailsofemployee(newid);
		out.println("<caption> Employee Details </caption><br>");
		
		for(EmployeeEntity e:elist) {
			
			out.println("ID: "+e.getEmployeeId()+"<br>");
			out.println("Name: "+e.getEmployeeName()+"<br>");
			out.println("Email :"+e.getEmail()+"<br>");
			out.println("Department :"+e.getDepartment()+"<br>");
			out.println("Designation: "+e.getDesignation()+"<br>");
		}
		
		out.println("<form action='employeehome.html'> <input type='submit' value='back to Home'></form> ");
		

		
	}


}
