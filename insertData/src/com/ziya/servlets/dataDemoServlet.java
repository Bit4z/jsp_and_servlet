package com.ziya.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
public class dataDemoServlet extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException, ServletException{
		String name=req.getParameter("Username");
		String email=req.getParameter("Email");
		String pass=req.getParameter("Password");
		PrintWriter out=res.getWriter();
		out.print("Welcome"+name);
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
	           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
			 String qry="insert into dTable(Name,Email,Password)values('"+name+"','"+email+"','"+pass+"')";
			 Statement st=con.createStatement();
			 st.execute(qry);
			 System.out.println("creared raw..");
			 RequestDispatcher rd=req.getRequestDispatcher("Validate.html");
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
