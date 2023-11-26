<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

/* exception is one of implicit object and it is accesible only in expression or scriplet scrpiting elements */

out.println("Opps Something went wrong" + exception.getMessage());

%>
</body>
</html>