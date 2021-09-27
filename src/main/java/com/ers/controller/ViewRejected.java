package com.ers.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ers.entity.ApproveDenyEntity;
import com.ers.service.EmployeeRegistrationServiceImpl;


public class ViewRejected extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		EmployeeRegistrationServiceImpl employeeService =new EmployeeRegistrationServiceImpl();
		PrintWriter out=response.getWriter();
		List<ApproveDenyEntity> adlist=employeeService.viewrejected();
		out.println("<table width=200 height=200 border=1>");
		out.println("<caption>All reimbursement details with their status</caption>");
		
		for(ApproveDenyEntity e:adlist) {
			
			out.println("<tr><td>"+e.getEid()+"</td>"+"<td>"+e.getName()+"</td>"+"<td>"+e.getEmail()+"</td>"+"<td>"+e.getReimbursementType()+"</td>"+"<td>"+e.getBillNumber()+"</td>"+"<td>"+e.getAmount()+"</td>"+"<td>"+e.getStatus()+"</td></tr>");
		}
		out.println("</table>");
		
		out.println("<form action='ManagerHome.html'> <input type='submit' value='back to Home'></form> ");
		
	}

	

}
