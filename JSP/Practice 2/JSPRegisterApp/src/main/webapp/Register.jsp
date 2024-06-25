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
  <form action="register">
   Enter name : <input type="text" name="name" />
   Enter email : <input type="text" name="email" />
   Enter password : <input type="password" name="pass" />
   Enter repeat password : <input type="password" name="rpass" />
   <button type="submit">Submit</button>
  </form>
  
  <% 
  
    String msg = "";
  
    if(request.getAttribute("msg") != null){
    	msg = (String) request.getAttribute("msg");
    }
  
    
    	out.print("<h1> " + msg + "</h1>");
    
   %>
 </body>
</html>