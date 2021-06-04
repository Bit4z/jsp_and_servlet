package com.riya.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class welcomeServlet extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse resp )throws IOException{
		PrintWriter out=resp.getWriter();
		out.print("<h1>Welcome dear");
		
	}

}
