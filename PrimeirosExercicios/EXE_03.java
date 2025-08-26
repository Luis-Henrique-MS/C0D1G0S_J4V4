
/*3. Dobro e Terça Parte: Escreva um algoritmo que leia um número real e calcule o dobro e
a terça parte desse número. Exiba os resultados na tela, formatando a terça parte com quatro casas decimais.*/

package PrimeirosExercicios;
import java.util.Scanner;

public class EXE_03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um número para verificar seu dobro e sua terça parte");
        double N = teclado.nextDouble();
        
        double D = (N * 2);
        System.out.println("O dobro de "+N+" é: "+D);
        
        double T = (N / 3);
        System.out.printf("A terça parte de "+N+" é: %.4f%n",T);
    }
    
}
