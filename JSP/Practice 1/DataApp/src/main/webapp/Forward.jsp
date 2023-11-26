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
if(request.getAttribute("reqData") != null){
	out.println(" ReqData : " + request.getAttribute("reqData"));
}
if(session.getAttribute("sessData") != null){
	out.println("sessData : " + session.getAttribute("sessData"));
}
if(application.getAttribute("ctxData") != null){
	out.println("ctxData : " + application.getAttribute("ctxData"));
}

%>

</body>
</html>