/*
 3. Crie um método que receba um número inteiro positivo e retorne o fatorial
 desse número. O fatorial de um número n é o produto de todos os números
 inteiros positivos menores ou iguais a n.
 */
package Aula_12;

import java.util.Scanner;

public class metodo_EXE_03 {

    public static long calculoFat(int numero) {
        long fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        return fatorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Número inválido! Tente Novamente com um número inteiro positivo.");
        } else {
            long resultado = calculoFat(numero);
            System.out.println("O fatorial de " + numero + " é: " + resultado);
        }

        scanner.close();
    }
}
