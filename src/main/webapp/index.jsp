<%-- 
    Document   : index
    Created on : 19 de out. de 2023, 09:59:37
    Author     : rfdouro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="verificalogin.jsp" %>
<!DOCTYPE html>
<html>
 <head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Início</title>
 </head>
 <body>
  <h1>Olá ${sessionScope.usuario.login}</h1>
  <a href="/Controle?acao=deslogar">Sair</a>
 </body>
</html>
