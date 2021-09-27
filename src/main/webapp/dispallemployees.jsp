<%@ page language="java" import="java.util.List,java.util.ArrayList,com.ers.entity.EmployeeEntity" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display all employees</title>
 <style>
  
body {
  background-color: teal;
}
 
  </style>
</head>
<body>

<table>
<%
List<EmployeeEntity> elist=new ArrayList();
   Object o=session.getAttribute("elist");
   out.println(o.toString());

%>
</table>
</body>
</html>