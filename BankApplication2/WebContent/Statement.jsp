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
<h1 align="center"> MyBankStatementDetails..</h1>
<table align="center"  cellpadding="5" cellspacing="5" border=1 >
<tr bgcolor="#e3f2fd">
<th>Date</th>
<th>Description</th>
<th>Credit/DebitAmount</th>
<th>Closing Balance</th>
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
<td><%=emp.getDate() %></td>
<td><%=emp.getDescription() %></td>
<td><%=emp.getCreditDebitAmount() %></td>
<td><%=emp.getClosingBalance() %></td>
</tr>
<% 
}
%>


</table>
</body>
</html>