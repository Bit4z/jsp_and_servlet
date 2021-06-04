package com.ziya.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Session extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		String n=req.getParameter("Name");
		String p=req.getParameter("Pass");
		PrintWriter out=res.getWriter();
		if(n.equals("ziya")&&p.equals("Khan"))
		{
			Cookie ck=new Cookie(n,p);
			res.addCookie(ck);
			req.getRequestDispatcher("Data").include(req, res);
					
		}
		else {
			req.getRequestDispatcher("Index.html").include(req, res);
			out.print("enter write data");
		}
		
	
	}	
		
		

}
