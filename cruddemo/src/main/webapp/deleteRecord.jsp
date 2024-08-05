<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Record</title>
</head>
<body>

	<div class="row">
		<div class="container">
			<h3>Deleter</h3>
			<form action="deleteStudent" method="post">
				
				<div class="form-group">
					<label for="email">Enter the email whose record you want to delete</label>
					<input type="email" id="email" name="email" placeholder="Email" class="form-control">
				</div>
				
				<div class="form-group">
				<input type="submit" class="btn btn-danger" value="Delete">
				</div>
			</form>
		</div>
	</div>
</body>
</html>