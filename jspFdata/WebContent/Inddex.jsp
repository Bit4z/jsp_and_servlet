<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="Home.html" %>
<hr width="100%"></hr>
<%
try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
Statement st=con.createStatement();
 
String fd1="select *from dtable";
ResultSet rs1=st.executeQuery(fd1);
%>
<center>
<table border="1">
<tr>
<th>Uid</th>
<th>Name</th>
<th>Marks</th>
<th>Pass</th></tr>
<% 
while(rs1.next())
{
	%>
	<tr>
	 <td><%=rs1.getString(1) %></td>
	   <td><%=rs1.getString(2) %></td>
	    <td><%=rs1.getString(3) %></td>
	     <td><%=rs1.getString(4) %></td>
<%   
}
%>	  
</tr>
</table>
</center>
<%
}


catch(Exception e){
	  System.out.println(e.getMessage());
	
}
%>

</body>
</html>