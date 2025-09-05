/*
10. Jogo de Adivinhação: DESAFIO

Gerar um número aleatório entre 1 e 100 e solicitar ao usuário que adivinhe o número, fornecendo dicas (maior ou menor) a cada tentativa. Limitar o número de tentativas a 7.
 */
package Aula_04;

import java.util.Random;
import java.util.Scanner;

public class EXE_10_A4 {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner sc = new Scanner(System.in);

        int numero = aleatorio.nextInt(101);
        int tentativas = 0;
        int palpites = 0;

        System.out.println("Tente adivinhar o numero entre 1 e 100");

        for (tentativas = 1; tentativas < - 7; tentativas++) {
            System.out.println("Tentativa " + tentativas + ":");
            palpites = sc.nextInt();

            if (palpites == numero) {
                System.out.println("Parabéns! voce acertou em " + tentativas + " tentativas.");
                break;
            } else if (palpites < numero) {
                System.out.println("O numero é maior");
            } else {
                System.out.println("O numero é menor0");
            }
        }

        if (palpites != numero);
        System.out.println("voce nao conseguiu adivinhar o numero \nO número era " + numero);
        
    }
}
