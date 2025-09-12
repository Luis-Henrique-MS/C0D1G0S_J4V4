/*
Exercício 1: Soma de números até o usuário digitar 0
Criar um algoritmo que leia vários números inteiros e calcule a soma deles, parando quando o usuário digitar o número 0.
 */
package Aula_05;

import java.util.Scanner;

public class EXE_01_DOWHILE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int resp;

        do {
            System.out.println("Digite um valor para ser somado: ");
            int num = sc.nextInt();
            soma += num;
            System.out.println("Voce deseja continuar? [1]para Sim / [0]para Não");
            resp = sc.nextInt();
        } while (resp != 0);

        System.out.println("O valor da soma dos números é: "+soma);
        
    }
}
