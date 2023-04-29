<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Party form</title>
</head>
<body>
<h3>Party Details</h3>


<form:form action="party.html" method="post">
		
		<label>partyId</label> 
		<form:input path="partyId"  />     
		<br /> 
		
		<label>partyName</label>
		<form:input path="partyName" />
		<br />
		
		<label>leader</label>
		<form:input path="leader" />
		<br />
		
		<label>symbol</label>
		<form:input path="symbol" />
		<br />
		
  <input type="submit" value="Create" /> <br><br>
	</form:form>
	
	<br /><br />
	
	<h3>User Profile</h3>

	<table border="1">
		<thead>
			<tr>
			<!-- //    <td>ElectionId</td> -->
			   <td>PartyId</td>
			   <td>partyName</td>
				<td>Leader</td>				
				<td>Symbol</td>
				
				
				
		</tr>
		</thead>
		<tbody>
		
               <c:forEach items="${PARTY}" var="u">
               
               
				<tr>
				   <%--  <td><c:out value="${u.ElectionId}"></c:out></td> --%>
				   <td><c:out value="${u.partyName}"></c:out></td>
				   <td><c:out value="${u.partyId}"></c:out></td>
					<td><c:out value="${u.leader}"></c:out></td>
					<td><c:out value="${u.symbol}"></c:out></td>
				</tr>
						</c:forEach>

		</tbody>
	</table>
	<br />
	<br />	

</body>
</html>