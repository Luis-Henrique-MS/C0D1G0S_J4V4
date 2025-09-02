/*
2. Saudação Personalizada: Crie um programa que pergunte o nome e o turno 
em que a pessoa estuda (Manhã, Tarde ou Noite) e exiba uma saudação personalizada. DICA: 
"if (turno.equalsIgnoreCase("
 */
package Aula_3;

import java.util.Scanner;

public class EXE_02_A3_SC {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual turno você estuda?");
        String turno = teclado.nextLine();
        
        if (turno.equalsIgnoreCase("manha")){
            System.out.println("Bem vindo aluno do turno manhã");
        }else if (turno.equalsIgnoreCase("tarde")){
            System.out.println("Bem vindo aluno do turno tarde");
        }else if (turno.equalsIgnoreCase("noite")){;
            System.out.println("Bem vindo aluno do turno noite");
    }
        
        
                
        
        
        
        
        
    }
}
