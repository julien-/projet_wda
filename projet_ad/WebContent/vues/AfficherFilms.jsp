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
		</tr>
	</thead>
	<logic:iterate id="film" name="FILMS">
		<tr>
			<td>
				<bean:define id="id" name="film" property="_id" /><br>
				<html:link  page ="/DetailsFilm?id=${id}">
    				<bean:write name="film" property="_titre" />
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


