package com.ziya.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Msession extends HttpServlet{
	int cnt=1;
	@Override
	
	protected void service(HttpServletRequest req,HttpServletResponse resp)throws ServletException, IOException{
		
		PrintWriter out=resp.getWriter();  
		String name =req.getParameter("uname");
		
	    HttpSession session=req.getSession();
	  
	    
	    if(name.equals((String)session.getAttribute("uname"))) cnt= cnt+1;
	    else cnt=1; 
	    
	    session.setAttribute("uname",name); 
	    

	    out.println("Welcome "+name);
	 
	    
	    session.setAttribute("ucount",cnt); 
	    resp.sendRedirect("welServlet");

		
			
		}

}
