<jsp:useBean id="reg" class = "com.uttara.project.RegBean" scope = "request">
	<jsp:setProperty name = "reg" property = "*" />
</jsp:useBean>
<jsp:forward page="register.do"></jsp:forward>