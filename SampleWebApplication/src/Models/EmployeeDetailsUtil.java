package Models;
import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;

import Helper.*;

public class EmployeeDetailsUtil {
//Helpers
ConnectionHelper ch =new ConnectionHelper();
PreparedStatement ps = null;
ResultSet rs=null;
Connection conn= ch.createConnection();
public ArrayList<Employee> getAll()
{	
	ArrayList<Employee> empInfo=new ArrayList<Employee>();
	String query="Select * from 'employeedetails'.'employee';";
	try {
		PreparedStatement ps= conn.prepareStatement(query);
		rs=ps.executeQuery();
		while (rs.next()) {
			empInfo.add(new Employee(Long.parseLong(rs.getString(1)),rs.getString(2)));
		}
	}
	catch (SQLException e) {
		e.printStackTrace();
	}
	finally
	{
		ch.closeResources(conn, ps, rs);
	}
	return empInfo;
}
public ArrayList<Employee> getDetailsById(String Id)
{
	ArrayList<Employee> empInfo=new ArrayList<Employee>();
	String query="Select * from employee where idEmployee=?;";
	try {
		ps= conn.prepareStatement(query);
		ps.setString(1, Id);
		rs=ps.executeQuery();
		while (rs.next()) {
			empInfo.add(new Employee(Long.parseLong(rs.getString(1)),rs.getString(2)));
		}
	}
	catch (SQLException e) {
		e.printStackTrace();
	}
	finally
	{
		ch.closeResources(conn, ps, rs);
	}
	return empInfo;
}
public ArrayList<Employee> getDetailsByName(String name)
{	
	ArrayList<Employee> empInfo=new ArrayList<Employee>();
	String query="Select * from employee where employeeName=?;";
	try {
		ps= conn.prepareStatement(query);
		ps.setString(1, name);
		rs=ps.executeQuery();
		while (rs.next()) {
			empInfo.add(new Employee(Long.parseLong(rs.getString(1)),rs.getString(2)));
		}
		empInfo.forEach(Info->System.out.println("Name"+Info.getEmployeeName()+"Value"+Info.getEmployeeId()));
	}
	catch (SQLException e) {
		e.printStackTrace();
	}
	finally
	{
		ch.closeResources(conn, ps, rs);
	}
	return empInfo;
}
public void setDetails(String name,long id)
{
	String query="INSERT INTO `employeedetails`.`employee` (`idEmployee`, `employeeName`) VALUES (?,?);";
	try {
		ps=conn.prepareStatement(query);
		ps.setLong(1, id);
		ps.setString(2, name);
		ps.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally
	{
		ch.closeResources(conn, ps, rs);
	}
}
}
