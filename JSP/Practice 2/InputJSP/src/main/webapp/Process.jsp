<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
    <% 
    
    String name = request.getParameter("uname");
    String email = request.getParameter("email");
    
    StringBuilder s = new StringBuilder();
    if(name == null || name.equals("")){
    	s.append("name not be null");
    }
    if(email == null || email.equals("")){
    	s.append(" email cannot be null");
    }
    String msg = s.toString();
    
    if(!msg.equals("")){
    	out.print(msg);
    }
    else{
    	out.println("<h1>name : " + name + " email : " + email);
    }
    %>
    
</body>
</html>