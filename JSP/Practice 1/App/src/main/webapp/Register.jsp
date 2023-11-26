<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Register</h1>
<form action="register" method="post">
Enter name:<input type="text"  name = "name"/><br/>
<br/>Enter email:<input type="text" name= "email"/><br/>
<br/>Enter Password:<input type="password" name = "pass"/><br/>
<br/>Enter Repeat Password :<input type = "password" name = "rpass"/><br/>
<br/>
<input type="submit"/>  
</form>

<br/>
<br/>
<br/>
<br/>

<%

if(request.getAttribute("msg") != null){
	out.println("<h3>Opps Some thing went Wrong" + request.getAttribute("msg") + "<h3>");
}

%>

</body>
</html>