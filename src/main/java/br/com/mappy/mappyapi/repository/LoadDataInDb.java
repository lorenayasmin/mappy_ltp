package br.com.mappy.mappyapi.repository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;

import br.com.mappy.mappyapi.model.Usuario;

public class LoadDataInDb implements CommandLineRunner{
     
    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    PasswordEncoder passwordEncoder;
    
    @Override
    public void run(String... args) throws Exception {
        ArrayList<Usuario> novosUsuarios = new ArrayList<>();
        novosUsuarios.add(new Usuario("Lorena", passwordEncoder.encode("1234")));
        novosUsuarios.add(new Usuario("Nicoly", passwordEncoder.encode("1234")));
        
        usuarioRepository.saveAll(novosUsuarios);
    }
}
