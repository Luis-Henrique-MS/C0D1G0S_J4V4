/*
7. Solicitar ao usuário um número inicial, um número final e um incremento, e exibir a contagem entre esses números com o incremento especificado.
 */
package Aula_04;

import java.util.Scanner;

public class EXE_07_A4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero inicial");
        int ni = teclado.nextInt();

        System.out.println("Digite um numero final");
        int nf = teclado.nextInt();

        System.out.println("Digite um numero de incremento");
        int inc = teclado.nextInt();

        if (inc == 0) {
            System.out.println("o incremento nao pode ser = 0");
        } else if (ni > nf) {
            for (int i = ni; i >= nf; i -= inc) {
                System.out.println(i);
            }
        } else if (ni < nf) {
            for (int i = ni; i <= nf; i += inc) {
                System.out.println(i);
            }
        }
    }
}
