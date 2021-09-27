package com.ers.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ers.entity.ReimbursementRequest;
import com.ers.model.EmployeeBill;
import com.ers.service.EmployeeRegistrationServiceImpl;

/**
 * Servlet implementation class ReimbursementDetails
 */
public class ReimbursementDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReimbursementDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String amount=request.getParameter("amount");
		String billNumber=request.getParameter("billNumber");
		String reimbursementType=request.getParameter("type");
		
		
		EmployeeBill e=new EmployeeBill();
		e.setAmount(Integer.parseInt(amount));
		e.setBillNumber(Integer.parseInt(billNumber));
		e.setId(Integer.parseInt(id));
		e.setName(name);
		e.setReimbursementType(reimbursementType);
		
		
EmployeeRegistrationServiceImpl employeeService =new EmployeeRegistrationServiceImpl();
		
		employeeService.addReimbursementDetails(e);
		
		RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		
		rd.forward(request, response);
	}

	

}
