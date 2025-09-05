/*
1. Exibir a tabuada completa de 1 a 10.
 */
package Aula_04;

import java.util.Scanner;

public class EXE_01_A4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a tabuada desejada");
        int numero = teclado.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            //int result = numero * 1;
            System.out.println (+numero+" x "+i+" = "+(numero * i));
            
        }
        
        
        
        
        
        
        
    }
}
