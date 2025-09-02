/*
6. Comparador de Palavras: Crie um programa que leia duas palavras e informe se elas são iguais (ignorando maiúsculas/minúsculas).
DICA: " if (palavra1.equalsIgnoreCase(palavra2)) {"
 */
package Aula_3;

import java.util.Scanner;

public class EXE_06_A3_SC {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite uma palavra");
        String palavra1 = teclado.nextLine();
        System.out.println("Digite outra palavra para comparar");
        String palavra2 = teclado.nextLine();
        
        if (palavra1.equalsIgnoreCase(palavra2)) {
            System.out.println("as palavras são iguais");
        }else{
            System.out.println("as palavras comparadas nao sao iguais");
        }
        
        
    }
}
