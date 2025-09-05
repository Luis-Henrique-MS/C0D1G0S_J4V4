/*
5. Calcular a média de 5 números informados pelo usuário.
 */
package Aula_04;

import java.util.Scanner;

public class EXE_05_A4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double soma = 0;
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("digite um número: ");
            double num = teclado.nextInt();
                
            soma += num;
        }

        double media = soma / 5;
        System.out.println(" a média é "+media);
        
    }

}
