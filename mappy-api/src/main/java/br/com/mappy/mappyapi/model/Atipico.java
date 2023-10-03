package br.com.mappy.mappyapi.model;

import java.util.Scanner;

public class Atipico extends Cadastro {

    private Avaliacoes notaCategoria;
    private Avaliacoes comentario;

    public Atipico(String nome, String email, String assuntoInteresse, String senha, String categoriaUsuario,
            int idCadastro, Avaliacoes notaCategoria, Avaliacoes comentario) {
        super(nome, email, assuntoInteresse, senha, categoriaUsuario);
        this.notaCategoria = notaCategoria;
        this.comentario = comentario;
    }

    @Override
    public void fazerAvaliação() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Atribua uma nota de 0 a 5 para quanto você sentiu confortável no local.");
        String notaCategoria = entrada.next();
        System.out.println("Escreva um comentário do local.");
        String comentario = entrada.next();
    }
}
