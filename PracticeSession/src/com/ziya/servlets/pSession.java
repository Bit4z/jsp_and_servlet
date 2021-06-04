package com.ziya.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.Enumeration;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class pSession extends HttpServlet{
	private static final Object String = null;
	int count=1;

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		
	
		String name=req.getParameter("Name");
		PrintWriter out=res.getWriter();
		HttpSession session=req.getSession();
		session.setAttribute("Count",count);
		if(name.equals(session.getAttribute("uname")))
		{
			
			count=count+1;
			out.print("welcome back our website"+session.getAttribute("uname"));
			out.print("<br>");
			out.print("Your"+" "+count+"visit");
			session.setAttribute("Count",count);
		}
		else {
			count=1;
			session.setAttribute("uname",name);
			out.print("welcome  "+session.getAttribute("uname"));
			out.print("Your"+" "+count+"visit");
			
			
		}
	
		
		session.setAttribute("Count",count);
		//out.print("welcome"+session.getAttribute("uname"));
		int timeInterval=session.getMaxInactiveInterval()/60;
		Date created = new Date(session.getCreationTime());
		Date lat=new Date(session.getLastAccessedTime());
		out.print("<br>");
		out.println(timeInterval);
		out.print("<br>");
		out.println(created);
		out.print("<br>");
		out.println(lat);
		Enumeration enm=session.getAttributeNames();
		while(enm.hasMoreElements()) {
			out.print(enm.hasMoreElements());
			
		}
		//out.print("<a href='dyn'>"+"click here"+"</a>");
	}


}
