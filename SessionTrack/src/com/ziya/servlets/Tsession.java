package com.ziya.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Tsession extends HttpServlet{
protected void service(HttpServletRequest req,HttpServletResponse resp)throws ServletException, IOException{
		
		PrintWriter out=resp.getWriter(); 
		
		
		
		    HttpSession session=req.getSession(true);  
	        String name=(String)session.getAttribute("uname");  
	        int count = (int) session.getAttribute("ucount");
	        
	        out.println("<h1>Welcome  <mark>"+name+"</mark></h1><br>");
			
	        out.println("<h3>You visit this site<mark> "+count+" </mark> times</h3<br>");  
	  
            int timeInterval=session.getMaxInactiveInterval();
			
	        
	        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	      
	        Date created = new Date(session.getCreationTime());
	        ;
	        out.println("<h3>Time When Session Was Created- <mark>"+formatter.format(created)+"</mark><h3><br>");
	         
	      
	       
	        out.println("<h3>Time Interval :<mark> "+timeInterval/60+"</mark>  Min.</h3>");
	        
		
		
			
		}

}
