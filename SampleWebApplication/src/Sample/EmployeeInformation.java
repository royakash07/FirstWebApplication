package Sample;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Helper.Employee;
import Models.EmployeeDetailsUtil;

@WebServlet("/EmployeeInformation")
public class EmployeeInformation extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmployeeDetailsUtil edu= new EmployeeDetailsUtil();
    public EmployeeInformation() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			ArrayList<Employee> empDetails=new ArrayList<Employee>();
			String dropDown= request.getParameter("empDetail");
			System.out.println(dropDown);
			if(dropDown.equals("all"))
			{
				empDetails=edu.getAll();
			}
			else if(dropDown.equals("byName"))
			{
				System.out.println(request.getParameter("Name"));
				empDetails=edu.getDetailsByName(request.getParameter("Name"));
			}
			else if(dropDown.equals("byId"))
			{
				System.out.println(request.getParameter("Id"));
				empDetails=edu.getDetailsById(request.getParameter("Id"));
			}
			request.setAttribute("details",empDetails);
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
	}
}
