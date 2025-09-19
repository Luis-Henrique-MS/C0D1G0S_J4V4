/*
  2. Exibir elementos de uma lista de strings em letras maiúsculas
 */
package FOREACH_FACEIS;

import java.util.Arrays;
import java.util.List;

public class EXE_02 {

    public static void main(String[] args) {

            List<String> nomes = Arrays.asList ("isaac", "marcos", "joao", "douglas");

            System.out.println("Nomes com letras maiúsculas:");
            for (String nome : nomes) {
                System.out.println(nome.toUpperCase());
            }
        }
    
}
