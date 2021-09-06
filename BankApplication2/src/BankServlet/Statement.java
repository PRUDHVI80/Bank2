package BankServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BankModel.Model;
import DAO.BankDao;
/**
 * Servlet implementation class Statement
 */
@WebServlet("/Statement")
public class Statement extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/");
		PrintWriter out=response.getWriter();
		int cuid=Integer.parseInt(request.getParameter("cuid"));
		try
		{
		Model m=new Model();
		m.setCuid(cuid);
		 BankDao st= new BankDao();	 
		 List<Model> list=st.Statement(m);
		 request.setAttribute("values",list);
		RequestDispatcher rd=request.getRequestDispatcher("Statement.jsp"); 
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


