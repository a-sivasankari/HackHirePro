<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>GIT</title>
</head>
<body>
<h1><center>GIT DETAILS</center></h1>
<table>

<tr>
<td>Repo : </td>
<td>
<form:select path="repos">
   <form:option value = "NONE" label = "Select"/>
   <form:options items = "${repos}" />
</form:select>  </td>
</tr></table>


</body>
</html>