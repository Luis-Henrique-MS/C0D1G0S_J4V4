/*
Exercício 3: Tabuada de um número
Criar um algoritmo que exibe a tabuada de um número inteiro positivo informado pelo usuário. O programa deve validar se o número digitado é positivo antes de exibir a tabuada. 
 */
package Aula_05;

import java.util.Scanner;

public class EXE_03_A5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        // Solicita um número positivo
        System.out.print("Digite um número inteiro ");
        numero = scanner.nextInt();

        // Validação do número
        if (numero <= 0) {
            System.out.println("Número inválido digite um número inteiro positivo.");
        } else {
            System.out.println("Tabuada do " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }

        scanner.close();
    }
}

    
    
    

