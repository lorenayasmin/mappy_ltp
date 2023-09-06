package br.com.mappy.mappyapi.controller;

import java.util.ArrayList;

import javax.xml.crypto.Data;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mappy.mappyapi.Database;
import br.com.mappy.mappyapi.model.Local;


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

}
