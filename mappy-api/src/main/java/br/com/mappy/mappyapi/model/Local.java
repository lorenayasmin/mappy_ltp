package br.com.mappy.mappyapi.model;

import java.util.Scanner;

public class Local {

    private String categoriaLocal;
    private String nomeLocal;
    private String endereco;
    private String descricao;
    private int idLocal;
    
    
    public Local(String categoriaLocal, String nomeLocal, String endereco, String descricao, int idLocal) {
        this.categoriaLocal = categoriaLocal;
        this.nomeLocal = nomeLocal;
        this.endereco = endereco;
        this.descricao = descricao;
        this.idLocal = idLocal;
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
        System.out.println("Local adicionado: " + categoriaLocal + ", " + nomeLocal + ", " + endereco + ", " + descricao);
    }
    
}
