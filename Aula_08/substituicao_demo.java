/*

 */
package Aula_08;

import java.util.ArrayList;
import java.util.Scanner;

public class substituicao_demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<String> frutas = new ArrayList<>();
        
        System.out.println("Digite 5 nomes de frutas");
        for (int i = 0; i < 5; i++) {
            System.out.println("Fruta "+(i+1)+" :");
            String fruta = sc.nextLine();
            frutas.add(fruta);
        }
        
        System.out.println("Digite a nova fruta para substituir a 3ª fruta");
        String novaFruta = sc.nextLine();
        frutas.set(2, novaFruta);
        
        System.out.println("Lista de frutas após a substituição "+frutas);
        
        }
    }

