package br.com.mappy.mappyapi.model;

import java.util.Scanner;

public class Cuidador extends Cadastro {

    private Avaliacoes notaCategoria;
    private Avaliacoes comentario;

    public Cuidador(String nome, String email, String assuntoInteresse, String senha, String categoriaUsuario,
            int idCadastro, Avaliacoes notaCategoria, Avaliacoes comentario) {
        super(nome, email, assuntoInteresse, senha, categoriaUsuario, idCadastro);
        this.notaCategoria = notaCategoria;
        this.comentario = comentario;
    }

    @Override
    public void fazerAvaliação() {
        Scanner ler = new Scanner(System.in);
        System.out.println(
                "Atribua uma nota de 0 a 5 em relação a quanto o atípico cuidado por você se sentiu bem no local:");
        String notaCategoria = ler.next();
        System.out.println("Escreva um comentário do local:");
        String comentario = ler.next();
    }

}
