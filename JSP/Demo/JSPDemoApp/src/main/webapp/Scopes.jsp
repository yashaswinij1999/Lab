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

request.setAttribute("reqData","data from request");
session.setAttribute("sessData","data from session");
application.setAttribute("ctxData","data from context");


%>

</body>
</html>