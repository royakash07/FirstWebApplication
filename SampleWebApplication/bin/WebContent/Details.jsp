<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="Helper.Employee"%>
    <%@ page import ="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Details</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
.myDiv{
  display:none;
}
#show[type=button]:focus + div {
	display:block;
}
</style>
</head>
<body>
<h2><strong>EMPLOYEE DETAILS</strong></h2>
<form action="getEmployeeDetails" method="post">
<select name="empDetail" id="empDetail" onchange="showfield(this.options[this.selectedIndex].value)">
<option class="drop"selected="selected">Please select ...</option>
<option value="all">Get All Details</option>
<option value="byName">Details by Name</option>
<option value="byId">Details by Id</option>
</select>
<input type="text" name="SearchBox" placeholder="Search">
<input type="button"class="btn btn-success" value="Details" id="show">
<div class="myDiv" >
<table>
<tr>
<td>Employee Name</td>
<td>Employee Id</td>
</tr>
<%
Employee e=new Employee();
ArrayList<Employee> empList=(ArrayList<Employee>)request.getAttribute("empDetail");
System.out.println("employee"+ empList);

%>


</table>
</div>
</form>
</body>
</html>