/*
 4. Crie um método que converta uma temperatura em graus Celsius para
 Fahrenheit. Utilize a fórmula F = (C * 9/5) + 32
 */
package Aula_12;

import java.util.Scanner;

public class metodo_EXE_04 {

        public static double Fahrenheit(double celsius) {
            return (celsius * 9 / 5) + 32;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite a temperatura em graus Celsius: ");
            double celsius = scanner.nextDouble();

            double fahrenheit = Fahrenheit(celsius);
            System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);

            scanner.close();
        }
    }

