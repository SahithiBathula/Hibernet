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
<form method="get" action="AddRoom.jsp">
<table border="3" align="center" >
<tr>
<th> Room Type </th>
<td> <input type="text" name="type" /></td>
</tr>
<th> Costperday</th>
<td> <input type="number" name="costperDay" /></td>
</tr>
<tr>
<th> Status </th>
<td>
<select name="status">
           <option value="AVAILABLE">Available</option>
           <option value="BOOKED">Booked</option>
</select>
</td>
</tr>
<tr>
<td>
<input type="Submit" value="AddRoom" />
</td>
</tr>
</table>
</form>
<c:if test="${param.type!=null && param.costPerDay!=null && param.status!=null}">
<jsp:useBean id="beanRoom" class="com.infinite.OyoHib.Room" />
<jsp:setProperty property="*" name="beanRoom" />
		<jsp:useBean id="beanDao" class="com.infinite.OyoHib.OyoDAO" />
		<c:out value="${beanDao.addRoom(beanRoom)}" />
</c:if>
</body>
</html>