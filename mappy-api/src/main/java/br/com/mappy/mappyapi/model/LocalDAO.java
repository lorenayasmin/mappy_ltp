package br.com.mappy.mappyapi.model;

import java.util.ArrayList;

import br.com.mappy.mappyapi.Database;

public class LocalDAO {

    private Database db;
    private static LocalDAO instance;

    public Database getConnection(){
        if(this.db == null){
            Database db = new Database();
            db.init();
            this.db = db;
        }
        return this.db;
    }

    public static LocalDAO getInstance(){
        if(instance == null){
            instance = new LocalDAO();
        }
        return instance;
    }
    
    //cria um novo cadastro
    public void create(Local novoLocal){
        Database db = getConnection();
        db.addDadoLocal(novoLocal);
    }

    //recupera todas as listas
    public ArrayList<Local> read(){
        Database db = getConnection();
        return db.recuperaDadoLocal();
    }

    // remove um item do cadastro
    public void delete(Local delLocal){
        Database db = getConnection();
        db.delDadoLocal(delLocal);
    }

    public void update(Local toUpdate){
        // Sem implementação
    }

    public ArrayList<Local> getById(Integer idLocal) {
        Database db = getConnection();
        ArrayList<Local> localRecebido = db.recuperaDadoIdLocal();
        return db.recuperaDadoLocal();
    
    }
    
}
