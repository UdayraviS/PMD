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


<form:form action="candidate.html" method="post">
		
		<label>CandidateId</label> 
		<form:input path="CandidateId"  />     
		<br /> 
		
		
		<label>candidateName</label>
		<form:input path="candidateName" />
		<br />
		
		<label>dateOfBirth</label>
		<form:input type="date" placeholder="yyyy-MM-dd" path="dateOfBirth" />
		<label>  yyyy/MM/dd</label>
		<br />
		
		<label>mobileNo</label>
		<form:input path="mobileNo" />
		<br />
		
		<label>address</label>
		<form:input path="address" />
		<br />
		
		<label>emailID</label>
		<form:input path="emailID" />
		<br />
		
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
			     <td>CandidateId</td>  
				<td>candidateName</td>
				<td>dateOfBirth</td>
				<td>mobileNo</td>
				<td>address</td>
				<td>emailID</td>
				
				
		</tr>
		</thead>
		<tbody>
		
               <c:forEach items="${CANDIDATE}" var="u">
               
               
				<tr>
				 <td><c:out value="${u.candidateId}"></c:out></td>  
					<td><c:out value="${u.candidateName}"></c:out></td>
					<td><c:out value="${u.dateOfBirth}"></c:out></td>
					<td><c:out value="${u.mobileNo}"></c:out></td>
					<td><c:out value="${u.address}"></c:out></td>
					<td><c:out value="${u.emailID}"></c:out></td>
				</tr>
						</c:forEach>

		</tbody>
	</table>
	<br />
	<br />	 


</body>
</html>