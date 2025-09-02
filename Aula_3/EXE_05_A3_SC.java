/*
5. Classificador de Login: Faça um programa que leia um login e informe 
se ele é "válido" (contém pelo menos 6 caracteres e não tem espaços) ou "inválido". 
DICA: "if (login.length() >= 6 && !login.contains(" ")) {"
 */
package Aula_3;

import java.util.Scanner;


public class EXE_05_A3_SC {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite seu login: ");
        String log = teclado.nextLine();
        System.out.println("Digite sua senha: ");
        String senha = teclado.nextLine();
        
        if (senha.length() >= 6 && !senha.contains("tralalero")) {
            System.out.println("BEM-VINDO "+log);
        }else{
            System.out.println("SENHA INCORRETA");
        }
    }
}
