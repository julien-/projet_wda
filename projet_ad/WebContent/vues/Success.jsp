<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<%@page language="java" session="true" %>

<html:html>

<head>
	<title><bean:message key="bienvenue.title"/></title>
</head>

<body>
	<h1>Requ�te effectu�e avec succ�s !</h1>
	<% if (session.getAttribute("login") == null) 
	{%>
	<a href="http://localhost:8080/projet_adw/vues/Bienvenue.jsp">Retour � l'accueil</a>
<%} 
else
{%>
	<a href="http://localhost:8080/projet_adw/vues/AccueilPro.jsp">Retour � l'accueil</a>
<%} %>
</body>

</html:html>


