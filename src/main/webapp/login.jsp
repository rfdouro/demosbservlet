<%-- 
    Document   : login
    Created on : 19 de out. de 2023, 10:44:26
    Author     : rfdouro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Login</title>
 </head>
 <body>
  <form method="post" action="Controle">
   <input type="hidden" name="acao" value="logar" />
   <fieldset>
    <legend>Dados de login</legend>
    <p><label>Login</label><input type="text" name="login" /></p>
    <p><label>Senha</label><input type="password" name="senha" /></p>
    <p><input type="submit" value="Logar-se"/></p>
   </fieldset>
  </form>
 </body>
</html>
