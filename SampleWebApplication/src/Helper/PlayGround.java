package Helper;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.LinkedList;
public class PlayGround {
	public static void main(String args[])
	{
		String query="Select * from employee where employeename=?";
		String query1="Select * from employee where idemployee=?";
		try {
			ArrayList<Employee> empInfo=new ArrayList<Employee>();
			
			Class.forName("com.mysql.jdbc.Driver");  
			Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeedetails","root","pass00");
			ResultSet rs;
			String s="Akash";
			Long n= (long) 1;
			PreparedStatement ps= conn.prepareStatement(query);
			PreparedStatement ps1= conn.prepareStatement(query1);
			System.out.println("------------------------------------------------");
			ps1.setLong(1,n );
			ps.setString(1,s);
			rs=ps.executeQuery();
			while (rs.next()) {
				empInfo.add(new Employee(Long.parseLong(rs.getString(1)),rs.getString(2)));
		    }
			rs=ps1.executeQuery();
			while (rs.next()) {
				empInfo.add(new Employee(Long.parseLong(rs.getString(1)),rs.getString(2)));
		    }
			System.out.println(empInfo);
			for(Employee emp:empInfo)
			{
			System.out.println("Name :"+emp.getEmployeeName());
			}
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
