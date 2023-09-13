package br.com.mappy.mappyapi.model;

import java.util.ArrayList;

import br.com.mappy.mappyapi.Database;

public class CadastroDAO {
    private Database db;
    private static CadastroDAO instance;

    public Database getConnection() {
        if (this.db == null) {
            Database db = new Database();
            db.init();
            this.db = db;
        }
        return this.db;
    }

    public static CadastroDAO getInstance() {
        if (instance == null) {
            instance = new CadastroDAO();
        }
        return instance;
    }

    // cria um novo cadastro
    public void create(Cadastro novoCadastro) {
        Database db = getConnection();
        db.addDadoCadastro(novoCadastro);
    }

    // recupera todas as listas
    public ArrayList<Cadastro> read() {
        Database db = getConnection();
        return db.recuperaDadoCadastro();
    }

    // remove um item do cadastro
    public void delete(Cadastro delCadastro) {
        Database db = getConnection();
        db.delDadoCadastro(delCadastro);
    }

    public void update(Cadastro toUpdate) {
        // Sem implementação
    }

    static Database novoCadastro = new Database();
    public static Cadastro cadastro1 = novoCadastro.addDadoCadastro(null);

}
