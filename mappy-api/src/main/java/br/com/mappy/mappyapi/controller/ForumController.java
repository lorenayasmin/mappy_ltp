package br.com.mappy.mappyapi.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mappy.mappyapi.Database;
import br.com.mappy.mappyapi.model.Forum;

@RestController
public class ForumController {
    
 Database postagem1 = new Database();
   ArrayList<Forum> listaPostagens = postagem1.getPostagem();

 @PutMapping("/api/forum/postagens")
 ArrayList forum() {
    return listaPostagens;
}
}