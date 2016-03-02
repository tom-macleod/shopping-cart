<!DOCTYPE html>

<%@ page import="com.techelevator.*"%>

<html>
	<head>
		<title>Seed Store Main Page</title>
		<link rel="stylesheet" type="text/css" href="generic.css" />
	</head>

	<body>
	
	<h1>Shopping Cart Exercise</h1>
	
	<h2>Shopping Cart Contents</h2>
	
	<% Cart theCart = (Cart) request.getSession().getAttribute("theCart"); %>
	
	<% for(Product product : theCart.getProductList()) { %>
		<p> <%= product.getName() %> </p>
<%	} %>
	
	
	
	</body>

</html>