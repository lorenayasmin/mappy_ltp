package br.com.mappy.mappyapi.model;

import java.util.Scanner;

public class Cadastro {

    private String nome;
    private String email;
    private String assuntoInteresse;
    private String senha;
    private String categoriaUsuario;
    private int idCadastro;

    public Cadastro(String nome, String email, String assuntoInteresse, String senha, String categoriaUsuario,
            int idCadastro) {
        this.nome = nome;
        this.email = email;
        this.assuntoInteresse = assuntoInteresse;
        this.senha = senha;
        this.categoriaUsuario = categoriaUsuario;
        this.idCadastro = idCadastro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAssuntoInteresse() {
        return assuntoInteresse;
    }

    public void setAssuntoInteresse(String assuntoInteresse) {
        this.assuntoInteresse = assuntoInteresse;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCategoriaUsuario() {
        return categoriaUsuario;
    }

    public void setCategoriaUsuario(String categoriaUsuario) {
        this.categoriaUsuario = categoriaUsuario;
    }

    public void fazerAvaliação() {

    }

    public void confirmarSenha() {
        System.out.println("Confirme a senha!");
        Scanner x = new Scanner(System.in);
        String confirmarSenha = x.next();
        if (confirmarSenha.equals(getSenha())) {
            System.out.println("Senha confirmada!");
        } else {
            System.out.println("Senha incorreta!");
        }

    }

}
