package br.com.mappy.mappyapi.model;

import java.util.Scanner;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Avaliacoes implements Apresentavel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idAvaliacao;
    private String comentario;
    private String notaCategoria;
  
    public Avaliacoes(){
        
    }

    public Avaliacoes(String comentario, String notaCategoria) {
        this.comentario = comentario;
        this.notaCategoria = notaCategoria;
    }

    
    public int getIdAvaliacao() {
        return idAvaliacao;
    }


    public void setIdAvaliacao(int idAvaliacao) {
        this.idAvaliacao = idAvaliacao;
    }


    public String getComentario() {
        return comentario;
    }


    public void setComentario(String comentario) {
        this.comentario = comentario;
    }


    public String getNotaCategoria() {
        return notaCategoria;
    }


    public void setNotaCategoria(String notaCategoria) {
        this.notaCategoria = notaCategoria;
    }


    @Override
    public String exibirDados() {
        return comentario + ", " + notaCategoria;
    }

    @Override
    public String definirApresentavel() {
        String resposta;
        System.out.println("Deseja apresentar a avaliação? Coloque S pra sim e N pra não.");
        Scanner leitor = new Scanner(System.in);
        resposta = leitor.nextLine();
        return resposta;
    }

}
