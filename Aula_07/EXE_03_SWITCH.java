/*
Exercício 3: Sistema de Suporte Técnico
Monte um programa que apresente ao usuário um menu com os seguintes problemas comuns:
1 - Problema de internet
2 - Problema de login
3 - Erro no sistema
4 - Solicitação de atualização
Cada opção deve exibir uma mensagem de orientação ao usuário, como se fosse um chatbot de suporte.
Se a opção for inválida, exiba “Opção não reconhecida, tente novamente.”
 */
package Aula_07;

import java.util.Scanner;

public class EXE_03_SWITCH {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[1] Problema de Internet");
        System.out.println("[2] Problema de Login");
        System.out.println("[3] Erro no Sistema");
        System.out.println("[4] Solicitação de atualização");
      int opcao = sc.nextInt();
        String msn = null;

        switch (opcao) {
            case 1:
                msn = "CONEXAO PERDIDA";
                break;
            case 2:
                msn = "USUARIO OU SENHA INCORRETOS";
                break;
            case 3:
                msn = "VOCE NAO ESTÀ CONECTADO NO BANCO DE DADOS";
                break;
            case 4:
                msn = "POR FAVOR ATUALIZE O SISTEMA PARA A VERSAO MAIS RECENTE";
                break;
        }

        System.out.println("==============================");
        System.out.println(msn);
        System.out.println("==============================");
    }

    }


