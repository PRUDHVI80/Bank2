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
import BankDbconnectio.BDBconnection;
import DAO.BankDao;
/**
 * Servlet implementation class Details
 */
@WebServlet("/Details")
public class Details extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int cuid=Integer.parseInt(request.getParameter("cuid"));
		try
		{
			
			 Model m= new Model();
			 m.setCuid(cuid);
			boolean status=false;
			
			
				
				
			     BankDao st= new BankDao();	 
				 List<Model> list=st.fetchAll(m);
				 request.setAttribute("values",list);
				 request.setAttribute("cuid", cuid);
				RequestDispatcher rd=request.getRequestDispatcher("Mydetailsjsp.jsp"); 
				rd.include(request, response);
			 
			/* }
			 else
			 {
				 out.println(" not inserted..");
				 RequestDispatcher rd=request.getRequestDispatcher("index.jsp"); 
					rd.include(request, response);
				 
				 
				 
			 }*/
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
