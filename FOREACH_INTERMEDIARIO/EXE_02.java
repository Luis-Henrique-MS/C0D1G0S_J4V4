/*
 2. Contar quantos nomes em um ArrayList começam com a letra 'A'
 */
package FOREACH_INTERMEDIARIO;

import java.util.ArrayList;

public class EXE_02 {

    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Luis");
        nomes.add("Douglas");
        nomes.add("Amanda");
        nomes.add("Carlos");
        nomes.add("Atreus");

        int contador = 0;

        for (String nome : nomes) {
            if (nome.startsWith("A")) {
                contador++;
            }
        }
        System.out.println(nomes);
        System.out.println("Total de nomes que começam com a letra A: " + contador);
    }
}
