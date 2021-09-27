package com.ers.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ers.entity.EmployeeBillEntity;
import com.ers.entity.EmployeeEntity;
import com.ers.service.EmployeeRegistrationServiceImpl;

public class DisplayAllReimbursement extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		EmployeeRegistrationServiceImpl employeeService =new EmployeeRegistrationServiceImpl();
		PrintWriter out=response.getWriter();
		List<EmployeeBillEntity> elist=employeeService.displayAllReimbursement();
		out.println("<table width=200 height=200 border=1>");
		out.println("<caption> Employee Details </caption>");
		
		for(EmployeeBillEntity e:elist) {
			
			out.println("<tr><td>"+e.getEmployeeId()+"</td>"+"<td>"+e.getEmployeeName()+"</td>"+"<td>"+e.getReimbusementType()+"</td>"+"<td>"+e.getBillNumber()+"</td>"+"<td>"+e.getAmount()+"</td></tr>");
		}
		out.println("</table>");
		
		out.println("<form action='index.jsp'> <input type='submit' value='back to Home'></form> ");
		
	}

	

}
