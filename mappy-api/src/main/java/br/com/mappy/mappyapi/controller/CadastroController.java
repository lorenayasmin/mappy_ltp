package br.com.mappy.mappyapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.mappy.mappyapi.model.Cadastro;
import br.com.mappy.mappyapi.model.CadastroDAO;
import br.com.mappy.mappyapi.repository.CadastroRepository;

@RestController
@CrossOrigin
public class CadastroController {
    @Autowired
    CadastroRepository cadastroRepository;

    @PostMapping("/api/cadastros")
    public String createCadastro(@RequestBody Cadastro cadastro) {
        return cadastroRepository.save(cadastro) +  "Seu cadastro foi realizado com sucesso";
    }
}
