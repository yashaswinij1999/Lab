<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String num = request.getParameter("num");

if(num == null || num.equals("")){
	out.print("<h1> num cannot be  null or empty </h1>");
}

int n = Integer.parseInt(num);
out.print("<h1> The sqaure root : " + Math.sqrt(n) + " cube root = " + Math.cbrt(n));

%>
</body>
</html>