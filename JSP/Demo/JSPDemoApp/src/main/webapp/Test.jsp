<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome</h1>
<%= new Date() %>

<br/>

<%
for(int i = 1; i <= 10;i++){
	
	out.println(10 + " * " + i + " = " + 10 * i + "<br/>");
	
}
%>

</body>
</html>