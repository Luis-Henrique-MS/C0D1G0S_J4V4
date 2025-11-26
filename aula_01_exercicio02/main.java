/*Crie uma classe ContaBancaria com os atributos numeroConta (String), saldo
(double) e titular (String). Crie os métodos depositar(double valor) e sacar(double
valor) que atualizam o saldo da conta.*/
package aula_01_exercicio02;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        int escolha;

        Scanner sc = new Scanner(System.in);

        contaBancaria contaBancaria1 = new contaBancaria();

        System.out.println("Digite o número da sua conta: ");
        contaBancaria1.numeroConta = sc.nextLine();

        System.out.println("Digite o nome do titular: ");
        contaBancaria1.titular = sc.nextLine();

        System.out.println("O seu saldo atual é de: " + contaBancaria1.saldo);
        System.out.println("você deseja Sacar [1] ou Depositar [2]");
        escolha = sc.nextInt();

        switch (escolha) {

            case 1:
                System.out.println("Qual valor você deseja sacar? saldo:" + contaBancaria1.saldo);
                contaBancaria1.valor = sc.nextDouble();
                contaBancaria1.sacar(contaBancaria1.valor);
                System.out.println(contaBancaria1.saldo);
                break;
            case 2:
                System.out.println("Qual valor você deseja depositar?");
                contaBancaria1.valor = sc.nextDouble();
                contaBancaria1.depositar(contaBancaria1.valor);
                System.out.println(contaBancaria1.saldo);
                break;

            default:
                System.out.println("Informação inválida");
                break;
        }

    }
}
