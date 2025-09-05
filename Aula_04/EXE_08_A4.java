/*
8. Solicitar ao usuário a idade de 5 pessoas e calcular a média das idades.
 */
package Aula_04;

import java.util.Scanner;

public class EXE_08_A4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
         double soma = 0;
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("digite a idade de 5 pessoas: ");
            double num = teclado.nextInt();
                
            soma += num;
        }

        double media = soma / 5;
        System.out.println(" a média é "+media);
        
        
        
    }
}
