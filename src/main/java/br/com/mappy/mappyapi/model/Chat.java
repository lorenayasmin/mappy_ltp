package br.com.mappy.mappyapi.model;

import java.util.Scanner;

public class Chat {

    private String dataConversa;
    private int pergunta;

    public Chat(String dataConversa, int pergunta) {
        this.dataConversa = dataConversa;
        this.pergunta = pergunta;
    }

    public void FazerPergunta() {
        System.out.println("Pergunta 1: Qual a principal lei para deficientes?");
        System.out.println("Pergunta 2: O que posso fazer para aumentar a inclusão social?");
        System.out.println("Pergunta 3: Quais as formas de deixar um lugar acessível?");
        System.out.println("Escolha uma das perguntas: 1, 2 ou 3:");
        Scanner scanner = new Scanner(System.in);
        pergunta = scanner.nextInt();
        if (pergunta == 1) {
            System.out.println(
                    "A lei 13.146/2015 instituiu o estatuto da pessoa com deficiência para assegurar e promover condições de igualdade, exercício dos direitos e das liberdades fundamentais.");
        } else if (pergunta == 2) {
            System.out.println(
                    "Para aumentar a inclusão social, é necessário adotar medidas, como educação inclusiva, acesso a serviços básicos, oportunidades econômicas, combater discriminação e preconceito, participação cidadã, acesso à tecnologia e sensibilização para a diversidade.");
        } else if (pergunta == 3) {
            System.out.println(
                    "Para tornar um lugar mais acessível, pode-se adotar medidas, como ampliar o acesso físico, utilizar sinalização clara, realizar treinamento e conscientização, desenvolver tecnologia assistiva e divulgar informação acessível.");
        }
    }

}
