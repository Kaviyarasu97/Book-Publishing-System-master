<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to book information</title>
</head>
<table border=1>
							<thead>
								<tr>
								
			
								
									
									<th><h1 style="color:blue;">ISBN</h1></th>
									<th><h1 style="color:blue;">Title</h1></th>
									<th><h1 style="color:blue;">Author</h1></th>
									<th><h1 style="color:blue;">Price</h1></th>
									<th><h1 style="color:blue;">Content</h1></th>
									<th><h1 style="color:blue;">Publish_date</h1></th>
									<th><h1 style="color:blue;">Status</h1></th>
									
									
								</tr>
							</thead>
							<c:forEach items="${books}" var="book">
							<tbody>
								
									<tr>
										<td>	${book.isbn}		</td>
										<td>	${book.bookName}	</td>
										<td>	${book.authorName}	</td>
										<td>	${book.price}		</td>
										<td>	${book.content}		</td>
										<td>	${book.publishDate}	</td>
										<td>	${book.status}		</td>
								
																				
									</tr>
								</c:forEach>
							</tbody>
						</table>
				
				<a href="../orderItems/addToCart" class=btn btn-primary>Add to cart </a>
						
			
						
</body>
</html>