<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html"%>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic"%>

<html:html>

<head>
<title><bean:message key="confirmationpropos.title" /></title>
</head>

<body>
	<h2>Confirmer des PRODUCTEURS</h2>
	<table border="1">
		<thead>
			<tr>
				<th>Nom producteur</th>
				<th>Prenom producteur</th>
				<th>a réalisé</th>
				<th>Titre film</th>
				<th></th>
			</tr>
		</thead>
		<logic:iterate id="_producteurfilm" name="PRODUCTEURFILM">
			<logic:equal name="_producteurfilm" property="_confirme" value="0">
				<tr>
					<td><bean:write name="_producteurfilm" property="_nom" /></td>
					<td><bean:write name="_producteurfilm" property="_prenom" /></td>
					<td>------------</td>
					<td><bean:write name="_producteurfilm" property="_titrefilm" /></td>
					<td><bean:define id="idp" name="_producteurfilm"
							property="_idproducteur" /> <bean:define id="idf" name="_producteurfilm"
							property="_idfilm" /> <%
 	java.util.HashMap params = new java.util.HashMap();
 				params.put("idp", idp);
 				params.put("idf", idf);
 				pageContext.setAttribute("paramsName", params);
 %> <html:link action="/confirmer_propos_prod_film.do" name="paramsName">
								Confirmer
							</html:link></td>
				</tr>
			</logic:equal>
		</logic:iterate>
	</table>

</body>

</html:html>


