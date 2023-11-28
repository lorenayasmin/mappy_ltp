package br.com.mappy.mappyapi;

import java.util.ArrayList;

import br.com.mappy.mappyapi.model.Avaliacoes;
import br.com.mappy.mappyapi.model.Cadastro;
import br.com.mappy.mappyapi.model.Forum;
import br.com.mappy.mappyapi.model.Local;

// Esta classe simula um SGDB. Coloque onde ficará os dados aqui!
public class Database {
    private ArrayList<Forum> forum;
    private ArrayList<Cadastro> cadastro;
    private ArrayList<Local> local;
    private ArrayList<Avaliacoes> avaliacoes;

    public ArrayList<Local> getLocal() {
        return local;
    }

    public ArrayList<Forum> getPostagem() {
        return forum;
    }

    public ArrayList<Forum> getPostagem1() {
        return forum;
    }

    public ArrayList<Avaliacoes> getAvaliacoes() {
        return avaliacoes;
    }

    public Database() {
        forum = new ArrayList<>();
        cadastro = new ArrayList<>();
        local = new ArrayList<>();
        avaliacoes = new ArrayList<>();
    }

    public void init() {
        forum.add(new Forum("blablabla", "25/09/2022", "Importância", "Nycoly"));
        forum.add(new Forum("blablabla", "07/04/2023", "Rotina", "Lorena"));
        forum.add(new Forum("blablabla", "18/05/2023", "Acessibilidade", "Victória"));

        cadastro.add(new Cadastro("Nycole", "nycole.b@gmail.com", "Importância", "1234", "deficiente visual"));
        cadastro.add(new Cadastro("Thiago", "thiago.p@gmail.com", "Rotina", "1234", "deficiente auditivo"));
        cadastro.add(new Cadastro("Eder", "eder.g@gmail.com", "Acessibilidade", "1234", "deficiente mental"));

        local.add(new Local("Escola", "IFSP", "Rua A", "Ensino de qualidade"));
        local.add(new Local("Lazer", "Lago do taboão", "Rua B", "Local muito agradavel"));
        local.add(new Local("Saúde", "Husf", "Rua C", "Hospital de qualidade"));

        avaliacoes.add(new Avaliacoes("Local muito bom", "4 estrelas"));
        avaliacoes.add(new Avaliacoes("Muito acessivel", "5 estrelas"));
        avaliacoes.add(new Avaliacoes("Adorei este lugar", "4 estrelas"));

    }

    public Forum addDadoForum(Forum novoForum) {
        forum.add(novoForum);
        return novoForum;
    }

    public ArrayList<Forum> recuperaDadoForum() {
        return forum;
    }

    public ArrayList<Forum> recuperaDadoIdPostagem() {
        return getPostagem(0);
    }

    private ArrayList<Forum> getPostagem(int i) {
        return null;
    }

    public Forum delDadoForum() {
        forum.remove(forum);
        return null;
    }

    public Cadastro addDadoCadastro(Cadastro novoCadastro) {
        cadastro.add(novoCadastro);
        return novoCadastro;
    }

    public ArrayList<Cadastro> recuperaDadoCadastro() {
        return cadastro;
    }

    public void delDadoCadastro(Cadastro delCadastro) {
        cadastro.remove(delCadastro);
    }


    public Local addDadoLocal(Local novoLocal) {
        local.add(novoLocal);
        return novoLocal;
    }

    public ArrayList<Local> recuperaDadoLocal() {
        return local;
    }

    public ArrayList<Local> recuperaDadoIdLocal() {
        return getLocal(0);
    }

    private ArrayList<Local> getLocal(int i) {
        return null;
    }

    public void delDadoLocal(Local delLocal) {
        local.remove(delLocal);
    }

    public Avaliacoes addDadoAvaliacoes(Avaliacoes novoAvaliacoes) {
        avaliacoes.add(novoAvaliacoes);
        return novoAvaliacoes;
    }

    public ArrayList<Avaliacoes> recuperaDadoAvaliacoes() {
        return avaliacoes;
    }

    public void delDadoAvaliacoes(Avaliacoes delAvaliacoes) {
        avaliacoes.remove(delAvaliacoes);
    }

    public ArrayList<Avaliacoes> recuperaDadoIdAvaliacao() {
        return getAvaliacao(0);
    }

    private ArrayList<Avaliacoes> getAvaliacao(int i) {
        return null;
    }

}