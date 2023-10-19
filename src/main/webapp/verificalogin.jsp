<%-- 
    Document   : verificalogin
    Created on : 19 de out. de 2023, 12:58:05
    Author     : rfdouro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
 if(session.getAttribute("usuario")==null){
  response.sendRedirect("login.jsp");
 }
%>
