package br.com.mappy.mappyapi.model;

import java.util.ArrayList;

import br.com.mappy.mappyapi.Database;

public class ForumDAO {
    private Database db;
    private static ForumDAO instance;

    public Database getConnection(){
        if(this.db == null){
            Database db = new Database();
            db.init();
            this.db = db;
        }
        return this.db;
    }

    public static ForumDAO getInstance(){
        if(instance == null){
            instance = new ForumDAO();
        }
        return instance;
    }
    
    //cria um novo cadastro
    public void create(Forum novoForum){
        Database db = getConnection();
        db.addDadoForum(novoForum);
    }

    //recupera todas as listas
    public ArrayList<Forum> read(){
        Database db = getConnection();
        return db.recuperaDadoForum();
    }

    // remove um item do cadastro
    public void delete(Forum delForum){
        Database db = getConnection();
        db.delDadoForum(delForum);
    }

    public void update(Forum toUpdate){
        // Sem implementação
    }

    public ArrayList<Forum> getById(Integer idPostagem) {
        Database db = getConnection();
        ArrayList<Forum> PostagemRecebida = db.recuperaDadoIdPostagem();
        return db.recuperaDadoForum();
    
    }
}
