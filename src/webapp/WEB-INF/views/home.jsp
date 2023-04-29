<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.Set"%>
<%@page import="com.cruds.evs.bean.CredentialsBean"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
     <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home page</title>
</head>
<body>
<%

CredentialsBean user = (CredentialsBean) session.getAttribute("USER");

%>

<%-- <p>
    your role is <c:out value="${sessionScope.USER.userType=='V' }"/>
  </p> --%>
 <%
 		if(user.getUserType().equals("V"))
 		{	
 	
 	%>
<a href="profile.html">profile</a>
<br></br>
<%  
}
%> 

<%-- <p>
    your role is <c:out value="${sessionScope.USER.userType=='E' }"/>
  </p>
<a href="application.html">Application</a>
<br></br>


<p>
    your role is <c:out value="${sessionScope.USER.userType }"/>
  </p>
  
  <c:if test="${sessionScope.USER.userType == 'A' }"> 
   --%>
  <%
 		if(user.getUserType().equals("A"))
 		{	
 	
 	%>
  
  <a href="profilelist.html">profile</a>
  <br></br>
  
 <a href="election.html">election</a>
 <br></br>
 
<a href="party.html">Party</a>
<br></br>

<a href="candidate.html">Candidate</a>
<br></br>

<a href="profile.html">profile</a>
<br></br>
	<%
 		}
 	%>


<a href="eo.html">EO</a>
<br></br>

<a href="vote.html">vote</a>
<br></br>

<a href="result.html">Result</a>
<br></br>

<a href="candidatelist.html">list</a>
<br></br>


<a href="application.html">Application</a>
<br></br>

<!-- <a href="inactivate.html">inactive</a> -->


<a href="search.html">Search User</a>
<br></br>
<%-- <p>
    your role is <c:out value="${sessionScope.USER.userType=='C' }"/>
  </p>
<a href="candidate.html">Candidate</a>
<br></br> --%>



<%-- </c:if> --%>
</body>
</html>