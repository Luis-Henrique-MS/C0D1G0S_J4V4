/*
 5. Exibir elementos de um HashSet de strings
 */
package FOREACH_FACEIS;

import java.util.HashSet;

public class EXE_05 {

    public static void main(String[] args) {
        HashSet<String> frutas = new HashSet<>();

        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Uva");
        frutas.add("Abacaxi");

        System.out.println("Frutas :");
        for (String fruta : frutas) {
            System.out.println(fruta);

        }
    }
}
