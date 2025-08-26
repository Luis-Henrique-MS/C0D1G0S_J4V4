
/*4. Conversor de Medidas: Crie um programa que leia uma distância em metros e exiba essa distância convertida em quilômetros e centímetros.*/

package PrimeirosExercicios;
import java.util.Scanner;

public class EXE_04 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite uma distância a ser calculada");
        double NumMetro = teclado.nextDouble();
        
        double km = (NumMetro / 1000);
        double cm = (NumMetro * 100);
        
        System.out.println(NumMetro+" metros em quilômetros é: "+km+" e em centímetros é: "+cm);
        
        
        
    }
    
}
