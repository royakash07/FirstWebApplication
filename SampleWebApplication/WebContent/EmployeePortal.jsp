<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Portal</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
.well
{
color:black;
background-color:#F2F2F2;
}
.portal
{
}
</style>
</head>
<body>
<div style="padding: 30px"> 
<div class="container well well-lg" >
<h2><strong>Register</strong></h2>
<form action="Submit" method="post">
<div class="form-group portal">
  <label for="EmployeeId">Employee Id:</label>
  <input type="text" class="form-control" name="EmployeeId" placeholder="Employee Id" >
  </div>
  <div class="form-group">
  <label for="Name">Employee Name:</label>
  <input type="text" class="form-control" name="Name" placeholder="Employee Name">
  </div>
  <input type="submit"class="btn btn-success" value="Submit">
</form>
</div>
</div>
</body>
</html>