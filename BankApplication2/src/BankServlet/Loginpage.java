package BankServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import BankDbconnectio.BDBconnection;
/**
 * Servlet implementation class Loginpage
 */
@WebServlet("/Loginpage")
public class Loginpage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		int pass=Integer.parseInt(request.getParameter("pass"));
		Connection con= null;
		try {
			con=BDBconnection.getConnection();
		 
			 Statement   stm = con.createStatement();
		 ResultSet rs = stm.executeQuery("select cuid,Uname from bankculog where Uname='"+name+"' and Upass ='"+pass+"'");
		 int cuid=0;
		 String  cname=null;
			if(rs.next())
			{
				cuid=rs.getInt(1);
				cname=rs.getString(2);
				HttpSession session= request.getSession();
				 session.setAttribute("cuid",cuid);
				 session.setAttribute("cname",cname );
				response.sendRedirect("WelCome.jsp?cuid="+cuid+"");
			}
			else
			{
				out.println("... not match user name and password");
			}		
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
