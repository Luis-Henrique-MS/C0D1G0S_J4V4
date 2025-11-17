/*
2. Acessar Elementos por Índice:
Crie um ArrayList de doubles, adicione cinco números decimais, acesse e imprima o terceiro elemento da lista.
 */
package Aula_08;

import java.util.ArrayList;
import java.util.Scanner;

public class EXE_02_ARRAY {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();

        System.out.println("Digite 5 numeros decimais");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1)+"º número: ");
            Double numDecimal = sc.nextDouble();
            numeros.add(numDecimal);
        }

        Double terceiroNum = numeros.get(2);
        System.out.println(terceiroNum);
        
    }
}
