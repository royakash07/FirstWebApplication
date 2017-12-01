package Sample;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Models.EmployeeDetailsUtil;
@WebServlet("/Submit")
public class Submit extends HttpServlet {
	private static final long serialVersionUID = 1L;
    EmployeeDetailsUtil edu= new EmployeeDetailsUtil();
   
    public Submit() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		
		String name=request.getParameter("Name");
		long id= Long.parseLong(request.getParameter("EmployeeId"));
		//Calling the API
		edu.setDetails(name, id);
		RequestDispatcher dis=request.getRequestDispatcher("EmployeePortal.jsp");          
        dis.forward(request, response);
        
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
		}

}
