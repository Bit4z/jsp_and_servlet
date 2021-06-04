package com.ziya.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class abhishek extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		String name=req.getParameter("username");
		PrintWriter out=res.getWriter();
		out.print("<h1><center>Login Successfully</center></h1>");
		out.print("<h3><center>Welcome\t"+name+"</center></h3>");
	}

}
