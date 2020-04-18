<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-tags" prefix="s" %>   
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Add Products</title>
	</head>
	<body>
		<div align="center">
			<h2>Add Products</h2>
			<s:form action="addAction" class="formTable">
			<s:textfield name="productName" label="Name" class="formTextField"></s:textfield>
			<s:textfield name="productPrice" label="Price" class="formTextField"></s:textfield>
			<s:textfield name="productCategory" label="Category" class="formTextField"></s:textfield>
			<s:submit value="Add products" class="actionBtn"></s:submit>
			</s:form>
		
		
		</div>
	</body>
</html>