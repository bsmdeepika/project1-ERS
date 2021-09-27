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
 * Servlet implementation class ListAllEmployeeForUpdate
 */
public class ListAllEmployeeForUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListAllEmployeeForUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		EmployeeRegistrationServiceImpl employeeService =new EmployeeRegistrationServiceImpl();

		List<EmployeeEntity> elist=employeeService.displayAllEmployees();
		PrintWriter out=response.getWriter();
		
			out.println("<form>");
			out.println("<select>");
			
			for(EmployeeEntity e:elist) {
				
				out.println("<option name='id'> "+e.getEmployeeId());
			}
			out.println("</select></form>");
			
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	

}
