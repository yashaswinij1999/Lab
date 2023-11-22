<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="reg" class="com.uttara.Test.RegBean" scope="request">
<jsp:setProperty name = "reg" property = "*"/>
</jsp:useBean>

<jsp:forward page = "register"/>

</body>
</html>

