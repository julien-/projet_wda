<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html"%>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic"%>

<html:html>

<head>
<title><bean:message key="confirmationpropos.title" /></title>
</head>

<body>
	<h2>Confirmer des ACTEURS</h2>
	<table border="1">
		<thead>
			<tr>
				<th>Nom acteur</th>
				<th>Prenom acteur</th>
				<th>a joué dans</th>
				<th>Titre film</th>
				<th></th>
			</tr>
		</thead>
		<logic:iterate id="_acteurfilm" name="ACTEURFILM">
			<logic:equal name="_acteurfilm" property="_confirme" value="0">
				<tr>
					<td><bean:write name="_acteurfilm" property="_nom" /></td>
					<td><bean:write name="_acteurfilm" property="_prenom" /></td>
					<td>------------</td>
					<td><bean:write name="_acteurfilm" property="_titrefilm" /></td>
					<td><bean:define id="ida" name="_acteurfilm"
							property="_idacteur" /> <bean:define id="idf" name="_acteurfilm"
							property="_idfilm" /> <%
 	java.util.HashMap params = new java.util.HashMap();
 				params.put("ida", ida);
 				params.put("idf", idf);
 				pageContext.setAttribute("paramsName", params);
 %> <html:link action="/confirmer_propos.do" name="paramsName">
								Confirmer
							</html:link></td>
				</tr>
			</logic:equal>
		</logic:iterate>
	</table>

</body>

</html:html>


