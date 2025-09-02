/*
4. Verificador de Vogais: Crie um programa que leia uma palavra e informe se ela contém pelo menos uma vogal (a, e, i, o, u). 
VAMOS FAZER JUNTO!!

 */
package Aula_3;

import java.util.Scanner;

public class EXE_04_A3_SC {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escreva uma palavra");
        String palavra = teclado.nextLine();

        boolean temVogal = false;

        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                temVogal = true;
                break;
            }
        }

        if (temVogal) {
            System.out.println(" A palavra contém pelo menos uma vogal");
        } else {
            System.out.println("A palavra não contém nenhuma vogal");
        }
        
    }

}
