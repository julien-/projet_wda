<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<%@page language="java" session="true" %>
<html:html>

<head>
	<title><bean:message key="bienvenue.title"/></title>
</head>
	<% out.print(session.getAttribute("login"));%>
<body>
	<html:form action="/recherche_films.do">
		<h2>Recherche de films</h2>
		<label for="titre">Titre</label>
		<html:text property="titre"></html:text>
		<html:submit>Rechercher</html:submit>
	</html:form>
</body>

</html:html>


