<%@page import="com.uttara.Test.RegBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Pulling data using Java Code</h1>
<%

if(request.getAttribute("data")!= null){
	 out.print("req Data 1 " + request.getAttribute("data"));
	 
}
if(request.getAttribute("IntData")!= null){
	 out.print("<br/> req Data 2 : " + request.getAttribute("IntData") + "<br/>");
	 
}
if(session.getAttribute("data") != null){
	 out.print(" <br/> sess Data 1 : " + session.getAttribute("data")+ "<br/>");
}
if(session.getAttribute("bean") != null){
	RegBean rb = (RegBean)session.getAttribute("bean");
	 out.print(" <br/> sess Data 2 : " + rb + "<br/>");
}
if(application.getAttribute("data")!= null){
	out.print(" <br/> ctx Data 1 : " + application.getAttribute("data") + "<br/>");
	 
}
%>

<h1>Pulling data using action elements</h1>
<jsp:useBean id="bean" class = "com.uttara.Test.RegBean" scope = "session"/>
Name : <jsp:getProperty property="uname" name="bean"/><br/>
<br/>Email :<jsp:getProperty property="email" name="bean"/><br/>
<br/>Pass :<jsp:getProperty property="pass" name="bean"/><br/>

<h1>Pulling data using Expression Language</h1>
 
 ReqData 1: ${data}<br/>
 <br/>ReqData 2: ${IntData}<br/>
 <br/>SessionData 1: ${sessionScope.data}<br/>
 <br/>SessionData 2: ${bean}<br/>
 <br/>ContextData 1: ${applicationScope.data}<br/>

</body>
</html>