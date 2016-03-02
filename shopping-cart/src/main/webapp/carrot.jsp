<!DOCTYPE html>

<html>
	<head>
		<title>Carrots</title>
		<link rel="stylesheet" type="text/css" href="generic.css" />
	</head>

	<body>
	
	<h1>Shopping Cart Exercise</h1>
	
	<div class="page">
	
	<h2>Carrots</h2>
	
	<img alt="Carrots" src="img/carrots.jpg">
	<p>Price: $3</p>
	<form method="POST" action="cart">
		<input type="hidden" name="seedType" value="carrot" />
		<label for="carrotsQuantity">Quantity: </label>
		<input type="text" name="carrotsQuantity" id="carrotsQuantity" />
		<input type="submit" value="Add To Cart" />
	</form>
	
	<p><a href="index.html"><<< Return to catalog</a></p>
	
	</div>
	</body>

</html>