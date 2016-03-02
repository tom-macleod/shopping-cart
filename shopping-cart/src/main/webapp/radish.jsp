<!DOCTYPE html>

<html>
	<head>
		<title>Radishes</title>
		<link rel="stylesheet" type="text/css" href="generic.css" />
	</head>

	<body>
	
	<h1>Shopping Cart Exercise</h1>
	
	<div class="page">
	
	<h2>Radishes</h2>
	
	<img alt="Radishes" src="img/radishes.jpg">
	<p>Price: $18</p>
	<form method="POST" action="cart">
		<input type="hidden" name="seedType" value="radish" />
		<label for="radishesQuantity">Quantity: </label>
		<input type="text" name="radishesQuantity" id="radishesQuantity" />
		<input type="submit" value="Add To Cart" />
	</form>
	
	<p><a href="index.html"><<< Return to catalog</a></p>
	
	</div>
	</body>

</html>