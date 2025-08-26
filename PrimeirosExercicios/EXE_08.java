/* 8. Desconto no Produto: Uma loja está oferecendo 5% de desconto em todos os seus produtos. 
Crie um programa que pergunte o valor de um produto e calcule o novo valor com o desconto aplicado. 
Exiba o resultado formatado com duas casas decimais
 */
package PrimeirosExercicios;

import java.util.Scanner;

public class EXE_08 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual o valor do produto?");
        double valor = teclado.nextDouble();

        System.out.println("Quantos % de desconto?");
        double desconto = teclado.nextDouble();

        if (desconto == 5) {
            desconto = valor * 0.05;
            System.out.println("O desconto do produto foi de " +desconto);
        } else if (desconto != 5){
            System.out.println("DESCONTO NAO ENCONTRADO");
        }

        
        
    }

}
