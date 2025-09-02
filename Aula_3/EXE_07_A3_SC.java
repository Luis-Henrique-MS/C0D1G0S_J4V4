/*
7. Verificador de Dia da Semana
Enunciado: Faça um programa que leia um dia da semana (ex.: "segunda") e informe se é um dia útil ou de fim de semana.
DICA: "if (dia.equals("segunda") ||"
 */
package Aula_3;

import java.util.Scanner;

public class EXE_07_A3_SC {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual dia é hoje? ");
        String dia = teclado.nextLine();
        
        if ((dia.equalsIgnoreCase("segunda")) || (dia.equalsIgnoreCase("terça")) || (dia.equalsIgnoreCase("quarta")) || (dia.equalsIgnoreCase("quinta")) || (dia.equalsIgnoreCase("sexta"))) {
            System.out.println("Hoje é um dia util");
        }else if ((dia.equalsIgnoreCase ("sabado")) || (dia.equalsIgnoreCase("domingo"))){
            System.out.println("Hoje é fim de semana");
        }else{
            System.out.println("Digite um dia da semana valido panaca");
        }
        
        
        
        
        
    }
}
