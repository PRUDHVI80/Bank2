package BankDbconnectio;

import java.sql.DriverManager;
import java.sql.SQLException;

public class BDBconnection 
{
	public static  java.sql.Connection con=null;
	public static java.sql.Connection getConnection() throws SQLException,ClassNotFoundException
	{
		Class.forName("com.mysql.jdbc.Driver");
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gani","root","root");
		return con;
		
		
		
		
	}
}
