package br.com.mappy.mappyapi.model;

import java.util.Scanner;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Local {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idLocal;
    private String categoriaLocal;
    private String nomeLocal;
    private String endereco;
    private String descricao;

    public Local(){
    }

    public Local(String categoriaLocal, String nomeLocal, String endereco, String descricao) {
        this.categoriaLocal = categoriaLocal;
        this.nomeLocal = nomeLocal;
        this.endereco = endereco;
        this.descricao = descricao;

    }

    public int getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(int idLocal) {
        this.idLocal = idLocal;
    }

    public String getCategoriaLocal() {
        return categoriaLocal;
    }

    public void setCategoriaLocal(String categoriaLocal) {
        this.categoriaLocal = categoriaLocal;
    }

    public String getNomeLocal() {
        return nomeLocal;
    }

    public void setNomeLocal(String nomeLocal) {
        this.nomeLocal = nomeLocal;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void adicionarLocal() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Adicione um local!");
        System.out.println("Categoria do local (educação, saúde, cultura, lazer): ");
        categoriaLocal = ler.nextLine();
        System.out.println("Nome do local: ");
        nomeLocal = ler.nextLine();
        System.out.println("Endereço do local: ");
        endereco = ler.nextLine();
        System.out.println("Descrição do local: ");
        descricao = ler.nextLine();
        System.out
                .println("Local adicionado: " + categoriaLocal + ", " + nomeLocal + ", " + endereco + ", " + descricao);
    }

}
