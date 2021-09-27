package com.ers.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ers.model.ApproveDeny;
import com.ers.service.EmployeeRegistrationServiceImpl;

public class ManagerApproval extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String type=request.getParameter("type");
		String amount=request.getParameter("amount");
		String status=request.getParameter("status");
		String billNum=request.getParameter("billNumber");
		
		ApproveDeny ad=new ApproveDeny();
		ad.setAmount(Integer.parseInt(amount));
		ad.setEid(Integer.parseInt(id));
		ad.setName(name);
		ad.setBillNumber(Integer.parseInt(billNum));
		ad.setEmail(email);
		ad.setReimbursementtype(type);
		ad.setStatus(status);
		
		EmployeeRegistrationServiceImpl employeeService =new EmployeeRegistrationServiceImpl();
		employeeService.addapprovedeny(ad);
	RequestDispatcher rd=request.getRequestDispatcher("ManagerHome.html");
		
		rd.forward(request, response);
		
		
		
	}

	

}
