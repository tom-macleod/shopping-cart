<!DOCTYPE html>

<%@ page import="com.techelevator.*"%>

<html>
	<head>
		<title>Seed Store Main Page</title>
		<link rel="stylesheet" type="text/css" href="cart.css" />
	</head>

	<body>
	
	<h1>Shopping Cart Exercise</h1>
	
	<div class="page">
	
	<h2>Shopping Cart Contents</h2>
	
	<% Cart theCart = (Cart) request.getSession().getAttribute("theCart"); %>
	
	<table>
		<tr>
			<th>Product</th>
			<th>Price Per Item</th>
			<th>Quantity</th>
			<th>Total Cost</th>
		</tr>
			<% for(Product product : theCart.getProductList()) { %>
				<tr>
					<td><%= product.getName() %></td>
					<td>$<%= product.getPrice() %></td>
					<td><%= product.getQuantity().toString() %></td>
					<td>$<%= product.getTotalCost() %></td>
				</tr>
			<%	} %>
			<td colspan="3" id="long">Total</td>
			<td>$<%= theCart.getTotalValue() %></td>
	</table>
	
	</div>
	
	</body>

</html>