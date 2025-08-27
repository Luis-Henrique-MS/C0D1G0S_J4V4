
/* 10. Salário do Cupincha: O Cupincha, mascote do nosso time, precisa calcular 
seu novo salário! Ele ganha R$ 25 por hora e trabalha 8 horas por dia. Crie um programa
que pergunte quantos dias ele trabalhou e calcule seu novo salário.
 */
package PrimeirosExercicios;

import java.util.Scanner;

public class EXE_10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantos dias nosso mascote cupincha trabalhou?");
        int dias = teclado.nextInt();

        double hora = 25;
        
        double novoSalario = dias * hora;
        
        System.out.println("O salario do cupincha de "+dias+" dias é de: R$:"+novoSalario);
        
    }
}
