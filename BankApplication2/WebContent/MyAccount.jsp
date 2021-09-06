<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import= "java.util.List" %>
    <%@ page import="java.util.Iterator" %>
    <%@ page import="BankModel.Model" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="WelCome.jsp" method="get">
<h1 align="center">MyAccountStatementDetails..</h1>
<table align="center"  cellpadding="5" cellspacing="5" border=1 >
<tr bgcolor="#e3f2fd">
<th>AccountNumber</th>
<th>AccountBalance</th>
<th>Account Type</th>
<th>AverageBalane</th>
</tr>
<%
List<Model> list=null;
list=(List)request.getAttribute("values");
Model emp=new Model();
Iterator itr=list.iterator();

while(itr.hasNext())
{ 
	emp=(Model)itr.next();
%>
<tr bgcolor="#e8eaf6">
<td> <%=emp.getAccountNumber() %> </td>
<td><%=emp.getAccountBalance() %></td>
<td><%=emp.getAccountType() %></td>
<td><%=emp.getAverageBalance() %>
</td>
</tr>
<tr>
<td  bgcolor="drackyellow" colspan=4 align="center" ><input type="submit"  value="Back"></td>
</tr>
<% 

}
%>



</form>
</table>
</body>
</html>