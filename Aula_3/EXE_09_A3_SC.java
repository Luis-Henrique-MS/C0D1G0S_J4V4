/*
9. Contador de Palavras: Faça um programa que leia
uma frase e informe quantas palavras ela contém 
(palavras separadas por espaço). 
VAMOS FAZER JUNTOS!
 */
package Aula_3;

import java.util.Scanner;

public class EXE_09_A3_SC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Digite uma frase");
        String frase = sc.nextLine().trim();
        
        if (frase.isEmpty()) {
            System.out.println("A frase está vazia");
        }else{
            String[]palavra = frase.split("\\s+");
            System.out.println("Número de palavras "+palavra.length);
        }
    }
}
