<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Login | Page</title>
	</head>
	
	<body>
		
		<div align="center">
			<h2>Login Page</h2>
			<s:form action="loginAction" method="post" class="loginform">
				<s:textfield label="UserName" name="userName" class="formTextField"></s:textfield>
				<s:password label="Password" name="password" class="formTextField"></s:password>
				<s:submit value="Submit" class="actionBtn"></s:submit>
			</s:form>
		</div>
		
	</body>
</html>