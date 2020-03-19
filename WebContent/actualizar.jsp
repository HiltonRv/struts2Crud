<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s"   %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Actualizar Empresa</title>
</head>
<body>
<center>
<h1>Actualizar Empresa</h1>
<p></p>

	<s:form action="actualizar">
	<s:textfield label="ID" name="empresa.id" />
	<s:textfield label="RUC" name="empresa.ruc" />
	<s:textfield label="NOMBRE" name="empresa.nombre" />
	<s:textfield label="DIRECCION" name="empresa.direccion" />
	<s:textfield label="CORREO" name="empresa.correo" />
	<s:textfield label="ANIO CREACION" name="empresa.aniocreacion" />
	<s:checkbox name="empresa.estado" fieldValue="true" label="ESTADO"/>
	<s:submit value="Actualizar"/>
	</s:form>
	<p>
	<a href="index.jsp"> Menu Principal </a>
	</p>
</center>
</body>
</html>