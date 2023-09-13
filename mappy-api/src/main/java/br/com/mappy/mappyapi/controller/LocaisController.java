package br.com.mappy.mappyapi.controller;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mappy.mappyapi.Database;
import br.com.mappy.mappyapi.model.Avaliacoes;
import br.com.mappy.mappyapi.model.AvaliacoesDAO;
import br.com.mappy.mappyapi.model.Local;
import br.com.mappy.mappyapi.model.LocalDAO;

@RestController
public class LocaisController {

    public static void main(String[] args) {
        SpringApplication.run(LocaisController.class, args);
    }

    @GetMapping("/api/locais")
    ArrayList locais() {
        return LocalDAO.listaLocais;
    }

    @PutMapping("/api/locais/avaliacoes/{id_local}")
    ArrayList<Avaliacoes> avaliacoes(@PathVariable("id_local") Integer idAvaliacao) {
        return AvaliacoesDAO.getInstance().getById(idAvaliacao);
    }

    @PostMapping("/api/locais")
    public String novoLocal() {
        return LocalDAO.local2 + "O novo local foi adicionado com sucesso";
    }


    @PostMapping("/api/locais/avaliacoes/{id_local}")
    public String avaliacao() {
        return LocalDAO.avaliacao2 + "Sua avaliação foi realizada com sucesso";
    }

    @GetMapping("/api/locais/{id_local}")
    ArrayList<Local> locais(@PathVariable("id_local") Integer idLocal) {
        return LocalDAO.getInstance().getById(idLocal);
    }

    @PutMapping("/api/locais")
    ArrayList locais4() {
        return LocalDAO.listaLocais;
    }

}
