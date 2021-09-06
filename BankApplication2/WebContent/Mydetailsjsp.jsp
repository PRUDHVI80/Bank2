<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="BankModel.Model" %>
    <%@ page import= "java.util.List" %>
    <%@ page import="java.util.Iterator" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
.required:after
{
    content:" *";
    color: red;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Getingvalue" method="get">
<h1 align="center"> MyPersonalDetails..</h1>
<table align="center"  cellpadding="5" cellspacing="5" border=1 >

<%
List<Model> list=null;
list=(List)request.getAttribute("values");
Model emp=new Model();
Iterator itr=list.iterator();

while(itr.hasNext())
 {
 
 emp=(Model)itr.next();
%>	
<tr bgcolor="yellow"> 
                        <th ><b>Name:</b></th>
  <td> <input type="text" name="Name" value="<%=emp.getName()%>"></td></tr>
                        
 <tr bgcolor="yellow">                    
                        <th><b>User Name:</b></th>
                         <td><input type="text" name="UserName" value="<%=emp.getUserName()%>" readonly></td></tr>

<tr bgcolor="yellow">
                        <th><b>DOB:</b></th> 
                        <td><input type="text" name="DOB" value="<%=emp.getDOB() %>" readonly></td></tr>

<tr bgcolor="yellow">
                        <th><b> Phone No:</b></th>
                        <td><input type="text" name="PhoneNo" value="<%=emp.getPhoneNo()%>" readonly></td></tr>

<tr bgcolor="yellow">
     <th> <label  class="requried"><font style="color:red;">*</font><b>Address:</b></label></th>
     <td><input type="text" name="Address" value="<%=emp.getAddress()%>"></td></tr>
                         
 <tr bgcolor="yellow">                        
                         <th><label  class="requried"><font style="color:red;">*</font><b>City:</b></label></th>
                         <td><input type="text" name="City" value="<%=emp.getCity() %>"></td></tr>
                          
 <tr bgcolor="yellow"> 
               <th><label  class="requried"><font style="color:red;">*</font><b>Pin code:</b></label></th>
                <td><input type="text" name="Pincode" value="<%=emp.getPincode() %>"></td></tr>
                                 

 <tr bgcolor="yellow">  <th><label  class="requried"><font style="color:red;">*</font><b>Country:</b></label></th>    
 <td><input type="text" name="Country" value="<%=emp.getCountry() %>"></td></tr>
                      
     <tr bgcolor="yellow">   <th><b>Pan No:</b></th>     
      <td><input type="text" name="PanNo" value="<%= emp.getPanNo() %>" readonly></td></tr>
           
            <tr bgcolor="yellow">   <th><b> E-Mail::</b></th> 
               <td><input type="text" name="EMail" value="<%=emp.getEMail() %>" readonly></td></tr>
 <% 
 }
%>
 
 <tr><td colspan=2 align="center"><input type="submit" value="submit"></td></tr>
 
 
 
</table>

<input type="hidden" value="<%=request.getAttribute("cuid")%>" name="cuid">

</form>
</body>
</html>