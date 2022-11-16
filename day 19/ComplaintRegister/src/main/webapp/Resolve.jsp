<%@page import="com.infinite.ComplaintRegister.Complaint"%>
<%@page import="com.infinite.ComplaintRegister.ComplaintDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	ComplaintDAO dao = new ComplaintDAO();
	String cid =request.getParameter("id");
	Complaint complaint = dao.searchComplaint(cid);
%>
<form method="get" action="ResolveComplaint.jsp">
	<table border="3" align="center">
		<tr>
			<th colspan="2">Resolve Page</th></tr>
			<tr>
			<th>Complaint Id</th> 
			<td>
				<input type="text" name="complaintId" value=<%=complaint.getComplaintId() %> />
			  </td></tr>
			<tr>
			<th>Complaint Type</th>
			<td>
			<input type="text" name="complaintType" value=<%=complaint.getComplaintType() %> />
			</td></tr>
			<tr>
			<th>Complaint Description</th>
			<td>
			<input type="text" name="complaintDescription" value=<%=complaint.getcDescription() %> />
			 </td></tr>
			<tr>
			<th>Complaint Date</th>
			<td> 
			<input type="text" name="complaintDate" value=<%=complaint.getComplaintDate() %> />

			</td></tr>
			<tr>
			<th>Complaint Severity</th>
			<td> 
			<input type="text" name="severity" value=<%=complaint.getSeverity() %> />
			</td></tr>
			<tr>
			<th>Complaint Status</th>
			<td> 
			<input type="text" name="status" value=<%=complaint.getStatus() %> />
			 </td></tr>
		<tr>
			<th colspan="2">
				<input type="submit" value="Resolve" />
			</th>
		</tr>
	</table>
</form>
</body>
</html>
 