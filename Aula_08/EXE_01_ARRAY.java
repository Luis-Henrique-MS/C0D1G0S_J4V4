/*
1. Adicionar e Imprimir Elementos:
Crie um ArrayList de strings, adicione cinco nomes de cidades, imprima todas as cidades na lista.
 */
package Aula_08;

import java.util.ArrayList;
import java.util.Scanner;

public class EXE_01_ARRAY {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> city = new ArrayList<>();

        System.out.println("Digite 5 nomes de cidades");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + "ª cidade: ");
            String cidades = sc.nextLine();
            city.add(cidades);
        }
        System.out.println(city);

    }

}
