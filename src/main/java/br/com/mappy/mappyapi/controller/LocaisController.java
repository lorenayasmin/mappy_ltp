package br.com.mappy.mappyapi.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.mappy.mappyapi.model.Avaliacoes;
import br.com.mappy.mappyapi.model.Local;
import br.com.mappy.mappyapi.repository.AvaliacoesRepository;
import br.com.mappy.mappyapi.repository.LocaisRepository;

@RestController
@CrossOrigin
public class LocaisController {
    @Autowired
    AvaliacoesRepository avaliacoesRepository;
    LocaisRepository locaisRepository;

    public static void main(String[] args) {
        SpringApplication.run(LocaisController.class, args);
    }

    @GetMapping("/api/locais")
    public List<Local> getLocal(){
        return (List<Local>)locaisRepository.findAll();
    }

    @PostMapping("/api/locais")
    public String createLocal(@RequestBody Local local) {
        return locaisRepository.save(local) + "O novo local foi adicionado com sucesso";
    }

    @PostMapping("/api/locais/avaliacoes")
    public String createAvaliacoes(@RequestBody Avaliacoes avaliacoes){
        return avaliacoesRepository.save(avaliacoes) + "Sua avaliação foi realizada com sucesso";
    }

    @GetMapping("/api/locais/{id_local}")
    public Optional<Local> getPostagem(@PathVariable("id") Integer id_local){
      return (Optional<Local>)locaisRepository.findById(id_local);
    }

    @PutMapping("/api/locais")
    Local locais4() {
        return (Local) locaisRepository.findAll();
    }

    @PutMapping("/api/locais/avaliacoes/{id_local}")
    Optional<Avaliacoes> avaliacoes(@PathVariable("id_local") Integer idAvaliacao) {
        return avaliacoesRepository.findById(idAvaliacao);
    }


}
