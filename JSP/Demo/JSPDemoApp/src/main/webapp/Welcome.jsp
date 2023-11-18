<%@page import="jakarta.servlet.jsp.tagext.TryCatchFinally"%>
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

String name = request.getParameter("email");
String age = request.getParameter("age");

out.println("name = " + name + " and  age = " + age + " <br/>");

if(name == null || name.trim().equals("")){
	out.println("<h1>Oye ......Enter email <h1/><br/>");
	return;
	
}
if(age == null || age.trim().equals("")){
	out.println(" <h1> are you living are dead......<br/> </h1>");
	return;
}
else{
	
	
	try{
		
		int num = Integer.parseInt(age);
		
		if(num < 50){
			out.println("<h1>Welcome " + name + " youngter !!!!</h1>");
		}
		else{
			out.println("<h1>Welcome " + name + " oldeee goldeee !!!!</h1>");
		}
		
	}
	catch(NumberFormatException e){
	
		out.println(" <h1> Maga add Integer as input......<h1/>");
		
	}
	
}
%>

</body>
</html>