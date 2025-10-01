/*
 1. Crie um método que receba dois números inteiros como parâmetros e retorne a
 soma deles. Implemente um programa que utilize este método para somar dois
 números fornecidos pelo usuário.
 */
package Aula_12;

import java.util.Scanner;

public class metodo_EXE_01 {

    public static int somar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        int resultado = somar(numero1, numero2);

        System.out.println("A soma dos dois números é: " + resultado);

        scanner.close();
    }
}

