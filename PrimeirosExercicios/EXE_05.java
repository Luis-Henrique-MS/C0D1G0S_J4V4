/*5. Conversor de Moedas: Imagine que você está indo viajar para os Estados Unidos
e precisa converter seus reais em dólares. Crie um programa que pergunte quantos reais
você tem na carteira e mostre quantos dólares você poderá comprar, considerando a cotação
do dólar a R$ 5,45. Formate a saída para mostrar o valor em dólares com duas casas decimais.
 */

package PrimeirosExercicios;

import java.util.Scanner;

public class EXE_05 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double cotacao = 5.45;
        System.out.println("Quantos PILA tu tem no bolso?");
        double Reais = teclado.nextDouble();

        double dolar = Reais / cotacao;

        System.out.printf("Você terá %.2f%n",dolar," dólares");

    }

}
