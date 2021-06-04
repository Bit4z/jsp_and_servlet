package com.ziya.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		String uid=req.getParameter("Uid");
		String name=req.getParameter("Name");
		String pass=req.getParameter("Password");
		PrintWriter out=res.getWriter();
		req.getRequestDispatcher("info.html").include(req, res);
		Cookie ck=new Cookie("Uid","Password");
		ck.setMaxAge(0);
		res.addCookie(ck);
		out.print("yuo are succesfully logged out g");
		
		
	}

}
