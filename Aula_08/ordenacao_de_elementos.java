/*

 */
package Aula_08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class ordenacao_de_elementos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        Random rd = new Random();
        System.out.println("Digite 10 números inteiros: ");
        for (int i = 0; i < 10; i++) {
           // System.out.println("Número " + (i + 1) + " :");
           int numeroAl = rd.nextInt(101);
           numeros.add(numeroAl);
           System.out.println("Número " + (i + 1) + " :"+numeroAl);
        }
        Collections.sort(numeros);

        System.out.println("Números ordenados " + numeros);

    }

}


