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
<h1>Listar Empresa</h1>
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
<s:iterator value="lstEmpresa">
<tr>
<td><s:property value="id"/></td>
<td><s:property value="ruc"/></td>
<td><s:property value="nombre"/></td>
<td><s:property value="direccion"/></td>
<td><s:property value="correo"/></td>
<td><s:property value="aniocreacion"/></td>
<td><s:property value="estado"/></td>
</tr>
</s:iterator>
</tbody>
</table>
<a href="index.jsp">MENU PRINCIPAL</a>
</center>
</body>
</html>