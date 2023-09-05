package br.com.mappy.mappyapi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CadastroController {    

    @PostMapping("/api/cadastros/{id_cadastro}")
    public String cadastro(){
        return "Cadastro feito";
    }
}
