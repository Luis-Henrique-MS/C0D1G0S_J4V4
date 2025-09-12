/*
Exercício 3*: Contagem regressiva com pausa
Criar um algoritmo que faça uma contagem regressiva de 10 a 1, com um intervalo de 1 segundo entre cada número.
 */
package Aula_05;

import java.util.Scanner;

public class EXE_03_DOWHILE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i = 10;
        
        do {
            try {
            Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("A thread foi interrompida!");
            }
            System.out.println(i);
            i--;
        }while (i != 0);
        
        
    }
    
}
