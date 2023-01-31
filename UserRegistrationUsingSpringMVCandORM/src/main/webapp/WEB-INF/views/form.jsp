<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
<h1 style="text-align:center;">Employee Registration</h1>
<hr>
<form action="processForm" method="post">
<label for="name">Employee Name</label>
<input type="text" name="name" id="name" placeholder="Enter your full name">
<br><br>

<label for="email">Personal Email</label>
<input type="text" name="email" id="email" placeholder="Enter your email address">
<br><br>

<label for="phone">Phone Number</label>
<input type="text" name="phoneNumber" id="phone" placeholder="Enter your contact details">
<br><br>
<label for="gender">Gender</label>
<input type="text" name="gender" id="gender" placeholder="Enter your gender">
<br><br>
<label for="address">Home Address</label>
<input type="text" name="address" id="address" placeholder="Enter your home address">
<br><br>
<label for="salary">Salary</label>
<input type="text" name="salary" id="salary" placeholder="Enter your salary in ruppees">
<br><br>
<label for="department">Department Name</label>
<input type="text" name="departmentName" id="department" placeholder="Enter your department">
<br><br>
<label for="specialization">Specialization</label>
<input type="text" name="specialization" id="specialization" placeholder="Enter your specialization">
<br><br>

<input type="submit" value="Register Employee">


</form>
</body>
</html>