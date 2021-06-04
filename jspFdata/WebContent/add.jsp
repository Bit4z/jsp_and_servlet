<%@page errorPage="erroe_page.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="Home.html" %>
<%
int n1=Integer.parseInt(request.getParameter("num1"));

int n2=Integer.parseInt(request.getParameter("num2"));
int ans=n1/n2;
%>
<h1>The ans is:<%=ans %></h1>
</body>
</html>