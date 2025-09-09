/*
Exercício 2: Validação de senha
Criar um algoritmo que solicita uma senha ao usuário e verifica se ela é igual à senha correta "1234". O programa deve continuar solicitando a senha até que o usuário digite a senha correta. ## dica: não (!) e equals. ##
 */
package Aula_05;

import java.util.Scanner;

public class EXE_02_A5 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String senhaCorreta = "1234";
        String senhaDigitada;

        System.out.print("Digite a senha: ");
        senhaDigitada = scanner.nextLine();

        while (!senhaDigitada.equals(senhaCorreta)) {
            System.out.println("Senha incorreta. Tente novamente.");
            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.nextLine();
        }

        System.out.println("Senha correta.");

        scanner.close();
    }
}

    
    
    

