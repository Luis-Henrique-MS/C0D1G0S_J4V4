/*
6. Solicitar ao usuário um caractere e um número, e exibir o caractere repetido o número de vezes especificado.
 */
package Aula_04;

import java.util.Scanner;

public class EXE_06_A4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um caractere");
        String c = teclado.nextLine();

        System.out.println("digite o numero de vezes a ser repetido");
        int n = teclado.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(c);
        }

    }
}
