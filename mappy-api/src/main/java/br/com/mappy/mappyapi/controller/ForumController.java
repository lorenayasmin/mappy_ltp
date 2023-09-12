package br.com.mappy.mappyapi.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mappy.mappyapi.Database;
import br.com.mappy.mappyapi.model.Avaliacoes;
import br.com.mappy.mappyapi.model.Forum;
import br.com.mappy.mappyapi.model.ForumDAO;

@RestController
public class ForumController {

  Database postagem1 = new Database();
  ArrayList<Forum> listaPostagens = postagem1.getPostagem();

  @PutMapping("/api/forum/postagens")
  ArrayList forum() {
    return listaPostagens;
  }

  Database novoForum = new Database();
  Forum postagem2 = novoForum.addDadoForum(new Forum(null, null, null, null));

  @PostMapping("/api/forum/postagens/{id_postagem}")
  public String novoForum() {
    return postagem2 + "Sua postagem foi realizada com sucesso";
  }

  Database postagem3 = new Database();
  ArrayList<Forum> listaPostagens1 = postagem3.getPostagem();

  @GetMapping("/api/forum/postagens")
  ArrayList forum1() {
    return listaPostagens1;
  }

  Database deletar = new Database();
  Forum del1 = deletar.delDadoForum();

  @DeleteMapping("/api/forum/postagens{id_postagem}")
  public String deleteForum() {
    return del1 + "A postagem foi deletada";
  }

  @GetMapping("/api/forum/{id_postagem}")
  ArrayList<Forum> forum(@PathVariable("id_postagem") Integer idPostagem ) {
      return ForumDAO.getInstance().getById(idPostagem);
  }

}