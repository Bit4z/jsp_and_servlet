package com.ziya.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionManage extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("deprecation")
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		String name=req.getParameter("Name");
		res.setContentType("text/html");
		HttpSession session=req.getSession();
		PrintWriter out=res.getWriter();
		Integer Count=(Integer)session.getAttribute("Count");
		if(Count==null)
		{
			Count=new Integer(0);
			out.println("Welcome inside<br> Access Count:"+Count);
			
		}
		else
		{
			Count=new Integer(Count.intValue()+1);
			out.println("Welcome Back <br> Access count:"+Count);
			
		}
		session.setAttribute("AccessCount", Count);
		int TIM=session.getMaxInactiveInterval()/(60*1000);
		out.println("Creation Time:"+new Date(session.getCreationTime())+"<br>"+"Maximum Inactive Time Interval:"+TIM);
	}
}
