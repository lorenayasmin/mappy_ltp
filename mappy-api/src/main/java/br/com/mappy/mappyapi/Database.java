package br.com.mappy.mappyapi;

import java.util.ArrayList;

import br.com.mappy.mappyapi.model.Cuidador;
import br.com.mappy.mappyapi.model.Atipico;
import br.com.mappy.mappyapi.model.Avaliacoes;
import br.com.mappy.mappyapi.model.Cadastro;
import br.com.mappy.mappyapi.model.Forum;
import br.com.mappy.mappyapi.model.Local;

// Esta classe simula um SGDB. Coloque onde ficará os dados aqui!
public class Database {
    private ArrayList<Forum> forum;
    private ArrayList<Cadastro> cadastro;
    private ArrayList<Atipico> atipico;
    private ArrayList<Cuidador> cuidador;
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
        atipico = new ArrayList<>();
        cuidador = new ArrayList<>();
        local = new ArrayList<>();
        avaliacoes = new ArrayList<>();
    }

    public void init() {
        forum.add(new Forum("blablabla", "25/09/2022", "Importância", "Nycoly", 1));
        forum.add(new Forum("blablabla", "07/04/2023", "Rotina", "Lorena", 2));
        forum.add(new Forum("blablabla", "18/05/2023", "Acessibilidade", "Victória", 3));

        cadastro.add(new Cadastro("Nycole", "nycole.b@gmail.com", "Importância", "1234", "deficiente visual", 1));
        cadastro.add(new Cadastro("Thiago", "thiago.p@gmail.com", "Rotina", "1234", "deficiente auditivo", 2));
        cadastro.add(new Cadastro("Eder", "eder.g@gmail.com", "Acessibilidade", "1234", "deficiente mental", 3));

        local.add(new Local("Escola", "IFSP", "Rua A", "Ensino de qualidade", 1));
        local.add(new Local("Lazer", "Lago do taboão", "Rua B", "Local muito agradavel", 2));
        local.add(new Local("Saúde", "Husf", "Rua C", "Hospital de qualidade", 3));

        avaliacoes.add(new Avaliacoes("Local muito bom", "4 estrelas", 1));
        avaliacoes.add(new Avaliacoes("Muito acessivel", "5 estrelas", 2));
        avaliacoes.add(new Avaliacoes("Adorei este lugar", "4 estrelas", 3));

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

    public void addDadoAtipico(Atipico novoAtipico) {
        atipico.add(novoAtipico);
    }

    public ArrayList<Atipico> recuperaDadoAtipico() {
        return atipico;
    }

    public void delDadoAtipico(Atipico delAtipico) {
        atipico.remove(delAtipico);
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

    public void addDadoCuidador(Cuidador novoCuidador) {
        cuidador.add(novoCuidador);
    }

    public ArrayList<Cuidador> recuperaDadoCuidador() {
        return cuidador;
    }

    public void delDadoCuidador(Cuidador delCuidador) {
        cuidador.remove(delCuidador);
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