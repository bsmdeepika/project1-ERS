package com.ers.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ers.entity.ApproveDenyEntity;
import com.ers.entity.EmployeeBillEntity;
import com.ers.service.EmployeeRegistrationServiceImpl;


public class DisReimtoemp extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		String id=request.getParameter("id");
		Integer newid=Integer.parseInt(id);
		EmployeeRegistrationServiceImpl employeeService =new EmployeeRegistrationServiceImpl();
		List<ApproveDenyEntity> elist=employeeService.reimforemp(newid);
		out.println("<table width=200 height=200 border=1>");
		out.println("<caption> Employee Details </caption>");
		
		for(ApproveDenyEntity e:elist) {
			
			out.println("<tr><td>"+e.getName()+"</td>"+"<td>"+e.getEmail()+"</td>"+"<td>"+e.getReimbursementType()+"</td>"+"<td>"+e.getBillNumber()+"</td>"+"<td>"+e.getAmount()+"</td>"+"<td>"+e.getStatus()+"</td></tr>");
		}
		out.println("</table>");
		
		out.println("<form action='employeehome.html'> <input type='submit' value='back to Home'></form> ");
		
	}

	

}
