<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html"%>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic"%>

<html:html>

<head>
<title><bean:message key="confirmationpropos.title" /></title>
</head>

<body>
	<h2>Confirmer des ACTEURS</h2>
	<html:form action="/confirmer_propos.do">
		<table border="1">
			<thead>
				<tr>
					<th>Nom</th>
					<th>Prenom</th>
					<th>Date de naissance</th>
					<th>Photo</th>
					<th>Confirmer ?</th>
				</tr>
			</thead>
			<logic:iterate id="_acteur" name="ACTEURFILM">
				<logic:equal name="_acteur" property="_confirme" value="0">
					<tr>
						<td><bean:write name="_acteur" property="_nom" /></td>
						<td><bean:write name="_acteur" property="_prenom" /></td>
						<td><bean:write name="_acteur" property="_datenaiss" /></td>
						<td><img alt="Photo"
							src="<bean:write name="_acteur" property="_photo"/>" /></td>
						<td><html:checkbox property="_id" /><bean:write name="_acteur" property="_id"/></td>
					</tr>
				</logic:equal>
			</logic:iterate>
		</table>
		<html:submit>Ajouter</html:submit>
	</html:form>

	



</body>

</html:html>


