/*
 5. Crie um método que receba uma string e retorne o número de vogais presentes
 nessa string.
 */
package Aula_12;

import java.util.Scanner;

public class metodo_EXE_05 {

    public static int contarVogais(String texto) {
        int contador = 0;
        String vogais = "aeiouAEIOU";

        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);
            if (vogais.indexOf(caractere) != -1) {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase ou palavra: ");
        String entrada = scanner.nextLine();

        int quantidadeVogais = contarVogais(entrada);
        System.out.println("Número de vogais: " + quantidadeVogais);

        scanner.close();
    }
}

