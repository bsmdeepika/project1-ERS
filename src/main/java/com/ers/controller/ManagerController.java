package com.ers.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ers.dao.RequestdaoImpl;


public class ManagerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			String id=request.getParameter("id");
			String type=request.getParameter("type");
			
			out.println(id +"  "+type);
			
			RequestdaoImpl rdao=new RequestdaoImpl();
			rdao.updateRequest(Integer.parseInt(id), type);
		
		}
}
