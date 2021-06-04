package com.ziya.servlets;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String name=req.getParameter("username");
		PrintWriter out=res.getWriter();
		out.print("Log in successfully");
		out.print("hi"+" "+name);
		
				
	}

}
