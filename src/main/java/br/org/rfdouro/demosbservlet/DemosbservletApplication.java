package br.org.rfdouro.demosbservlet;

import br.org.rfdouro.demosbservlet.model.Usuario;
import br.org.rfdouro.demosbservlet.model.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class DemosbservletApplication implements ApplicationRunner {

 @Autowired
 UsuarioRepository usuarioRepository;

 public static void main(String[] args) {
  SpringApplication.run(DemosbservletApplication.class, args);
 }

 public void run(ApplicationArguments args) {
  try {
   usuarioRepository.save(new Usuario("admin", "1234"));
  } catch (Exception ex) {

  }
 }

}
