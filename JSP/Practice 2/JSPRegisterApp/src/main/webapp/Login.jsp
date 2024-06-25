<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
 <body>
  <h1>Login</h1>
  <form action="login">
   Enter name :<input type="text" name="name"/>
   Enter password : <input type="password" name="pass" />
   <button type="submit" >Submit</button>
  </form>
  <%
   
  String msg = (String) request.getAttribute("msg");
  
  if(msg != null){
	  out.print(" <h1> " + msg + " </h1>");
  }
  
  
  %>
 </body>
</html>