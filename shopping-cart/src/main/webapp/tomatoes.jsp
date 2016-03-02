<!DOCTYPE html>

<html>
	<head>
		<title>Heirloom Tomatoes</title>
		<link rel="stylesheet" type="text/css" href="generic.css" />
	</head>

	<body>
	
	<h1>Shopping Cart Exercise</h1>
	
	<div class="page">
	
	<h2>Heirloom Tomatoes</h2>
	
	<img alt="Heirloom Tomatoes" src="img/tomatoes.jpg">
	<p>Price: $4</p>
	<form method="POST" action="cart">
		<input type="hidden" name="seedType" value="tomatoes" />
		<label for="tomatoesQuantity">Quantity: </label>
		<input type="text" name="tomatoesQuantity" id="tomatoesQuantity" />
		<input type="submit" value="Add To Cart" />
	</form>
	
	<p><a href="index.html"><<< Return to catalog</a></p>
	
	</div>
	</body>

</html>