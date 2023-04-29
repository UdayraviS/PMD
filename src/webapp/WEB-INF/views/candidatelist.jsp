<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="candidatelist.html" method="post">

<h3>User Profile</h3>

	<table border="1">
		<thead>
			<tr>
			    <td>CandidateId</td>  
				<td>candidateName</td>
				<td>dateOfBirth</td>
				<td>mobileNo</td>
				<td>address</td>
				<td>emailID</td> 
				<td>PartyId</td>
				
				
		</tr>
		</thead>
		<tbody>
		</form:form>
               <c:forEach items="${CANDI}" var="u">
               
               
				 <tr>
					 <td><c:out value="${u.candidateId}"></c:out></td> 
					<td><c:out value="${u.candidateName}"></c:out></td>
					<td><c:out value="${u.dateOfBirth}"></c:out></td>
					<td><c:out value="${u.mobileNo}"></c:out></td>
					<td><c:out value="${u.address}"></c:out></td>
					<td><c:out value="${u.emailID}"></c:out></td> 
					<td><c:out value="${u.party}"></c:out></td>
				</tr>
						</c:forEach>

		</tbody>
	</table>
	<br />
	<br />	 







</body>
</html>