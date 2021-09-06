package DAO;
import BankDbconnectio.BDBconnection;
import BankModel.Model;

import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class BankDao
{
	public Connection con=null;
	public List<Model> Mydetails(Model m) throws SQLException,ClassNotFoundException
	{
		con=BDBconnection.getConnection();
		List<Model> list= new ArrayList<Model>();
		PreparedStatement st=con.prepareStatement("select AccountNumber,AccountType,AccountBalance,AverageBalance  from account where cuid=?");
		st.setInt(1,m.getCuid());
		ResultSet rs=null;
		rs=st.executeQuery();
		
		while(rs.next())
		{
			 
			Model mp= new Model();
			mp.setAccountNumber(rs.getInt(1));
			mp.setAccountType(rs.getString(2));
			mp.setAccountBalance(rs.getInt(3));
			mp.setAverageBalance(rs.getInt(4));
			list.add(mp);
		}
		return list;
}
	public List<Model> fetchAll(Model m) throws SQLException,ClassNotFoundException
	{
		con=BDBconnection.getConnection();
		List<Model> list= new ArrayList<Model>();
	
		PreparedStatement st=con.prepareStatement("select t1.name,t1.username,t1.dob,t1.phoneno,t1.address,t1.city,t1.pincode,"
				+ "t1.country,t1.panno,t1.email from myd t1,account t2 where t2.cuid=? and t1.accountnumber=t2.accountnumber;");
		
		System.out.println("dacd***********************************");
		
		                        st.setInt(1,m.getCuid());
		                        ResultSet rs=null;
		                        rs=st.executeQuery();
	
		while(rs.next())
{	
	                 Model dt= new Model();
	                 dt.setName(rs.getString(1));
	                 dt.setUserName(rs.getString(2));
	                 dt.setDOB(rs.getDate(3));
	                 dt.setPhoneNo(rs.getInt(4));
	                 dt.setAddress(rs.getString(5));
	                 dt.setCity(rs.getString(6));
	                 dt.setPincode(rs.getInt(7));
	                 dt.setCountry(rs.getString(8));
	                 dt.setPanNo(rs.getString(9));
	                 dt.setEMail(rs.getString(10));
	  
	   list.add(dt);
	      
}
		                      return list;
}
	
	
	public boolean update(Model dt) throws SQLException,ClassNotFoundException
{
		con=BDBconnection.getConnection();
		boolean status=false;
        PreparedStatement st= con.prepareStatement("update myd t1,account t2 set t1.name=?,t1.username=?,t1.phoneno=?,"
        		+ "t1.address=? ,t1.City=?,t1.pincode=?,t1.country=?,t1.panno=?,"
        				+ "t1.email=? where t2.cuid=? and t1.accountnumber=t2.accountnumber;");

System.out.println("&&&&&&&&&&&&&&&&&&&&&&");
                     st.setString(1,dt.getName());
                     st.setString(2,dt.getUserName());
                    // st.setDate(3,dt.getDOB());
                     st.setInt(3,dt.getPhoneNo());
                     st.setString(4,dt.getAddress());
                     st.setString(5,dt.getCity());
                     st.setInt(6,dt.getPincode());
                     st.setString(7,dt.getCountry());
                     st.setString(8,dt.getPanNo());
                     st.setString(9,dt.getEMail());
                     st.setInt(10,dt.getCuid());          
                                  int i=0;
                                  i=st.executeUpdate();
                          if(i>0)
                            {
                                  status=true;	
                            }
                                  return status;

 }	
	public List<Model>Statement(Model m) throws SQLException,ClassNotFoundException
	{
		con=BDBconnection.getConnection();
		List<Model>list=new ArrayList<Model>();
		PreparedStatement st=con.prepareStatement("select t1.date,t1.description,t1.CreditDebitAmount,t1.ClosingBalance from stm t1,account t2 where t2.cuid=? "
				+ "and t1.accountnumber=t2.accountnumber;");
		st.setInt(1,m.getCuid());
		ResultSet rs=null;
		rs=st.executeQuery();
		
		while(rs.next())
		{
			 
			Model mp= new Model();
			mp.setDate(rs.getDate(1));
			mp.setDescription(rs.getString(2));
			mp.setCreditDebitAmount(rs.getInt(3));
			mp.setClosingBalance(rs.getInt(4));
			list.add(mp);
		}
		return list;
		
		
	}
	
	
}
