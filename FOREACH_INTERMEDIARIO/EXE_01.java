/*
 1. Contar quantos elementos de um array de inteiros são maiores que 10
 */
package FOREACH_INTERMEDIARIO;

public class EXE_01 {

    public static void main(String[] args) {
        int[] numeros = {5, 12, 7, 1, 3, 13, 202};

        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 10) {
                contador++;
            }
        }

        System.out.println("Os números maiores que 10 são: " + contador);
    }
}
