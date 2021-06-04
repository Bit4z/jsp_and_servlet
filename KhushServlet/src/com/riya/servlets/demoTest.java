package com.riya.servlets;

import java.io.PrintWriter;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class demoTest extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException
	{
		String name=req.getParameter("Username");
		String pass=req.getParameter("Password");
		PrintWriter out=res.getWriter();
		//out.print("hi"+name);
		if(name.equalsIgnoreCase("ziya")&&pass.equals("123")) {
			RequestDispatcher rd=req.getRequestDispatcher("welcome");
			rd.forward(req, res);
			
		}
		else {
			RequestDispatcher rd=req.getRequestDispatcher("index.html");
			rd.include(req, res);
			out.print("User Id and Password are invalid");
		}
		
	}

}
