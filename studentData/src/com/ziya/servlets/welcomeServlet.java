package com.ziya.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class welcomeServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException{
		PrintWriter out=res.getWriter();
		out.print("Welcome dear");
	}

}
