<!DOCTYPE html>

<html>

<head>
<title>Test</title>

<style>
/* Make the image fully responsive */
.carousel-inner img {
	width: 100%;
}
</style>

<script type="text/javascript" src="js/loign/login.js"></script>

</head>

<body ng-app="login" ng-controller="loginCtrl">

	<div id="demo" class="carousel slide" data-ride="carousel">

		<!-- Indicators -->
		<ul class="carousel-indicators">
			<li data-target="#" data-slide-to="0" class="active"></li>
			<li data-target="#" data-slide-to="1"></li>
			<li data-target="#" data-slide-to="2"></li>
		</ul>

		<!-- The slideshow -->
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img src="images/chaina-1.jpg" alt="chaina-1" width="1100"
					height="500">
				<div class="carousel-caption text-success d-none d-sm-block">
					<h5>The demo of using text in carousel Bootstrap</h5>
					<p class="text-light">
						Another caption line goes here
						<button class="btn btn-outline-primary btn-lg">More info</button>
					</p>
				</div>
			</div>
			<div class="carousel-item">
				<img src="images/chaina-9.jpg" alt="chaina-9" width="1100"
					height="500">
			</div>
			<div class="carousel-item">
				<img src="images/paris-2017-home.jpg" alt="paris-2017-home"
					width="1100" height="500">
			</div>
		</div>

		<!-- Left and right controls -->
		<a class="carousel-control-prev" href="#demo" data-slide="prev"> <span
			class="carousel-control-prev-icon"></span>
		</a> <a class="carousel-control-next" href="#demo" data-slide="next">
			<span class="carousel-control-next-icon"></span>
		</a>
	</div>

	<div class="container-fluid">
		<div class="row">
			<div class="col-md-6">
				<div class="card mt-3 bg-light text-dark">
					<div class="card-header">About Paris</div>
					<div class="card-body">
						<p>Paris (French pronunciation: (About this sound listen)) is
							the capital and most populous city of France, with an area of 105
							square km (41 square miles) and a population of 2,206,488.[5][6]
							With 200,000 inhabitants in 1328, Paris, then already the capital
							of France, was the most populous city of Europe. By comparison,
							London in 1300 had 80,000 inhabitants.[7] Since the 17th century,
							Paris has been one of Europe's major centres of finance,
							commerce, fashion, science, music, and painting. The Paris Region
							had a GDP of €681 billion (US$850 billion) in 2016, accounting
							for 31 per cent of the GDP of France.[8] In 2013–2014, the Paris
							Region had the third-highest GDP in the world and the largest
							regional GDP in the EU. According to the Economist Intelligence
							Unit Worldwide Cost of Living Survey in 2018, Paris was the
							second-most expensive city in the world, behind Singapore and
							ahead of Zurich, Hong Kong, Oslo and Geneva</p>
					</div>
				</div>
			</div>


			<div class="col-md-6">
				<div class="card mt-3 bg-light text-dark">
					<div class="card-header">Login Page</div>
					<div class="card-body">
						<label for="userName">UserName : </label> <input type="text" ng-model="userName"
							class="form-control" placeholder="Enter UserName" id="userName"> <br>
						<label for="password">Password : </label> <input type="text" ng-model="password"
							class="form-control" placeholder="Enter Password" id="password"> <br>

						<input type="button" value="Submit"
							ng-click="validateCredentials()" class="btn btn-sm">
					</div>
				</div>
			</div>
		</div>
	</div>
</body>

</html>