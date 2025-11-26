
/*Crie uma classe Carro com os atributos marca (String), modelo (String), ano (int) e
ligado (boolean). Crie os métodos ligar() e desligar() que alteram o estado do carro.*/
package aula_01_exercicio03;

public class main {

    public static void main(String[] args) {

        carro carro1 = new carro();
        carro1.marca = "Mitsubishi";
        carro1.modelo = "Lancer EVO";
        carro1.ano = 2015;

        carro1.ligar();
        carro1.desligar();
    }

}
