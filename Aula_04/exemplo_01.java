/*
contador 1 a 10
 */
package Aula_04;

import java.util.Scanner;

public class exemplo_01 {
    public static void main(String[] args) {
 //       for (int i = 10; i >= 1; i-=3) {
  //          System.out.println(i);
    
    
    
    //Ler 5 valores digitados pelo usuario e exibe a soma total
    
    
    Scanner sc = new Scanner(System.in);
    
    int soma = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite um valor: ");
            int v = sc.nextInt();
            soma += v;
        }
        System.out.println("A soma dos valores é "+soma);
    
        }
    }
    

