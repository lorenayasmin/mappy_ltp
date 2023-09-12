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
import br.com.mappy.mappyapi.model.Local;
import br.com.mappy.mappyapi.model.LocalDAO;

@RestController
public class LocaisController {

    public static void main(String[] args) {
        SpringApplication.run(LocaisController.class, args);
    }

    Database local1 = new Database();
    ArrayList<Local> listaLocais = local1.getLocal();

    @GetMapping("/api/locais")
    ArrayList locais() {
        return listaLocais;
    }

    Database avaliacao1 = new Database();
    ArrayList<Avaliacoes> listaAvaliacoes = avaliacao1.getAvaliacoes();

    @PutMapping("/api/locais/avaliacoes/{id_local}")
    ArrayList avaliacoes() {
        return listaAvaliacoes;
    }

    Database novoLocal = new Database();
    Local local2 = novoLocal.addDadoLocal(new Local(null, null, null, null, 0));

    @PostMapping("/api/locais")
    public String novoLocal() {
        return local2 + "O novo local foi adicionado com sucesso";
    }

    Database novoAvaliacoes = new Database();
    Avaliacoes avaliacao2 = novoAvaliacoes.addDadoAvaliacoes(null);

    @PostMapping("/api/locais/avaliacoes/{id_local}")
    public String avaliacao(){
        return  avaliacao2 + "Sua avaliação foi realizada com sucesso";
    }

    @GetMapping("/api/locais/{id_local}")
    ArrayList<Local> locais(@PathVariable("id_local") Integer idLocal ) {
        return LocalDAO.getInstance().getById(idLocal);
    }

}
