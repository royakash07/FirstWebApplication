<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Details</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript">
function showfield(name){
	  if(name=='byId')document.getElementById('div1').innerHTML='byId: <input type="text" class="form-control" name="Id" />';
	  else if(name=='byName')document.getElementById('div1').innerHTML='<input type="text" class="form-control" name="Name" placeholder="Employee Name" />';
	  else document.getElementById('div1').innerHTML='';
	}
function myFunction() {
    var x = document.getElementById("myDIV");
    if (x.style.display === "none") {
        x.style.display = "block";
    } else {
        x.style.display = "none";
    }
}
</script>
<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>
</head>
<body>
<h2><strong>EMPLOYEE DETAILS</strong></h2>
<form action="EmployeeInformation" method="post">
<select name="empDetail" id="empDetail" onchange="showfield(this.options[this.selectedIndex].value)">
<option class="drop"selected="selected">Please select ...</option>
<option value="all">Get All Details</option>
<option value="byName">Details by Name</option>
<option value="byId">Details by Id</option>
</select>
<div id="div1">
</div>
<table>
<tr>
</table>
<input type="button"class="btn btn-success" value="Details" onclick="myFunction()">
<div id="myDIV" style="display:none">
<table>
  <tr>
    <th>Employee Id</th>
    <th>Employee Name</th>
  </tr>


<tr>
<td>
</td>
</tr>
</table>
</div>
</form>
</body>
</html>