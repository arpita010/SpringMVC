<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.entity.Employee" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Successful Registration</title>
</head>
<body>
<h1>You have succesfully registered.. </h1>
<h3>Your details are : </h3>
<%Employee employee=(Employee)request.getAttribute("employee"); %>
<h4>Name : <%=employee.getName() %></h4>
<h4>Email : <%=employee.getEmail() %></h4>
<h4>Home Address : <%=employee.getAddress() %></h4>
<h4>Department  : <%=employee.getDepartmentName() %></h4>
<h4>Gender : <%=employee.getGender() %></h4>
<h4>Phone Number : <%=employee.getPhoneNumber() %></h4>
<h4>Salary : <%=employee.getSalary() %></h4>
<h4>SPecialization : <%=employee.getSpecialization() %></h4>

</body>
</html>