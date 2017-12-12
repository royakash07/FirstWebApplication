package Models;
import java.sql.*;
import java.util.ArrayList;


import Helper.*;

public class EmployeeDetailsUtil {
//Helpers
PreparedStatement ps = null;
ResultSet rs=null;
public ArrayList<Employee> getAll(Connection conn)
{	
	System.out.println("Inside All Utils Details");
	ArrayList<Employee> empInfo=new ArrayList<Employee>();
	String query="Select * from employee;";
	try {
		ps= conn.prepareStatement(query);
		rs=ps.executeQuery();
		System.out.println("ResultSet: "+rs );
		while (rs.next()) {
			empInfo.add(new Employee(Long.parseLong(rs.getString(1)),rs.getString(2)));
		}
	}
	catch (SQLException e) {
		e.printStackTrace();
	}
	finally
	{
		try {
			rs.close();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	System.out.println("Output all Utils"+empInfo);
	return empInfo;
}
public ArrayList<Employee> getDetailsById(String Id,Connection conn)
{
	System.out.println("Inside ID Utils Details");
	ArrayList<Employee> empInfo=new ArrayList<Employee>();
	String query="Select * from employee where idEmployee=?;";
	try {
		ps= conn.prepareStatement(query);
		ps.setString(1, Id);
		rs=ps.executeQuery();
		while (rs.next()) {
			System.out.println("Result Set Information: "+rs.getString(1)+rs.getString(2));
			empInfo.add(new Employee(Long.parseLong(rs.getString(1)),rs.getString(2)));
	    }
	}
	catch (SQLException e) {
		e.printStackTrace();
	}
	finally
	{
		try {
			rs.close();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	System.out.println("Output Id Utils"+empInfo);
	return empInfo;
}
public ArrayList<Employee> getDetailsByName(String name,Connection conn)
{	
	System.out.println("Inside Name Utils Details");
	ArrayList<Employee> empInfo=new ArrayList<Employee>();
	String query="Select * from employee where employeename=?";
	try {
		ps= conn.prepareStatement(query);
		System.out.println("Setting name as:"+name);
		ps.setString(1,name);
		rs=ps.executeQuery();
		while (rs.next()) {
			System.out.println("Result Set Information: "+rs.getString(1)+rs.getString(2));
			empInfo.add(new Employee(Long.parseLong(rs.getString(1)),rs.getString(2)));
	    }
	}
	catch (SQLException e) {
		e.printStackTrace();
	}
	finally
	{
		try {
			rs.close();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	System.out.println("Outpur Name Utils"+empInfo);
	return empInfo;
}
public void setDetails(String name,long id,Connection conn)
{
	System.out.println("Inside set Utils ");
	String query="INSERT INTO employeedetails.employee (idEmployee,employeeName) VALUES (?,?);";
	String query2="Select * from employeedetails.employee;";
	try {
		ps=conn.prepareStatement(query);
		ps.setLong(1, id);
		ps.setString(2, name);
		ps.executeUpdate();
		ps=conn.prepareStatement(query2);
		rs=ps.executeQuery();
		System.out.println("Result Set"+rs);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally
	{
		try {
			rs.close();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
