package br.com.mappy.mappyapi.model;

import java.util.ArrayList;

import br.com.mappy.mappyapi.Database;

public class AtipicoDAO {
    private Database db;
    private static AtipicoDAO instance;

    public Database getConnection(){
        if(this.db == null){
            Database db = new Database();
            db.init();
            this.db = db;
        }
        return this.db;
    }

    public static AtipicoDAO getInstance(){
        if(instance == null){
            instance = new AtipicoDAO();
        }
        return instance;
    }
    
    //cria um novo cadastro
    public void create(Atipico novoAtipico){
        Database db = getConnection();
        db.addDadoAtipico(novoAtipico);
    }

    //recupera todas as listas
    public ArrayList<Atipico> read(){
        Database db = getConnection();
        return db.recuperaDadoAtipico();
    }

    // remove um item do cadastro
    public void delete(Atipico delAtipico){
        Database db = getConnection();
        db.delDadoAtipico(delAtipico);
    }

    public void update(Atipico toUpdate){
        // Sem implementação
    }
    
    
}
