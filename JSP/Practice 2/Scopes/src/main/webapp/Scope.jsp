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

    String reqData = "";
    String sessData = "";
    String conData ="";

    if(request.getAttribute("reqData") != null){
    	reqData  = (String) request.getAttribute("reqData");
    }

    HttpSession s = request.getSession(false);
    
    if(s.getAttribute("sessData") != null){
	sessData = (String) s.getAttribute("sessData"); 
    }
    
    ServletContext con = request.getServletContext();    
    if(con.getAttribute("conData")!=null){
    	 conData =   (String) con.getAttribute("conData");
    }
    
    out.println("<h1> reqData " + reqData + " sessData " + sessData + " conData " + conData);
%>
</body>
</html>