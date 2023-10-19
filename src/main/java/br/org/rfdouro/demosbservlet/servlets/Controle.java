/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.org.rfdouro.demosbservlet.servlets;

import br.org.rfdouro.demosbservlet.model.PessoaRepository;
import br.org.rfdouro.demosbservlet.model.Usuario;
import br.org.rfdouro.demosbservlet.model.UsuarioRepository;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author ANM
 */
@WebServlet(name = "Controle", urlPatterns = {"/Controle"})
@Component
public class Controle extends HttpServlet {

 @Autowired
 private PessoaRepository pessoaRepository;
 @Autowired
 private UsuarioRepository usuarioRepository;

 protected void processRequest(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
  String acao = request.getParameter("acao");
  if (acao != null) {
   switch (acao) {
    case "logar" -> {
     String login = request.getParameter("login");
     String senha = request.getParameter("senha");
     Usuario u = usuarioRepository.findByLoginAndSenha(login, senha);
     if (u != null) {
      request.getSession().setAttribute("usuario", u);
      response.sendRedirect("/");
     }
    }
    case "deslogar" -> {
     request.getSession().removeAttribute("usuario");
     response.sendRedirect("/");
    }
   }
  }
 }

 @Override
 protected void doGet(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
  processRequest(request, response);
 }

 @Override
 protected void doPost(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
  processRequest(request, response);
 }

 @Override
 public String getServletInfo() {
  return "Short description";
 }

}
