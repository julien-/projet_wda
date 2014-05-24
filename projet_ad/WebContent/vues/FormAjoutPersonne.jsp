<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<%@page import="dao.DAOFilm"%>
<%@page import="dao.hbm.DAOFilmHBM"%>
<%@page import="java.util.ArrayList"%>
<%@page import="metier.*"%>

<html:html>

<head>
	<title><bean:message key="bienvenue.title"/></title>
</head>

<body>
	<html:form action="/ajout_personne.do">
		<h2>Ajouter une personne</h2>
		<label for="nom">Nom</label>
		<html:text property="nom"></html:text>
		<label for="prenom">Prenom</label>
		<html:text property="prenom"></html:text>
		<label for="annee">Annee de naissance</label>
		<html:text property="annee"></html:text>
		<label for=type>Type</label>
		<html:select property="type">
			<html:option value="acteur">Acteur</html:option>
			<html:option value="producteur">Producteur</html:option>
			<html:option value="realisateur">Realisateur</html:option>
		</html:select>
		<html:submit>Ajouter</html:submit>
	</html:form>
</body>

</html:html>


