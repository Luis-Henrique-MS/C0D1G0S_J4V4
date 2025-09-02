/*
10. Verificador de E-mail: Crie um programa que leia um e-mail
e verifique se ele contém "@" e termina com ".com". 
DICA:  if (email.contains("@") && email.endsWith(".com")) {

 */
package Aula_3;

import java.util.Scanner;

public class EXE_10_A3_SC {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite seu email: ");
        String email = teclado.nextLine();
        
         if (email.contains("@") && email.endsWith(".com")) {
             System.out.println("EMAIL VALIDO");
         }else{
             System.out.println("EMAIL INVÀLIDO TENTE NOVAMENTE");
         }
    }
}
