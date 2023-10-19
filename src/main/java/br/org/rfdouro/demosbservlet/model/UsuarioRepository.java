/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.org.rfdouro.demosbservlet.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ANM
 */
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

 Usuario findByLoginAndSenha(String login, String senha);

}
