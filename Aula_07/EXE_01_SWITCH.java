/*
Exercício 1: Sistema de Login por Perfil de Usuário
Crie um programa que peça ao usuário o tipo de perfil de login:

1 → Administrador
2 → Editor
3 → Visitante

Use switch-case para exibir as permissões de cada perfil:

Administrador: pode criar, editar e excluir.
Editor: pode criar e editar.
Visitante: apenas visualizar.

Se for digitada uma opção inválida, mostre mensagem de erro.
 */
package Aula_07;

import java.util.Scanner;

public class EXE_01_SWITCH {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===========================");
        System.out.println("       LOGIN DE USER       ");
        System.out.println("===========================");
        System.out.println("");
        System.out.println("");
        System.out.println("-----------------");
        System.out.println("[1] Administrador");
        System.out.println("-----------------");
        System.out.println("");
        System.out.println("-----------------");
        System.out.println("[2] Editor");
        System.out.println("-----------------");
        System.out.println("");
        System.out.println("-----------------");
        System.out.println("[3] Visitante");
        System.out.println("-----------------");
        System.out.println("");
        System.out.println("");
        System.out.println("===========================");
        int opcao = sc.nextInt();
        //String msn = null;

        switch (opcao) {
            case 1:
                System.out.println("===========================");
                System.out.println("       LOGIN DE ADM        ");
                System.out.println("===========================");
                System.out.println("");
                System.out.println("");
                System.out.print("USUÁRIO: ");
                String user = sc.next();
                System.out.print("SENHA: ");
                String senha = sc.next();
                System.out.println("");
                System.out.println("");
                System.out.println("===========================");
                break;

            case 2:
                System.out.println("==============================");
                System.out.println("       LOGIN DE EDITOR        ");
                System.out.println("==============================");
                System.out.println("");
                System.out.println("");
                System.out.println("EDIÇÃO ATIVA");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("==============================");
                break;

            case 3:
                System.out.println("=================================");
                System.out.println("       LOGIN DE VISITANTE        ");
                System.out.println("=================================");
                System.out.println("");
                System.out.println("");
                System.out.print("USUÁRIO: ");
                user = sc.next();
                System.out.print("SENHA: ");
                senha = sc.next();
                System.out.println("");
                System.out.println("");
                System.out.println("=================================");
                break;

        }
    }
}
