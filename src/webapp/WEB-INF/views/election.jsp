<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Election form</title>
</head>
<body>
<h3>Election details</h3>

<form:form action="election.html" method="post">
		
		<label>election name</label> 
		<form:input path="electionname"  />     
		<br /> 
		
		<label>electionDate</label>
		<form:input type="date" placeholder="yyyy-MM-dd" path="electionDate" />
		<label>  yyyy/MM/dd</label>
		<br />
		
		<label>district</label>
		<form:input path="district" />
		<br />
		
		<label>constituency</label>
		<form:input path="constituency" />
		<br />
		
		<label>countingDate</label>
		<form:input type="date" placeholder="yyyy-MM-dd" path="countingDate" />
		<label>  yyyy/MM/dd</label>
		<br />
  <input type="submit" value="Create" /> <br><br>
	</form:form>
	
	<br /><br />
	
	<h3>User Profile</h3>

	<table border="1">
		<thead>
			<tr>
			  <!--  <td>ElectionId</td>   -->
				<td>Constituency</td>
				<td>Name</td>
				<td>Countingdate</td>
				<td>Electiondate</td>
				<td>District</td>
				
				
		</tr>
		</thead>
		<tbody>
		
               <c:forEach items="${UPCOMINGELECTION}" var="u">
               
               
				<tr>
				   <%--  <td><c:out value="${u.ElectionId}"></c:out></td>   --%>
					<td><c:out value="${u.constituency}"></c:out></td>
					<td><c:out value="${u.electionname}"></c:out></td>
					<td><c:out value="${u.electionDate}"></c:out></td>
					<td><c:out value="${u.countingDate}"></c:out></td>
					<td><c:out value="${u.district}"></c:out></td>
				</tr>
						</c:forEach>

		</tbody>
	</table>
	<br />
	<br />	

</body>
</html>