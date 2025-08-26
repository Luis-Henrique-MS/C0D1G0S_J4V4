
/* 9. Aluguel de Carros: Uma locadora de carros cobra R$ 90 por dia de aluguel e R$ 0,20 por
quilômetro rodado. Crie um programa que pergunte quantos quilômetros foram percorridos e por 
quantos dias o carro foi alugado. Calcule o preço total do aluguel e exiba o resultado na tela.
*/

package PrimeirosExercicios;

import java.util.Scanner;

public class EXE_09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Quantos KM foram percorridos? ");
        double KM = teclado.nextDouble();
        
        System.out.println("Quantos dias o carro foi alugado? ");
        int dias = teclado.nextInt();
        
       KM = KM * 0.20;
       dias = dias * 90;
       
       double total = KM + dias;
       
        System.out.println("O total foi: "+ total);
        
        
    }

    
}
