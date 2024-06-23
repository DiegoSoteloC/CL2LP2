<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  	<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
  	
  	<%@page import="java.util.*" %>
    <%@page import="model.TblProductocl2" %>
     
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="c5dec8">

<h2 align="center">Listado de Producto</h2>

<table border="2" align="center">
<tr>
<td>Codigo</td>
<td>Nombre</td>
<td>PrecioV</td>
<td>PrecioC</td>
<td>Estado</td>
<td>Descripcion</td>
</tr>

<%
List<TblProductocl2> listadoproducto = (List<TblProductocl2>)request.getAttribute("listadodeproductos");
if(listadoproducto !=null){
    for(TblProductocl2 pro:listadoproducto){
        %>
        <tr>
        <td><%=pro.getIdproductocl2() %></td>
        <td><%=pro.getNombrecl2() %></td>
        <td><%=pro.getPrecioventacl2() %></td>
        <td><%=pro.getPreciocompcl2() %></td>
        <td><%=pro.getEstadocl2() %></td>
        <td><%=pro.getDescripcl2() %></td>
        </tr>
        <% 
    }
    %>
    <%
}
%>

</table>

</body>
</html>