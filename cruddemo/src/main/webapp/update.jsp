<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Update Info</title>
	<link rel="stylesheet" href="./assets/css/bootstrap.min.css">
	<link rel="stylesheet" href="./assets/css/bootstrap-theme.min.css">
</head>
<body>
	<div class="row">
		<div class="container">
			<h3>Update</h3>
			<form action="updateStudent" method="post">
				<div class="form-group">
					<label for="fname">First Name</label>
					<input type="text" id="fname" name="fname" placeholder="First name" class="form-control">
				</div>
				<div class="form-group">
					<label for="lname">Last Name</label>
					<input type="text" id="lname" name="lname" placeholder="Last name" class="form-control">
				</div>
				<div class="form-group">
					<label for="email">Email</label>
					<input type="email" id="email" name="email" placeholder="Email" class="form-control">
				</div>
				<div class="form-group">
					<label for="mobile">Mobile No.</label>
					<input type="text" id="mobile" name="mobile" placeholder="Mobile" class="form-control" maxlength="10">
				</div>
				<div class="form-group">
					<label for="pass">Password</label>
					<input type="password" id="pass" name="pass" placeholder="Password" class="form-control">
				</div>
				<div class="form-group">
				<input type="submit" class="btn btn-warning" value="Save">
				</div>
			</form>
		</div>
	</div>
 	
</body>
</html>