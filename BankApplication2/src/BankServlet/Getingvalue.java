package BankServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
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
 * Servlet implementation class Getingvalue
 */
@WebServlet("/Getingvalue")
public class Getingvalue extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		
		  String Name=request.getParameter("Name");
          String UserName=request.getParameter("UserName");
       //   String DOB=request.getParameter("DOB");
          int PhoneNo=Integer.parseInt(request.getParameter("PhoneNo"));
          String Address=request.getParameter("Address");
          String City=request.getParameter("City");
          int Pincode=Integer.parseInt(request.getParameter("Pincode"));
          String Country=request.getParameter("Country");
          String PanNo=request.getParameter("PanNo");
          String EMail=request.getParameter("EMail");
  		int cuid=Integer.parseInt(request.getParameter("cuid"));

          
              Model m1= new Model();
          m1.setName(Name);
          m1.setUserName(UserName);
         // m1.setDOB(DOB);
          m1.setPhoneNo(PhoneNo);
          m1.setAddress(Address);
          m1.setCity(City);
          m1.setPincode(Pincode);       
		  m1.setCountry(Country);
		  m1.setPanNo(PanNo);
		  m1.setEMail(EMail);
		  m1.setCuid(cuid);
	
	
	    out.println("coming"+cuid);
		  BankDao emp= new BankDao();
			
			
			 try {
				 boolean status=false;
				 status=emp.update(m1);
			     if(status)
				{
					out.print("fetch2");

				    BankDao st= new BankDao();	 
					 List<Model> list=st.fetchAll(m1);
					 request.setAttribute("values",list);
					RequestDispatcher rd=request.getRequestDispatcher("Mydetailsjsp.jsp"); 
					rd.include(request, response);
				}
				else
				{
					out.println("Not update.....");
					RequestDispatcher rd=request.getRequestDispatcher("Mydetailsjsp.jsp"); 
					rd.include(request, response);
				}
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	

}
