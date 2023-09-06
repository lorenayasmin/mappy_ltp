package br.com.mappy.mappyapi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mappy.mappyapi.Database;
import br.com.mappy.mappyapi.model.Cadastro;

@RestController
public class CadastroController {    

    Database novoCadastro = new Database();
    Cadastro cadastro1 = novoCadastro.addDadoCadastro(null);

    @PostMapping("/api/cadastros/{id_cadastro}")
    public String cadastro(){
        return cadastro1 + "Seu cadastro foi realizado com sucesso";
    }
}
