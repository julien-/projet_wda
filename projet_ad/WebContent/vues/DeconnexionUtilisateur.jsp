<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html"%>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Logout</title>
</head>
<body>
	<%
		session.invalidate();
	%>
	<p>Vous avez bien été déconnécté</p>
	<p>
		<a href="http://localhost:8080/projet_adw/vues/Bienvenue.jsp">Retour
			à l'accueil</a>
	</p>
</body>
</html>