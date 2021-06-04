package com.ziya.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		String name=req.getParameter("Username");
		String pass=req.getParameter("Password");
		PrintWriter out=res.getWriter();
		int i=0;
		req.getRequestDispatcher("link.html").include(req, res);
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
	           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
	           Statement st=con.createStatement();
	           
	           String fd1="select *from test";
               ResultSet rs1=st.executeQuery(fd1);
               while(rs1.next())
               {String nm=rs1.getString(1);
            	   String sm=rs1.getString(3);
               
		
		
		
		
		
		if(nm.equals(name)&&sm.equals(pass))
		{i=1;
		out.print("<br>");
			out.print("<h1><center>You are succesfully login</center></h1>");
			out.print("<br>");
			out.print("<h1><center><br>Welcome</center><h1>"+"<center>"+name+"</center>");
			out.print("<br>");
			Cookie ck=new Cookie("name",name);
			res.addCookie(ck);
			
			
		}
		
               }
               if(i==0)
               {
       			
       			req.getRequestDispatcher("login.html").include(req, res);
       			out.print("sorry,username or password error");
       			
       		}
               
		
		out.close();
		}
		catch(Exception e)
		{
		  System.out.println(e.getMessage());
		}
	}

}
