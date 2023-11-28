package br.com.mappy.mappyapi.model;

import java.util.Scanner;

public class Calendario implements Apresentavel {

    private String tituloEvento;
    private String dataEvento;
    private String descricaoEvento;
    private String lembreteEvento;

    public Calendario(String tituloEvento, String dataEvento, String descricaoEvento, String lembreteEvento) {
        this.tituloEvento = tituloEvento;
        this.dataEvento = dataEvento;
        this.descricaoEvento = descricaoEvento;
        this.lembreteEvento = lembreteEvento;
    }

    @Override
    public String exibirDados() {
        return tituloEvento + "/n" + dataEvento + "/n" + descricaoEvento + "/n" + lembreteEvento;
    }

    @Override
    public String definirApresentavel() {
        String resposta = "";
        System.out.println("Deseja apresentar o evento do calendário? Coloque S pra sim e N pra não.");
        Scanner read = new Scanner(System.in);
        resposta = read.nextLine();
        return resposta;
    }

}
