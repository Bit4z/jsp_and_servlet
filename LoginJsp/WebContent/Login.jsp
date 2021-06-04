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
<%

String name;
name=request.getParameter("Name");
String pass=request.getParameter("Pass");
%>
<h1>Welcome1<%=name %></h1>
<%
try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
	Statement st=con.createStatement();
	String fd1="select *from test";
	ResultSet rs1=st.executeQuery(fd1);
	while(rs1.next())
	{	
		String n;
		n=rs1.getString(1);
		String p;
		p=rs1.getString(3);
		if(n.equals(name)&&p.equals(pass))
		{
			out.print("Welcome2"+name);
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("Index.html");
			out.print("Invalis user or Password");
		}

	}

}



catch(Exception e)
{
	out.print(e.getMessage());
}

%>

<h1></h1>
</body>
</html>