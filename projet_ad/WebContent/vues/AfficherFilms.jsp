<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<%@page language="java" session="true" %>


<html:html>

<head>
	<title><bean:message key="afficherfilms.title"/></title>
</head>

<body>

<center>
<h1>Resulats recherche</h1>
<p />
<table border="1">
	<thead>
		<tr>
			<th>Films</th>
		</tr>
	</thead>
	<logic:iterate id="film" name="FILMS">
		<tr>
			<td>
				<bean:define id="id" name="film" property="_id" /><br>
				<html:link  page ="/DetailsFilm?id=${id}">
    				<bean:write name="film" property="_titre" />
				</html:link>
			</td>
		</tr>
	</logic:iterate>
	</table>
	<%
	 
if(null != session.getAttribute("login"))
{  
	
	%>
	<table border="1">
		<thead>
			<tr>
				<th>
					Personnes
				</th>
			</tr>
		</thead>
	<logic:iterate id="personnes" name="PERSONNES">
		<tr>
			<td>
				<bean:define id="id" name="personnes" property="_id" /><br>
				<html:link  page ="/DetailPersonne?id=${id}">
    				<bean:write name="personnes" property="_prenom" /> <bean:write name="personnes" property="_nom" />
				</html:link>
			</td>
		</tr>
	</logic:iterate>
	<%} %>
</table>
</FORM>
<p />
</center>

</body>


</html:html>


