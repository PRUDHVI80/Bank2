package BankServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import BankDbconnectio.BDBconnection;

/**
 * Servlet implementation class FetchAccountNumber
 */
@WebServlet("/FetchAccountNumber")
public class FetchAccountNumber extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int cuid=Integer.parseInt(request.getParameter("cuid"));
		Connection con= null;
		
		try {
			con=BDBconnection.getConnection();
		 
			 Statement   stm = con.createStatement();
		 ResultSet rs = stm.executeQuery("select AccountNumber from account where cuid='"+cuid+"' ");
		 int AccountNumber=0;
		
			
				 AccountNumber=rs.getInt(1);
				HttpSession session= request.getSession();
				 session.setAttribute("AccountNumber",AccountNumber);
				 
				//response.sendRedirect("WelCome.jsp");
				
			con.close();
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
