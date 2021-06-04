package com.ziya.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TdataServlet extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException, ServletException{
		String uid=req.getParameter("Uid");
		String name=req.getParameter("Name");
		String age=req.getParameter("Age");
		String cl=req.getParameter("Class");
		PrintWriter out=res.getWriter();
		out.print("Welcome"+name);
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
	           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
			 String qry="insert into dtable(Uid,Name,Age,Class)values('"+uid+"','"+name+"','"+age+"','"+cl+"')";
			 Statement st=con.createStatement();
			 st.execute(qry);
			 System.out.println("creared raw..");
			 RequestDispatcher rd=req.getRequestDispatcher("val.html");
				rd.forward(req,res);
				out.print("<h1>Registration successfully</h1>");
			}
		catch(Exception e)
		{
		  System.out.println(e.getMessage());
		}
		finally{
		             System.out.println("creared raw..");
		}
	}

}
