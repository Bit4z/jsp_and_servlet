package com.ziya.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		String name=req.getParameter("Username");
			PrintWriter out=res.getWriter();
					out.print("Welcome"+name);
					Cookie ck=new Cookie("Uname",name);
					res.addCookie(ck);
					out.print("<form action='servlet2'>");
					out.print("<input type='submit' value='go'>");
					out.print("</form>");
					out.close();
	}

}
