<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
.required:after
{
    content:" *";
    color: red;
}

body
{
margin:0;
padding:0;
background-image: url("C:\Users\test\Desktop\bg.jpg");
background-size:cover;
background-position:center;
font-family:sans-serif;
color:red;
}
.login-box
{
width:320px;
height:420px;
background:rgba(0,0,0,0.5);
color:#fff;
top:50%;
left:50%;
position:absolute;
transform:translate(-50%,-50%);
box-sizing:border-box;
padding:70px 30px;
}
.avatar
{
width:100px;
height:100px;
border-radius:50%;
position:absolute;
top:-50px;
left:calc(50% - 50px);
}
h1
{
margin:0;
padding: 0 0 20px;
text- align: center;
form- size:22px
}
 .login-box p
 {
 margin:0;
 padding:0;
 font-weight:bold;
 }
.login-box input
{
width:100%;
margin-bottom:20px;
}
.login-box input[type="text"],input[type="password"]
{
border:none;
border-bottom:1px solid #fff;
background:transparent;
outline:none;
height:40px;
color:#fff;
font-size:16px

}
.login-box input[type="submit"]
{
border:none;
outline:none;
height:40px;
backgrount:#1c8adb;
color:red;
font-size:18px;
border-radius:20px;

}

.login-box input[type="reset"]
{
border:none;
outline:none;
height:30px;
backgrount:#1c8adb;
color:red;
font-size:18px;
border-radius:20px;

}


</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="login-box">
<img src=" C:\Users\test\Desktop\login.png" class="avatar">


<form action="Loginpage" method="get">
<h1>Login Here</h1>
 <p><label  class="requried"><font style="color:red;">*</font><b>UserName:</b></label></p>

 <input type="text" name="name" placeholder="Enter username">




<p><label class="requried"> <font style="color:red;">*</font><b>Pass Word:</b></label></p>
   <input type="text" name="pass"  placeholder="Enter password">




<input type="submit" value="submit">


<input type="reset" value="clear">



</form>


</div>
</body>
</html>