/*
 4. Calcular e exibir a média de notas de um array de doubles
 */
package FOREACH_FACEIS;

public class EXE_04 {

    public static void main(String[] args) {
        double[] notas = {7.5, 3,4, 7, 2.5, 10.0};

        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        double media = soma / notas.length;

        System.out.printf("A média das notas é: %.2f\n", media);
    }
}
