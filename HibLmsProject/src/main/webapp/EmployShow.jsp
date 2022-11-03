<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <jsp:useBean id="beanDao" class="com.infinite.Hib.EmployDAO"/>
	<table border="3" align="center">
	<tr>
		<th>Employ Id</th>
		<th>Employ Name</th>
		<th>Email</th>
		<th>Mobile No</th>
		<th>Date Of Join</th>
		<th>Department</th>
		<th>Manager Id</th>
		<th>LeaveAvail</th>
	</tr>
	<c:forEach var="employ1" items="${beanDao.showEmploy() }" >
		
	
		<tr>
			<td>${employ1.empId}</td>
			<td>${employ1.name}</td>
			<td>${employ1.email}</td>
			<td>${employ1.mob}</td>
			<td>${employ1.doj}</td>
			<td>${employ1.dept}</td>
			<td>${employ1.mId}</td>
			<td>${employ1.leaveAvail}</td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>