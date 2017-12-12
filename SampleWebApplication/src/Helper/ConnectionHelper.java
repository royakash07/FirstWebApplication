package Helper;

import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.*;
import javax.sql.DataSource;

public class ConnectionHelper {
	static Connection conn = null;
public Connection createConnection(){
	
		try {
			Context context=new InitialContext();
			DataSource ds=(DataSource)context.lookup("java:comp/env/jdbc/EmployeeDB");
			conn= ds.getConnection();
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	return conn;	
}
public void closeResources(Connection conn)
{
	if (conn!=null) 
		try 
		{
			conn.close();
		}
	catch (Exception e) 
	{
		e.printStackTrace();
	}
}
}
