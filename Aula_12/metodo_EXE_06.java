/*
 6. Crie um método que receba uma string e retorne true se ela for um palíndromo
 (ou seja, se a string for igual quando lida de trás para frente) e false caso
 contrário.
 */
package Aula_12;

import java.util.Scanner;

public class metodo_EXE_06 {

    public static boolean ePalindromo(String texto) {
        texto = texto.replaceAll("\\s+", "").toLowerCase();

        int inicio = 0;
        int fim = texto.length() - 1;

        while (inicio < fim) {
            if (texto.charAt(inicio) != texto.charAt(fim)) {
                return false;
            }
            inicio++;
            fim--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String entrada = scanner.nextLine();

        if (ePalindromo(entrada)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }

        scanner.close();
    }
}

