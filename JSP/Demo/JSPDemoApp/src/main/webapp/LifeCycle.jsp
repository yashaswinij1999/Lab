<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! 

int count = 0;

public void process(){
	System.out.println(" in process ");
}

public void jspInit(){
	
	System.out.println(" inIt method");
	process();
}

public void jspDestroy(){
	System.out.println(" destroy method");
}

%>

<%

count++;
out.println(" count = " + count);
System.out.println(" service method");


%>


</body>
</html>