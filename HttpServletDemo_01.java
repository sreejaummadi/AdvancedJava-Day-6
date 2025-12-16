package com.codegnan.web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/demo")
public class HttpServletDemo_01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("Inside doGet()");
		out.close();
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("uname");
		String password=request.getParameter("upwd");
		String Email=request.getParameter("umail");
		String Mobile=request.getParameter("umobile");
		String Address=request.getParameter("uaddr");
		out.println("<html>");
		out.println("<p><b>User Name : </b>"+name+"</p>");
		out.println("<p><b>User Password : </b>"+password+"</p>");
		out.println("<p><b>User Email : </b>"+Email+"</p>");
		out.println("<p><b>User Mobile : </b>"+Mobile+"</p>");
		out.println("<p><b>User Address : </b>"+Address+"</p>");
		out.close();
	}

}
