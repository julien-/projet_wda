<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html"%>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic"%>

<html:html>

<head>
<title><bean:message key="bienvenue.pro.title" /></title>
</head>

<body>
	<h3>
		<bean:message key="bienvenue.pro.title" />
	</h3>
	<p>
		<bean:message key="bienvenue.message" /> <%=session.getAttribute("login")%>
	</p>

	<a href="http://localhost:8080/projet_adw/vues/FormRechercheFilms.jsp">Rechercher
		un film</a>

	<a href="http://localhost:8080/projet_adw/vues/FormAjoutFilm.jsp">Ajouter
		un film</a>

	<a href="http://localhost:8080/projet_adw/action_confirmation.do">Confirmer
		Acteur/Film</a>

	<a href="http://localhost:8080/projet_adw/action_confirm_prod_film.do">Confirmer
		Producteur/Film</a>
		
		
		

	<a href="http://localhost:8080/projet_adw/action_confirm_real_film.do">Confirmer
		Realisateur/Film</a>
		
	<a href="http://localhost:8080/projet_adw/action_confirm_real_film.do">Confirmer
		Recompense/Film</a>
		
	<a href="http://localhost:8080/projet_adw/action_confirm_recomp_pers.do">Confirmer
		Recompense/Personne</a>
		
	<a href="http://localhost:8080/projet_adw/action_confirm_pers.do">Confirmer
		Personne</a>	

	<a href="http://localhost:8080/projet_adw/deconnexion_utilisateur.do">Déconnexion</a>

</body>

</html:html>


