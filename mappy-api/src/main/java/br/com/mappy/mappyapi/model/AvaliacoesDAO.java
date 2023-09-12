package br.com.mappy.mappyapi.model;

import java.util.ArrayList;

import br.com.mappy.mappyapi.Database;

public class AvaliacoesDAO {
    
    private Database db;
    private static AvaliacoesDAO instance;

    public Database getConnection(){
        if(this.db == null){
            Database db = new Database();
            db.init();
            this.db = db;
        }
        return this.db;
    }

    public static AvaliacoesDAO getInstance(){
        if(instance == null){
            instance = new AvaliacoesDAO();
        }
        return instance;
    }
    
    //cria uma nova avaliação
    public void create(Avaliacoes novoAvaliacoes){
        Database db = getConnection();
        db.addDadoAvaliacoes(novoAvaliacoes);
    }

    //recupera todas as avaliações
    public ArrayList<Avaliacoes> read(){
        Database db = getConnection();
        return db.recuperaDadoAvaliacoes();
    }

    // remove um item da avaliação
    public void delete(Avaliacoes delAvaliacoes){
        Database db = getConnection();
        db.delDadoAvaliacoes(delAvaliacoes);
    }

    public void update(Avaliacoes toUpdate){
        // Sem implementação
    }

}
