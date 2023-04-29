<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>


<title>EO form</title>
</head>
<body>
<h3>EO Details</h3>


<form:form action="vote.html" method="post">
		
		<%-- <label>ElectionId</label>
		<form:input path="ElectionId" />
		<br /> --%>
		
		
		<label>candidateId</label>
		<form:input path="candidateId" />
		<br />
		
		<input type="submit" value="Create" /> <br><br>
	</form:form>
	
	<br /><br />
	
<%-- 	
<h3>User Profile</h3>

	<table border="1">
		<thead>
			<tr>
			
			   <td>electoralOfficerID</td>
			   <td>area constituency</td>	
			   
			   		
		</tr>
		</thead>
		<tbody>
		
               <c:forEach items="${EO}" var="u">
               
               
				<tr>
				   <td><c:out value="${u.electoralOfficerID}"></c:out></td>
				   <td><c:out value="${u.areaconstituency}"></c:out></td>
				   
				   </tr>
						</c:forEach>

		</tbody>
	</table>
	<br />
	<br />	
 --%>
</body>
</html>