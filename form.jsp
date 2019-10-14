<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring Demo Basic</title>
</head>
<body>
<h2>Welcome to Ozan's Spring MVC Tutorial Series</h2>
 <form:form action="processForm"  modelAttribute="" >
 	<form:input path="name"/>
 	<br>
 	<form:input path="surName"/>
 	<br>
 	<form:input path="phoneNumber"/>
 	<br>
 	<form:select path="country">
 	<form:options items="${customer.countries}" />
 	</form:select> 
 </form:form>
<input type="submit"/>
</form>
</body>
</html>