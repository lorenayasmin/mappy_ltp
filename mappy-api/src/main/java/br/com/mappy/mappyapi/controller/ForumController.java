package br.com.mappy.mappyapi.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;


import br.com.mappy.mappyapi.model.Forum;
import br.com.mappy.mappyapi.model.ForumDAO;

@RestController
public class ForumController {

  @PutMapping("/api/forum/postagens")
  ArrayList forum() {
    return ForumDAO.listaPostagens;
  }

  @PostMapping("/api/forum/postagens/{id_postagem}")
  public String novoForum() {
    return ForumDAO.postagem2 + "Sua postagem foi realizada com sucesso";
  }

  @GetMapping("/api/forum/postagens")
  ArrayList forum1() {
    return ForumDAO.listaPostagens1;
  }

  @DeleteMapping("/api/forum/postagens{id_postagem}")
  public String deleteForum() {
    return ForumDAO.del1 + "A postagem foi deletada";
  }

  @GetMapping("/api/forum/{id_postagem}")
  ArrayList<Forum> forum(@PathVariable("id_postagem") Integer idPostagem) {
    return ForumDAO.getInstance().getById(idPostagem);
  }

}