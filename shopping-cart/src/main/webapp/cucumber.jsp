<!DOCTYPE html>

<html>
	<head>
		<title>Cucumbers</title>
		<link rel="stylesheet" type="text/css" href="generic.css" />
	</head>

	<body>
	
	<h1>Shopping Cart Exercise</h1>
	
	<div class="page">
	
	<h2>Cucumbers</h2>
	
	<img alt="Cucumbers" src="img/cucumbers.jpg">
	<p>Price: $8</p>
	<form method="POST" action="cart">
	<input type="hidden" name="seedType" value="cucumber" />
		<label for="cucumbersQuantity">Quantity: </label>
		<input type="text" name="cucumbersQuantity" id="cucumbersQuantity" />
		<input type="submit" value="Add To Cart" />
	</form>
	
	<p><a href="index.html"><<< Return to catalog</a></p>
	
	</div>
	</body>

</html>