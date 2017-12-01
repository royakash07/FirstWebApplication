package Helper;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
public class PlayGround {
	public static void main(String args[])
	{
		String query="Select * from employee;";
		try {
			LinkedList<Employee> empInfo=new LinkedList<Employee>();
			Class.forName("com.mysql.jdbc.Driver");  
			Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeedetails","root","pass00");
			ResultSet rs;
			PreparedStatement ps= conn.prepareStatement(query);
			System.out.println("------------------------------------------------");
			//ps.setString(1, "1464");
			rs=ps.executeQuery();
			
			while (rs.next()) {
				empInfo.add(new Employee(Long.parseLong(rs.getString(1)),rs.getString(2)));
		    }
			empInfo.forEach(Info->System.out.println("Name"+Info.getEmployeeName()+"Value"+Info.getEmployeeId()));
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
