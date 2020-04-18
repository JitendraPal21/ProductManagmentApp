<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Welcome | Page</title>
	</head>
	
	<body>
		
		<div align="center">
			<h2>Welcome Page</h2>
			<a href="addProducts.jsp">
				<button class="actionBtn">Add New Product</button>
			</a>
			<table>
				<thead>
					<tr>
						<th>Product Id</th>
						<th>Product Name</th>
						<th>Product Price</th>
						<th>Product Category</th>
						<th colspan="2">Actions</th>
					</tr>
				</thead>
				
				<s:iterator value="products" var="product">
				<tr>
					<td><s:property value="#product.productId"/></td>
				    <td><s:property value="#product.productName"/></td>
					<td><s:property value="#product.productCategory"/></td>
					<td><s:property value="#product.productPrice"/><td>
					<td>
					<a
					href="updateDataAction?productId=<s:property value="#product.productId"/>">
						<button class="actionBtn">Update</button>
					</a> 
				</td>
				<td>
					<a href="deleteAction?productId=<s:property value="#product.productId"/>">
						<button class="actionBtn">Delete</button>
					</a>
				</td>
				</tr>
				</s:iterator>
				
				
			</table>
		</div>
		
	</body>
</html>