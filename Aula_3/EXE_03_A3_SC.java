/*
3. Inversor de Palavra: Faça um programa que leia uma palavra 
e a exiba invertida. DICA:
" String invertida = new StringBuilder(palavra).reverse().toString();"
 */
package Aula_3;

import java.util.Scanner;

public class EXE_03_A3_SC {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Escreva uma palavra");
        String palavra = teclado.nextLine();
        String invertida = new StringBuilder(palavra).reverse().toString();
        
        System.out.println("a palavra "+palavra+" invertida fica "+invertida);
        
        
        
    }
    
}
