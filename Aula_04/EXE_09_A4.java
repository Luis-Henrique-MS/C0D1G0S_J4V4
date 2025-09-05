/*
9. Solicitar ao usuário 7 números e identificar o maior e o menor valor digitados.
 */
package Aula_04;

import java.util.Scanner;

public class EXE_09_A4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("digite o numero 1:");
        double numero = teclado.nextDouble();
        double maior = numero;
        double menor = numero;

        for (int i = 2; i <= 7; i++) {
            System.out.println("Digite o numero " + i + ": ");
            numero = teclado.nextDouble();

            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }

        }
        System.out.println("O maior numero é " + maior);
        System.out.println("O menor numero é " + menor);
    }
}


