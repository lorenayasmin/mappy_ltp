package br.com.mappy.mappyapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
    public Cadastro createCadastro(@RequestBody Cadastro cadastro) {
        return cadastroRepository.save(cadastro);
    }
}
