package br.com.mappy.mappyapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.mappy.mappyapi.model.Usuario;
import br.com.mappy.mappyapi.repository.UsuarioRepository;

public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    PasswordEncoder passwordEncoder;
    @GetMapping("/dados")
    public String getDados(){
        return "Dados retornados com sucesso";
    }

    @GetMapping("/livreAcesso")
    public String naoPrecisaDeLogin(@RequestBody Usuario user){
        return "Acessado sem login";
    }

    @PostMapping("/criarUsuario")
    public String criarUsuario(@RequestBody Usuario novoUser){
        novoUser.setPassword(
            passwordEncoder.encode(novoUser.getPassword()) 
        );
        Usuario usuarioCriado = usuarioRepository.save(novoUser);

        if(usuarioCriado != null)
            return "Usuário criado com sucesso!";        
        
        return "Usuário não criado";
    }
    
}
