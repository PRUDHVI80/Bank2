<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body bgcolor="#fffff">
<p  align="right">
<a href="Logout.jsp" > Logout</a></p>
<h1 align="center">Customer Service Menu</h1>

<%
 // int cuid=Integer.parseInt(request.getParameter("cuid"));
 // String name=request.getParameter("name");
   String cname=(String)session.getAttribute("cname");
   
   int cuid=(int)session.getAttribute("cuid");
  out.println("WELCOM..Mr/Ms..<br>");
     //out.println("              <br> "+cname +"<br> <br>");
   out.println("<br>"+cname+"<br>");
  //int AccountNumber=(int)session.getAttribute("AccountNumber");
  out.println("AccountNumber");
%>

   <input type="hidden" value="<%=cuid%>" name="cuid">

<br>
<a href="Details?cuid=<%=cuid%>">My Profile</a><br>
<br>
<a href="MyAccountDetails?cuid=<%=cuid%>">My Accounts</a><br>
<br>

<a href="Statement?cuid=<%=cuid%>">Account Statement</a><br>
</body>
</html>