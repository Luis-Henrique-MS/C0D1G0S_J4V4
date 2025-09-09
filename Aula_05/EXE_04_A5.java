/*
Exercício 4:  Calculadora de fatorial
Criar um algoritmo que calcula o fatorial de um número inteiro não negativo informado pelo usuário. O programa deve validar se o número digitado é não negativo. ## dica: fatorial *= contador; ##
 */
package Aula_05;

import java.util.Scanner;

public class EXE_04_A5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        // Solicita o número ao usuário
        System.out.print("Digite um número inteiro não negativo para calcular o fatorial: ");
        numero = scanner.nextInt();

        // Validação da entrada
        if (numero < 0) {
            System.out.println("Número inválido! Por favor, digite um número não negativo.");
        } else {
            long fatorial = 1; // Usamos long para evitar overflow em números maiores
            for (int i = 1; i <= numero; i++) {
                fatorial *= i; // Multiplica acumulando o valor do fatorial
            }
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }

        scanner.close();
    }
}

    
    
    

