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

<title>application form</title>
</head>
<body>
<h3>application Details</h3>


<form:form action="application.html" method="post">
		
		<%-- <label>userID</label> 
		<form:input path="userID"  />     
		<br />  --%>
		
		<label>constituency</label>
		<form:input path="constituency" />
		<br />
		
		
  <input type="submit" value="Create" /> <br><br>
	</form:form>
	
	<br /><br />
	
	<h3>User Profile</h3>

	<table border="1">
		<thead>
			<tr>
			<!-- //    <td>ElectionId</td> -->
			  <!--  <td>userID</td> -->
			   <td>constituency</td>
				<td>passed status</td>				
				<td>approved status</td>
				<td>voterId</td>
				
				
		</tr>
		</thead>
		<tbody>
		
               <c:forEach items="${APP}" var="u">
               
               
				<tr>
				   <%--  <td><c:out value="${u.ElectionId}"></c:out></td> --%>
				  <%--  <td><c:out value="${u.userID}"></c:out></td> --%>
				   <td><c:out value="${u.constituency}"></c:out></td>
					<td><c:out value="${u.passedstatus}"></c:out></td>
					<td><c:out value="${u.approvedstatus}"></c:out></td>
					<td><c:out value="${u.voterId}"></c:out></td>
				</tr>
						</c:forEach>

		</tbody>
	</table>
	<br />
	<br />	



</body>
</html>