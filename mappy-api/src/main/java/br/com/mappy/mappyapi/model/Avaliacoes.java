package br.com.mappy.mappyapi.model;

import java.util.Scanner;

public class Avaliacoes implements Apresentavel {

    private String comentario;
    private String notaCategoria;
    private int idAvaliacao;

    public Avaliacoes(String comentario, String notaCategoria, int idAvaliacao) {
        this.comentario = comentario;
        this.notaCategoria = notaCategoria;
        this.idAvaliacao = idAvaliacao;
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
