/*
Exercício 4: Menu de Controle de Dispositivos Inteligentes
Crie um programa que exiba um menu para controlar dispositivos de uma casa inteligente:
1 - Acender luzes
2 - Apagar luzes
3 - Ligar TV
4 - Desligar TV
5 - Abrir portão
6 - Fechar portão
 */
package Aula_07;

import java.util.Scanner;

public class EXE_04_SWITCH {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[1] Ligar as Luzes");
        System.out.println("[2] Apagar as Luzes");
        System.out.println("[3] Ligar TV");
        System.out.println("[4] Desligar TV");
        System.out.println("[5] Abrir Portão");
        System.out.println("[6] Fechar Portão");
        int opcao = sc.nextInt();
        String msn = null;

        switch (opcao) {
            case 1:
                msn = "LIGANDO AS LUZES";
                break;
            case 2:
                msn = "APANGANDO LAS LUCES";
                break;
            case 3:
                msn = "LIGANDO A TV";
                break;
            case 4:
                msn = "DESLIGANDO A TV";
                break;
            case 5:
                msn = "ABRINDO O PORTÃO";
                break;
            case 6:
                msn = "FECHANDO O PORTÃO";
                break;

        }

        System.out.println("==============================");
        System.out.println(msn);
        System.out.println("==============================");
    }
}