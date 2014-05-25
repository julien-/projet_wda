<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>

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
			<th>Titre</th>
			<th>Annee</th>
			<th>Cout</th>
		</tr>
	</thead>
	<logic:iterate id="film" name="FILMS">
		<tr>
			<td><bean:write name="film" property="_titre" /></td>
			<td><bean:write name="film" property="_anneesortie" /></td>
			<td><bean:write name="film" property="_cout" /></td>
			<td>
				<bean:define id="id" name="film" property="_id" /><br>
				<html:link  page ="/DetailsFilm?id=${id}">
    				Detail
				</html:link>
			</td>
			<%-- <td>
				<html:submit property="id">Afficher</html:submit>
			</td>--%>
		</tr>
	</logic:iterate>
</table>
</FORM>
<p />
</center>

</body>


</html:html>


