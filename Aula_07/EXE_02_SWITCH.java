/*
Exercício 2: Simulador de Assistente Virtual
Crie um programa que apresente ao usuário um menu de opções:
1 - Ver previsão do tempo
2 - Ver notícias
3 - Abrir agenda
4 - Ouvir música
Cada opção deve exibir uma mensagem simulando a resposta de um assistente virtual.
Use switch-case para controlar o fluxo.
 */
package Aula_07;

import java.util.Scanner;

public class EXE_02_SWITCH {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[1] Previsão do Tempo");
        System.out.println("[2] Notícias");
        System.out.println("[3] Agenda");
        System.out.println("[4] Ouvir Música");
        int opcao = sc.nextInt();
        String msn = null;

        switch (opcao) {
            case 1:
                msn = "O tempo estará ensolarado amanhã";
                break;
            case 2:
                msn = "Noticias diarias fresquinhas";
                break;
            case 3:
                msn = "Voce nao tem tarefas hoje";
                break;
            case 4:
                msn = "Continuar de onde parou?";
                break;
        }

        System.out.println("==============================");
        System.out.println(msn);
        System.out.println("==============================");
    }
}
