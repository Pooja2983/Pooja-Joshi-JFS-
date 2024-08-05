<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>List of Students</title>
	<link rel="stylesheet" href="./assets/css/bootstrap.min.css">
	<link rel="stylesheet" href="./assets/css/bootstrap-theme.min.css">
</head>
<body>
	
	<div class="row">
		<div class="container">
		<h3>List of all Students</h3>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>ID</th>
					<th>Fname</th>
					<th>Lname</th>
					<th>Email</th>
					<th>Mobile</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="stud" items="${studList}">
					<tr>
						<td><c:out value="${stud.id}"/></td>
						<td><c:out value="${stud.fname}"/></td>
						<td><c:out value="${stud.lname}"/></td>
						<td><c:out value="${stud.email}"/></td>
						<td><c:out value="${stud.mobile}"/></td>
						<td>
							<form action="delete" method="get">
								<input type="hidden" id="id" name="id" value="<c:out value= "${ stud.id}5"/>" />
								<input type="submit" class="btn btn-danger" value="Delete"/>
							</form>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		
		</table>
		
		</div>
	</div>
</body>
</html>