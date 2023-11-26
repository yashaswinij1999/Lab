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

String str = request.getParameter("cb");

if(str.trim().equals("") ||  str == null){
	out.println("<h1>Enter Input.........<h1>");
	
}
else{
	
	int num = (int)Integer.parseInt(str);
	out.println("<h1> Cube Root of number " + num + " = " + (double)Math.cbrt(num));
	
}

%>
</body>
</html>