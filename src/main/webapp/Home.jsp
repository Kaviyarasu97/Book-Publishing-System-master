<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
      <h1>Welcome to Library</h1>
      <form action = "../Authentication/Login" method = "GET"> 
         <h3>login</h3>
          <input type = "text" name = "username" placeholder=" Enter username" required><br> 
           <input type = "password" name = "password" placeholder = " Enter password" required> <br>
           <button type = "submit">login</button>
           
           <br>
       </form>
       <a href="../show">Show</a>
</body>
</html>