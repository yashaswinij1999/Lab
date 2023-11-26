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
String name = request.getParameter("name");
String email = request.getParameter("email");

StringBuilder sb = new StringBuilder();
if(name.equals("") || name == null){
	sb.append("<h1>enter name)</h1><br/>");
}
if(email.equals("") || email == null){
	sb.append("<h1>enter email)</h1><br/>");
}

String msg = sb.toString();

if(!msg.equals("")){
	out.println(" <h1>Opps Something went wrong " + msg + "</h1>");
}
else{
	
	out.println("<h1>name : " + name + " email : " + email + "</h1>");
	
}
%>
</body>
</html>