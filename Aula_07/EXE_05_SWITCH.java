/*
Exercício 5: Sistema de Navegação em Aplicativo
Implemente um programa que simule a navegação entre páginas de um aplicativo:
1 - Página inicial
2 - Perfil
3 - Configurações
4 - Notificações
5 - Sair
 */
package Aula_07;

import java.util.Scanner;

public class EXE_05_SWITCH {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);

        System.out.println("[1] Página Inicial");
        System.out.println("[2] Perfil");
        System.out.println("[3] Configurações");
        System.out.println("[4] Notificações");
        System.out.println("[5] Sair");
        int opcao = sc.nextInt();
        String msn = null;

        switch (opcao) {
            case 1:
                System.out.println("Voce está na pagina inicial"); 
                msn = "aqui voce pode navegar entre os menus";
                break;
            case 2:
                System.out.println("Voce está na pagina de Perfil");
                msn = "Editar perfil?";
                break;
            case 3:
                System.out.println("Voce está na pagina de Configurações");
                msn = "Ajustar configurações automaticas?";
                break;
            case 4:
                System.out.println("Voce está na pagina de notificações");
                msn = "Silenciar?";
                break;
            case 5:
                System.out.println("Voce decidiu sair, fechando programa");
                break;

        }

        System.out.println("==============================");
        System.out.println(msn);
        System.out.println("==============================");
    }
    
}
