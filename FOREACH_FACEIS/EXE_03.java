/*
 3. Encontrar o maior número em um array de inteiros
 */
package FOREACH_FACEIS;

public class EXE_03 {

    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};

        int maior = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        
        System.out.println(maior);
    }
}
