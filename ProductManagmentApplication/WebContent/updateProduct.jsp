<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="/struts-tags" prefix="s" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<div align="center">
			<h2>Update Products</h2>
			<s:form action="updateAction" class="formTable">
			<s:textfield name="productId" label="product Id" class="formTextField"></s:textfield>
			<s:textfield name="productName" label="product Name" class="formTextField"></s:textfield>
			<s:textfield name="productPrice" label="product Price" class="formTextField"></s:textfield>
			<s:textfield name="productCategory" label="product Category" class="formTextField"></s:textfield>
			<s:submit value="Update products" class="actionBtn"></s:submit>
			
			</s:form>
		
		
		</div>
	</body>
</html>