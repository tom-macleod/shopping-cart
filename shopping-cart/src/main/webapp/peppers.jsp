<!DOCTYPE html>

<html>
	<head>
		<title>Bell Peppers</title>
		<link rel="stylesheet" type="text/css" href="generic.css" />
	</head>

	<body>
	
	<h1>Shopping Cart Exercise</h1>
	
	<div class="page">
	
	<h2>Bell Peppers</h2>
	
	<img alt="Bell Peppers" src="img/peppers.jpg">
	<p>Price: $5</p>
	<form method="POST" action="cart">
	<input type="hidden" name="seedType" value="pepper" />
		<label for="pepperQuantity">Quantity: </label>
		<input type="text" name="pepperQuantity" id="pepperQuantity" />
		<input type="submit" value="Add To Cart" />
	</form>
	
	<p><a href="index.html"><<< Return to catalog</a></p>
	
	</div>
	</body>

</html>