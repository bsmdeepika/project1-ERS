package com.ers.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ers.dao.RequestdaoImpl;


public class DisplayRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public DisplayRequest() {}
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
       RequestdaoImpl rdao=new RequestdaoImpl();
		
		List<Integer> elist=rdao.displayAllRequests();
		PrintWriter out=response.getWriter();
		
			out.println("<form action='http://localhost:8086/ERS/ManagerController' method='get'>");
			out.println("<select name='id' >");
			
			for(Integer e:elist) {
				
				out.println("<option name='id'>"+e+"");
			}
			out.println("</select>");
			out.println("<input type='submit' name='type' value='approve'/>");
			out.println("<input type='submit' name='type' value='reject'/>");
			
			out.println("</form>");
	}

	}

	

