<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="product_change.action" method="post">
			<fieldset>
			<label for="id">ID:</label>
				<input type="hidden" name="id" value="${product.id }" >
			<label for="name">Product Name:</label>
				<input type="text" id="name" name="name" value="${product.name }" tabindex="1" /> 
				<br />
			<label for="description">Description</label>
				<input type="text" id="description" name="description" value="${product.description }" tabindex="2" /> 
				<br />
			<label for="price">Price</label>
				<input type="text" id="price" name="price" value="${product.price }" tabindex="3" />
				<br />
			<label for="price">Price</label>
				<input type="text" id="address" name="address" value="${product.address }" tabindex="4" />
				<br />
			<label for="need">Need:</label>
				<input type="text" id="need" name="need" value="${product.need }" tabindex="5" />
				<div id="buttons">
					<input id="submit" type="submit" tabindex="6" value="保存" />
					<input  type="button" value="取消"	tabindex="7" /> 
				</div>
			</fieldset>
		</form>
</body>
</html>