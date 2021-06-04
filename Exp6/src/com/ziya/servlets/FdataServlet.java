package com.ziya.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FdataServlet extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException, ServletException{
		String uid=req.getParameter("Uid");
		String name=req.getParameter("Name");
		String age=req.getParameter("Age");
		String cl=req.getParameter("Class");
		int i=1;
		PrintWriter out=res.getWriter();
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
	           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
	           Statement st=con.createStatement();
	           
	           String fd1="select *from dtable";
               ResultSet rs1=st.executeQuery(fd1);
               out.print("<center>");
               out.print("<h1>All Student Record</h1>");
               out.print("<hr style=\"width:100%;\"></hr>");
           	   out.print("<table border='1'>");
           	 out.print("<tr>");
           	 out.print("<th>");
           	 out.print("<td>S.N.</td>");
          	 out.print("<td>Uid</td>");
          	 out.print("<td>Name</td>");
          	 out.print("<td>Age</td>");
          	 out.print("<td>Class</td>");
           	 out.print("</th>");
           	out.print("</tr>");
               while(rs1.next())
               {
            	   out.print("<tr>");
            	   out.print("<td></td>");
            	   out.print("<td>"+i+"</td>");
            	   i=i+1;
            	   out.print("<td>"+rs1.getString(1)+"</td>");
            	   out.print("<td>"+rs1.getString(2)+"</td>");
            	   out.print("<td>"+rs1.getInt(3)+"</td>");
            	   out.print("<td>"+rs1.getString(4)+"</td>");
            	   out.print("</tr>");
            	   
            	   
            	   
            	   
            	   //out.print(rs1.getString(1)+":\t"+rs1.getString(2)+":\t"+rs1.getInt(3)+":\t"+rs1.getString(4));
               }
               out.print("</table>");
               out.print("</center>");
		}
		catch(Exception e)
		{
		  System.out.println(e.getMessage());
		}
		finally{
            System.out.println("ping is running..");
}
	}
	

}
