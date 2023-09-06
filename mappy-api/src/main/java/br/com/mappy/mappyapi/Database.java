package br.com.mappy.mappyapi;

import java.util.ArrayList;

import br.com.mappy.mappyapi.model.Cuidador;
import br.com.mappy.mappyapi.model.Atipico;
import br.com.mappy.mappyapi.model.Cadastro;
import br.com.mappy.mappyapi.model.Forum;


// Esta classe simula um SGDB. Coloque onde ficará os dados aqui!
public class Database {
    private ArrayList<Forum> forum;
    private ArrayList<Cadastro> cadastro;
    private ArrayList<Atipico> atipico;
    private ArrayList<Cuidador> cuidador;
    
    public Database() {
        forum = new ArrayList<>();
        cadastro = new ArrayList<>();
        atipico = new ArrayList<>();
        cuidador = new ArrayList<>();
    }

    public void init(){
        forum.add(new Forum("blablabla", "25/09/2022", "Importância", "Nycoly"));
        forum.add(new Forum("blablabla", "07/04/2023", "Rotina", "Lorena"));
        forum.add(new Forum("blablabla", "18/05/2023", "Acessibilidade", "Victória"));
       
        cadastro.add(new Cadastro("Nycole", "nycole.b@gmail.com", "Importância", "1234", "deficiente visual"));
        cadastro.add(new Cadastro("Thiago", "thiago.p@gmail.com", "Rotina", "1234", "deficiente auditivo"));
        cadastro.add(new Cadastro("Eder", "eder.g@gmail.com", "Acessibilidade", "1234", "deficiente mental"));
    }

    public void addDadoForum(Forum novoForum){
        forum.add(novoForum);
    }

    public ArrayList<Forum> recuperaDadoForum(){
        return forum;    
    }

    public void delDadoForum(Forum delForum){
        forum.remove(delForum);
    } 

    public void addDadoAtipico(Atipico novoAtipico) {
        atipico.add(novoAtipico);
    } 

    public ArrayList<Atipico> recuperaDadoAtipico(){
        return atipico;
    }

    public void delDadoAtipico(Atipico delAtipico){
        atipico.remove(delAtipico);
    }

    public Cadastro addDadoCadastro(Cadastro novoCadastro) {
        cadastro.add(novoCadastro);
        return novoCadastro;
    }

    public ArrayList<Cadastro> recuperaDadoCadastro(){
        return cadastro;
    }

    public void delDadoCdastro(Cadastro delCadastro) {
        cadastro.remove(delCadastro);
    }

    public void addDadoForum(Cuidador novoCuidador){
        cuidador.add(novoCuidador);
    }

    public ArrayList<Cuidador> recuperaDadoCuidador(){
        return cuidador;    
    }

    public void delDadoCuidador(Cuidador delCuidador){
        cuidador.remove(delCuidador);
    } 
}