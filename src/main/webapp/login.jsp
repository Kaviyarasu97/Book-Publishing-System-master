<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<link href = "css/style.css" />
<head>
  <link rel="stylesheet" href="font-awesome.css">
<title>Login</title>

</head>
<body>
<!-- Body -->
<body>

	<h1 style="color:blue;">BOOK APP LOGIN FORM</h1>

	

		<div class="w3imageaits">
			<div class="header-social wthree">
				<ul>
					<li><a href="www.google.com" class="f"><i class="fa fa-facebook" aria-hidden="true"></i>Login with Facebook</a></li>
					<li><a href="www.twitter.com" class="t"><i class="fa fa-twitter" aria-hidden="true"></i>Login with Twitter</a></li>
					<li><a href="www.googleplus.com" class="g"><i class="fa fa-google-plus" aria-hidden="true"></i>Login with Google+</a></li>
				</ul>
			</div>
		</div>

<div class="login">
	<h1 style="color:blue;">Login</h1>
    <form action="../Authentication/Login" method="Get">
    	<input type="text" name="username" placeholder="Username" required="required" />
        <input type="password" name="password" placeholder="Password" required="required" />
        <button type="submit" class="btn btn-primary btn-block btn-large">Log in</button>
         <a href="../Authentication/register">Sign up</a>
        
    </form></div>
</body>
</html>