<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="bean" class = "com.uttara.Test.InputBean" scope = "request">
<jsp:setProperty name = "bean" property="*" />
</jsp:useBean>

<jsp:forward page="Process.jsp"></jsp:forward>
</body>
</html>