package BankServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BankDbconnectio.BDBconnection;
import BankModel.Model;
import DAO.BankDao;

/**
 * Servlet implementation class MyAccountDetails
 */
@WebServlet("/MyAccountDetails")
public class MyAccountDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		//PreparedStatement st=con.prepareStatement("select AccountNumber,AccountType,AccountBalance,AverageBalance  from account where cuid=?");
		int cuid=Integer.parseInt(request.getParameter("cuid"));
		
		try
		{
			Model m= new Model();
			m.setCuid(cuid);
			 BankDao st= new BankDao();	 
			 List<Model> list=st.Mydetails(m);
			 request.setAttribute("values",list);
			RequestDispatcher rd=request.getRequestDispatcher("MyAccount.jsp"); 
			rd.include(request, response);
		}
		catch(SQLException e)
		{
			out.println(e);
		}
		catch(ClassNotFoundException e)
		{
			out.println(e);
		}

	}

}
