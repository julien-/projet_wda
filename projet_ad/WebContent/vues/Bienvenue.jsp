<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html"%>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic"%>
<%@page language="java" session="true" %>
<html:html>

<head>
<title><bean:message key="bienvenue.title" /></title>
</head>
<body>
	<h3>
		<bean:message key="bienvenue.titre" />
	</h3>
	<p>
		<bean:message key="bienvenue.message" />
	</p>
	<a href="http://localhost:8080/projet_adw/vues/FormRechercheFilms.jsp">Rechercher
		un film</a>
	<a href="http://localhost:8080/projet_adw/vues/FormAjoutFilm.jsp">Ajouter
		un film</a>
		
	<div style="float: left; width: 50%; background-color: yellow;">
		<h2>S'inscrire</h2>
		<div style="color:red">
			<html:errors />
		</div>
		<html:form action="/inscription_utilisateur.do">
			<table border="1" style="margin: auto;">
				<tr>
					<td>Pseudo</td>
					<td><html:text property="login"></html:text></td>
				</tr>
				<tr>
					<td>Mot de passe</td>
					<td><html:password property="pass"></html:password></td>
				</tr>
			</table>
		<html:submit>S'inscrire</html:submit>
		</html:form>
	</div>
	
	<div style="float: right; width: 50%; background-color: blue;">
		<h2>Se connecter</h2>
		<html:form action="/connexion_utilisateur.do">
			<table border="1" style="margin: auto;">
				<tr>
					<td>Pseudo</td>
					<td><html:text property="login"></html:text></td>
				</tr>
				<tr>
					<td>Mot de passe</td>
					<td><html:password property="pass"></html:password></td>
				</tr>
			</table>
		<html:submit>Se connecter</html:submit>
		</html:form>
	</div>
		<% if (session.getAttribute("erreur") != null && Integer.parseInt(session.getAttribute("erreur").toString()) == 0)
			out.print("Login ou mot de passe incorrect");
		%>
</body>

</html:html>


