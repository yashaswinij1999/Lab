<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Pulling Data using Scriplet</h1>
<%

if(request.getAttribute("bean") != null){
	out.println("<h1> bean : " + request.getAttribute("bean") + "</h1>");
}

%>
<h1>Pulling Data using Action Elements</h1>

<jsp:useBean id="bean" class = "com.uttara.Test.InputBean" scope="request"></jsp:useBean>
Name :<jsp:getProperty name = "bean" property="name" /><br/>
Email :<jsp:getProperty name = "bean" property="email" /><br/>

</body>
</html>