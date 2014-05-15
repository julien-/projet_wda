<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>

<html:html>

<head>
	<title><bean:message key="bienvenue.title"/></title>
</head>

<body>
	<h3><bean:message key="bienvenue.titre" /></h3>
	<p><bean:message key="bienvenue.message" /></p>
	<a href="http://localhost:8080/projet_adw/films.do">Afficher tous les films</a>
</body>

</html:html>


