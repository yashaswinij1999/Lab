<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="Error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String str = request.getParameter("sq");

if(str.trim().equals("") ||  str == null){
	out.println("<h1>Enter Input.........<h1>");
	
}
else{
	
	int num = (int)Integer.parseInt(str);
	
	out.println("<h1> Square Root of number " + num + " = " + (double)Math.sqrt(num));
	
}

%>
</body>
</html>