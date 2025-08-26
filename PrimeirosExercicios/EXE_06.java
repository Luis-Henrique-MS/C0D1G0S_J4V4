
/*6. Pintando a Parede: Sua mãe decidiu pintar uma parede do seu quarto e 
precisa calcular a quantidade de tinta necessária. Sabendo que cada litro de tinta pinta 2 metros quadrados, crie
um programa que pergunte a altura e largura da parede, calcule a área e exiba quantos litros de tinta serão necessários.
 */
package PrimeirosExercicios;

import java.util.Scanner;

public class EXE_06 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual a largura da parede?");
        double l = teclado.nextDouble();
        System.out.println("Qual a altura da parede?");
        double a = teclado.nextDouble();

        double area = a * l;
        
        double litroT = area / 2;
        
        System.out.println("Serão necessários "+litroT+" litros");

    }
}
