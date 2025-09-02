/*
8. Substituidor de Texto: Crie um programa que leia uma frase e 
substitua todas as ocorrências da palavra "Java" por "Programação".
DICA: "String novaFrase = frase.replace("Java", "Programação");"
 */
package Aula_3;

import java.util.Scanner;

public class EXE_08_A3_SC {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("escreva uma frase que contenha a palavra Java");
        String frase = teclado.nextLine();
        
        String novaFrase = frase.replace("Java", "Programação");
        
        System.out.println(novaFrase);
        
        
        
        
    }
}
