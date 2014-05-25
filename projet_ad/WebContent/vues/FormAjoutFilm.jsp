<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>

<html:html>

<head>
	<title><bean:message key="bienvenue.title"/></title>
</head>

<body>
	<html:form action="/ajout_films.do">
		<h2>Ajouter un film</h2>
		<label for="titre">Titre</label>
		<html:text property="titre"></html:text>
		<label for="cout">Cout</label>
		<html:text property="cout"></html:text>
		<label for="annee">Annee</label>
		<html:text property="annee"></html:text>
		<html:submit>Ajouter</html:submit>
	</html:form>
</body>

</html:html>


