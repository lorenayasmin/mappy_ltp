package br.com.mappy.mappyapi.model;

import java.util.Scanner;

public class Forum implements Apresentavel{

    private String conteudoPostagem;
    private String dataPostagem;
    private String tituloPostagem;
    private String responsavelPostagem;
    
    public Forum(String conteudoPostagem, String dataPostagem, String tituloPostagem,
            String responsavelPostagem) {
        this.conteudoPostagem = conteudoPostagem;
        this.dataPostagem = dataPostagem;
        this.tituloPostagem = tituloPostagem;
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
