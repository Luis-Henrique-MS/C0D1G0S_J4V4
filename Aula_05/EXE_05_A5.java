/*
Exercício 5: Jogo de par ou ímpar
Criar um jogo de par ou ímpar contra o computador. O usuário escolhe entre par ou ímpar e digita um número de 0 a 5. O computador gera um número aleatório de 0 a 5, e o programa verifica quem ganhou a rodada. O jogo continua até que o usuário digite "sair" para encerrar.
 */
package Aula_05;

import java.util.Random;
import java.util.Scanner;

public class EXE_05_A5 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String escolhaUsuario;
        
        System.out.println("Bem-vindo ao jogo de Par ou Ímpar!");
        System.out.println("Digite 'par' ou 'ímpar' para jogar, ou 'sair' para encerrar.");

        while (true) {
            System.out.print("\nSua escolha (par/ímpar/sair): ");
            escolhaUsuario = scanner.nextLine().toLowerCase();

            if (escolhaUsuario.equals("sair")) {
                System.out.println("Jogo encerrado. Obrigado por jogar!");
                break;
            }

            if (!escolhaUsuario.equals("par") && !escolhaUsuario.equals("ímpar")) {
                System.out.println("Escolha inválida! Tente novamente.");
                continue;
            }

            System.out.print("Digite um número de 0 a 5: ");
            int numeroUsuario;
            try {
                numeroUsuario = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número inteiro de 0 a 5.");
                continue;
            }

            if (numeroUsuario < 0 || numeroUsuario > 5) {
                System.out.println("Número invalido, Digite entre 0 e 5.");
                continue;
            }

            int numeroComputador = random.nextInt(6); // número aleatório de 0 a 5
            int soma = numeroUsuario + numeroComputador;
            boolean resultadoPar = soma % 2 == 0;

            System.out.println("Você jogou: " + numeroUsuario);
            System.out.println("eu joguei: " + numeroComputador);
            System.out.println("Soma: " + soma + " → " + (resultadoPar ? "Par" : "Ímpar"));

            if ((resultadoPar && escolhaUsuario.equals("par")) || (!resultadoPar && escolhaUsuario.equals("ímpar"))) {
                System.out.println("Eu perdi, você venceu!");
            } else {
                System.out.println(" eu venci!! ");
            }
        }

        scanner.close();
    }
}

    
    
    

