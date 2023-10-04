package br.com.mappy.mappyapi.model;

import java.util.Scanner;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Forum implements Apresentavel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int IdPostagem;
    private String conteudoPostagem;
    private String dataPostagem;
    private String tituloPostagem;
    private String responsavelPostagem;

    public Forum(){
    }    

    public Forum(String conteudoPostagem, String dataPostagem, String tituloPostagem, String responsavelPostagem) {
        this.conteudoPostagem = conteudoPostagem;
        this.dataPostagem = dataPostagem;
        this.tituloPostagem = tituloPostagem;
        this.responsavelPostagem = responsavelPostagem;
    }

    

    public int getIdPostagem() {
        return IdPostagem;
    }

    public void setIdPostagem(int idPostagem) {
        IdPostagem = idPostagem;
    }

    public String getConteudoPostagem() {
        return conteudoPostagem;
    }

    public void setConteudoPostagem(String conteudoPostagem) {
        this.conteudoPostagem = conteudoPostagem;
    }

    public String getDataPostagem() {
        return dataPostagem;
    }

    public void setDataPostagem(String dataPostagem) {
        this.dataPostagem = dataPostagem;
    }

    public String getTituloPostagem() {
        return tituloPostagem;
    }

    public void setTituloPostagem(String tituloPostagem) {
        this.tituloPostagem = tituloPostagem;
    }

    public String getResponsavelPostagem() {
        return responsavelPostagem;
    }

    public void setResponsavelPostagem(String responsavelPostagem) {
        this.responsavelPostagem = responsavelPostagem;
    }

    @Override
    public String exibirDados() {
        return conteudoPostagem + "/n" + dataPostagem + "/n" + tituloPostagem + "/n" + responsavelPostagem;
    }

    @Override
    public String definirApresentavel() {
        String resposta = "";
        System.out.println("Deseja apresentar a postagem do fórum? Coloque S pra sim e N pra não.");
        Scanner enter = new Scanner(System.in);
        resposta = enter.nextLine();
        return resposta;
    }

}
