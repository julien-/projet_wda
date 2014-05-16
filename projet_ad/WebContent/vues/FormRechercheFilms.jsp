<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>

<html:html>

<head>
	<title><bean:message key="bienvenue.title"/></title>
</head>

<body>
	<html:form action="/AfficherFilms.jsp">
		<h2>Recherche de films</h2>
		<label for="nom">Titre</label>
		<html:text property="titre"></html:text>
		<html:submit>Rechercher</html:submit>
	</html:form>
</body>

</html:html>


