package com.ziya.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
	PrintWriter out=res.getWriter();
	req.getRequestDispatcher("info.html").include(req,res);
	Cookie cookie[]=req.getCookies();
	if(cookie==null) {
		out.print("there is no cookie");
	}
	else {
		for(Cookie c:cookie)
		{
			out.print(c.getName()+":\n"+c.getValue()+"\n");
		}
	}
		
		
		
		
		
		
		
	}

}
