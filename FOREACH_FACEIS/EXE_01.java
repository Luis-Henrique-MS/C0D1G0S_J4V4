/*
  1. Somados elementos de um array de inteiros
 */
package FOREACH_FACEIS;

public class EXE_01 {

    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};

        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        System.out.println("A soma dos elementos é: " + soma);
    }
}
