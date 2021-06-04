package com.ziya.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionTrack4 extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		    throws ServletException, java.io.IOException {
		        
		    HttpSession session = request.getSession(false);
		    if (session == null){
		        response.sendRedirect("/dbproj/login.jsp");
		      } else {
		        response.sendRedirect("/dbproj/menu.jsp");
		    }
		       
		     
		  } 

}
