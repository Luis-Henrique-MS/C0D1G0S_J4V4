/*Crie uma classe ContaBancaria com os atributos numeroConta (String), saldo
(double) e titular (String). Crie os métodos depositar(double valor) e sacar(double
valor) que atualizam o saldo da conta.*/
package aula_01_exercicio02;

public class contaBancaria {

    String numeroConta, titular;
    int saldo = 10000;
    double valor;

    void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor para depósito inválido.");
        } else {
            saldo += valor;
            System.out.println("Valor Depositado com Sucesso.");
        }
    }

    void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Retirada permitida.");
        } else {
            System.out.println("Saldo insuficiente, Retiradda negada");
        }
    }

}
