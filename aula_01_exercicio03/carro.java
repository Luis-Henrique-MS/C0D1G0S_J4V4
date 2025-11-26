
/*Crie uma classe Carro com os atributos marca (String), modelo (String), ano (int) e
ligado (boolean). Crie os métodos ligar() e desligar() que alteram o estado do carro.*/
package aula_01_exercicio03;

public class carro {

    String marca;
    String modelo;
    int ano;
    Boolean ligado = false;

    void ligar() {
        if (ligado == false) {
            ligado = true;
            System.out.println("Ligando o veiculo "+modelo+ " do ano "+ano+ " marca " +marca);
        } else {
            System.out.println("O veiculo já está ligado");
        }
    }

    void desligar() {
        if (ligado == true) {
            ligado = false;
            System.out.println("Veiculo "+modelo+" desligado");
        } else {
            System.out.println("o carro já está desligado");
        }
    }
}