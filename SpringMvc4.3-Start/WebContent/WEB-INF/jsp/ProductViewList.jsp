<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="global">
	<table border="1">
		<caption>信息</caption>
		<tr>
		<td>ID</td>
		<td>Name</td>
		<td>Description</td>
		<td>Price</td>
		<td>Address</td>
		<td>Need</td>
		</tr>
		<c:forEach var="products" items="${products}">
			<tr>
			<td>${products.value.id}</td>
			<td>${products.value.name}</td>
			<td>${products.value.description}</td>
			<td>${products.value.price}</td>
			<td>${products.value.address}</td>
			<td>${products.value.need}</td>
			<td><a href="product_changeProduct.action?id=${products.value.id}">修改</a></td>
			<td><a href="product_del.action?id=${products.value.id}">删除</a></td>
		</tr>
		</c:forEach>
	</table>
</div>
<a href="http://localhost:8080/SpringMvc4.3-Start/product_input.action">回到添加页面</a>
</body>
</html>