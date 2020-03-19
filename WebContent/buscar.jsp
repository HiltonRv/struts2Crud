<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s"   %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>Buscar Empresa</h1>
<div>
<s:form action="buscarEmpresa">
	<s:textfield name="empresa.id" label="ID EMPRESA"/>
	<s:submit value="Buscar"/>
</s:form>
</div>
<div>
<div>
<table border="1">
<thead>
<tr>
<th>ID</th>
<th>RUC</th>
<th>NOMBRE</th>
<th>DIRECCION</th>
<th>CORREO</th>
<th>ANIO CREACION</th>
<th>ESTADO</th>
</tr>
</thead>
<tbody>
<tr>
<td><s:property value="empresa.id"/></td>
<td><s:property value="empresa.ruc"/></td>
<td><s:property value="empresa.nombre"/></td>
<td><s:property value="empresa.direccion"/></td>
<td><s:property value="empresa.correo"/></td>
<td><s:property value="empresa.aniocreacion"/></td>
<td><s:property value="empresa.estado"/></td>
</tr>
</tbody>
</table>
</div>
</div>
<a href="index.jsp">MENU PRINCIPAL</a>
</center>
</body>
</html>