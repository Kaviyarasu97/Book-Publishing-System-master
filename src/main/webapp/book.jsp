<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<h1 style="color:blue;">welcome To Book Library</h1>



<table border="1">
							<thead>
							
								<tr>
								
								
									<th>isbn</th>
									<th>Title</th>
									<th>author</th>
									<th>price</th>
									
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${books}" var="book">
									<tr>
										<td>${book.isbn}</td>
										<td>${book.bookName}</td>
										<td>${book.authorName}</td>
										<td>${book.price}</td>
										<td><a href="../book/${book.isbn}">View</a></td>
										
										
																				
									</tr>
									
								</c:forEach>
									
							
							</tbody>							
							
						</table>
		<a href="Logout" class=btn btn-primary><h1 style="color:blue;">Logout</h1></a>

</body>
</html>