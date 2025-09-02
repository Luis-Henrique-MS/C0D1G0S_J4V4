/*1. Verificador de Nome: Faça um programa que leia o
nome de uma pessoa e verifique se ele contém mais de 5
caracteres. Mostre uma mensagem apropriada. DICA: 
"if (nome.length() > 5)"
 */
package Aula_3;

import java.util.Scanner;

public class EXE_01_A3_SC {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual é o seu nome? ");
        String nome = teclado.nextLine();

        if (nome.length() > 5) {
            System.out.println("Seu nome possui mais de 5 caracteres");
        } else {
            System.out.println("Seu nome possui menos de 5 caracteres");
        }
    }
}