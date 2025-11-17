/*
2. Exibir elementos de uma lista de strings em letras maiúsculas
 */
package Aula_09;

import java.util.ArrayList;

public class EXE_02_FOREACH {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Marcos");
        nomes.add("Luis");
        nomes.add("Isaac");
        nomes.add("Joao");

        for (String nome : nomes) {
            System.out.println(nome.toUpperCase());
        }

    }
}
