

/* 1. Salário do Funcionário: Crie um programa que pergunte o nome de
um funcionário e seu salário. Em seguida, exiba uma mensagem personalizada 
mostrando o nome do funcionário e seu respectivo salário.*/

package PrimeirosExercicios;
import java.util.Scanner;

public class EXE_01 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        System.out.println("Qual é o nome do funcionário? ");
        String nome = teclado.nextLine();
        
        System.out.println("Qual é o seu salário");
        double sal = teclado.nextDouble();
        
        System.out.println("Seu nome é "+nome+" e seu salário é R$:"+sal);
        
        
        
        
        
        
        
    }
}
