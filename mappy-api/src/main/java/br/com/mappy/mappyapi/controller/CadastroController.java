package br.com.mappy.mappyapi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


import br.com.mappy.mappyapi.model.CadastroDAO;

@RestController
public class CadastroController {


    @PostMapping("/api/cadastros/{id_cadastro}")
    public String cadastro() {
        return CadastroDAO.cadastro1 + "Seu cadastro foi realizado com sucesso";
    }
}
