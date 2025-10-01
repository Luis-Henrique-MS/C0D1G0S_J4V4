/*
 2. Crie um método que receba um número inteiro e retorne true se o número for
 par e false se for ímpar. Utilize este método em um programa que verifique a
 paridade de um número fornecido pelo usuário.
 */
package Aula_12;

import java.util.Scanner;

public class metodo_EXE_02 {

    public static boolean Par(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (Par(numero)) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }

        scanner.close();
    }
}

