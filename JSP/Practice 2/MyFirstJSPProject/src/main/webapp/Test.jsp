<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
public void jspInit(){
	System.out.println("in jsp init method");
}

public void jspdestroy(){
	System.out.println("in jsp destroy method");
}
%>
<%
int num = 15;
for (int i = 1 ; i <= 10 ; i++){
out.println(num + "*"+i +"="+(num*i));
}
%>
<b>Todays date is <%= new Date() %></b>

</body>
</html>