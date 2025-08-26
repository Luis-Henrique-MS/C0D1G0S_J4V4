
/*2. Antecessor e Sucessor: Faça um programa que leia um número inteiro e mostre na tela o seu antecessor e sucessor.*/

package PrimeirosExercicios;
import java.util.Scanner;

public class EXE_02 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int numero = teclado.nextInt();
        
        int antecessor = (numero - 1);
        int sucessor = (numero + 1);
        
        System.out.println("O numero antecessor ao "+numero+" e: "+antecessor+" e seu sucessor e: "+sucessor);
        
        
    }
    
       
        
}
