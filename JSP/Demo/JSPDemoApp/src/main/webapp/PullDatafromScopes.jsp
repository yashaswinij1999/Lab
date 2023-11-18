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

String reData = "";
String sessData = "";
String ctxData = "";

if(request.getAttribute("reqData")!= null){
	reData = (String)request.getAttribute("reqData");
}
if(session.getAttribute("sessData")!= null){
	sessData = (String)session.getAttribute("sessData");
}
if(application.getAttribute("ctxData")!= null){
	ctxData = (String)application.getAttribute("ctxData");
}

out.println("<h1> reData = " + reData + " and sessData = " + sessData + " and ctxData = " + ctxData +  "<h1/>");

%>

</body>
</html>