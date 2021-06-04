package com.ziya.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class dataServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException, ServletException{
		String name=req.getParameter("Username");
		String email=req.getParameter("Email");
		String pass=req.getParameter("Password");
		PrintWriter out=res.getWriter();
		out.print("Welcome"+name);
		if(name.equalsIgnoreCase("ziya")&&pass.equals("123")) {
			RequestDispatcher rd=req.getRequestDispatcher("welcome");
			rd.forward(req, res);
		}
		else {
			RequestDispatcher rd=req.getRequestDispatcher("NewFile.html");
			rd.include(req,res);
		}
	}


}
