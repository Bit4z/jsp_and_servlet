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
int n=Integer.parseInt(request.getParameter("num"));
%>
<h1>Table of <%=n %> is:</h1>
<table border="1" align="center" width="50%"bgcolor="pink"> 
<% 
for(int i=1;i<=10;i++)
{
%>
<tr style="font-size:18px">
<td width="15" align="center"> <%=n%></td>
<td width="10" align="center">x</td>
<td width="15" align="center"><%=i %></td>
<td width="10" align="center">=</td>
<td width="20" align="center"><%=n*i %></td>
</tr>
<%
}
%>
</table>

</body>
</html>