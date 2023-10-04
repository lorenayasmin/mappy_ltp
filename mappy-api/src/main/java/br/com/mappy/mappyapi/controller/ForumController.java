package br.com.mappy.mappyapi.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.mappy.mappyapi.model.Forum;
import br.com.mappy.mappyapi.model.ForumDAO;
import br.com.mappy.mappyapi.repository.CadastroRepository;
import br.com.mappy.mappyapi.repository.ForumRepository;

@RestController
public class ForumController {
   @Autowired
    ForumRepository forumRepository;

  @PostMapping("/api/forum/postagens")
  public Forum createForum(@RequestBody Forum forum) {
    return forumRepository.save(forum);    
  }

  @GetMapping("/api/forum")
  public List<Forum> getPostagem(){
      return (List<Forum>)forumRepository.findAll();
  }

  @GetMapping("/api/forum/{id_postagem}")
    public Optional<Forum> getPostagem(@PathVariable("id") Integer id_postagem){
      return (Optional<Forum>)forumRepository.findById(id_postagem);
    }
    
    @PutMapping("/api/forum/postagens")
    Forum forum() {
      return (Forum) forumRepository.findAll();
    }
  
}