package com.ziya.servlets;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class welcomeServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException{
		String name=req.getParameter("username");
		PrintWriter out=res.getWriter();
		out.print("<h1>Welcome dear</h1>"+name);
	}


}
