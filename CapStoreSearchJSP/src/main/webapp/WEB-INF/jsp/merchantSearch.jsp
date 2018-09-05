<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Result Page</title>
</head>
<body>
<table>
<tr>
<td>		Merchant Email Id:   ${merchant.emailId}</td>
</tr>
<tr>
<td>			Merchant Name:   ${merchant.merchantName}</td>
</tr>
<tr>
<td>			 Phone number:   ${merchant.phoneNo}</td>
</tr>
<tr>
<td>			Merchant type:   ${merchant.type}</td>
</tr>
<tr>
<td><a href="Orders" name="orders">			Orders</a></td>
</tr>
<tr>
<td>		Coupons Available:   ${merchant.coupons}</td>
</tr>
</table>
</body>
</html>