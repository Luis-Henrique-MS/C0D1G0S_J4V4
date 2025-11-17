/*
3. Verificar Contém:
Crie um ArrayList de strings, adicione três cores ("Vermelho", "Verde", "Azul"), verifique se a cor "Amarelo" está na lista e imprima o resultado.
 */
package Aula_08;

import java.util.ArrayList;
import java.util.Scanner;

public class EXE_03_ARRAY {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> cores = new ArrayList<>();

        System.out.println("Digite 3 cores: ");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1)+"ª cor: ");
            String cor = sc.nextLine();
            cores.add(cor);
        }

        
        
        
    }
}
