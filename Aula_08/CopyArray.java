package Aula_08;

import java.util.ArrayList;
import java.util.Scanner;

public class CopyArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> animais = new ArrayList<>();

        System.out.println("Digite 4 nomes de animais");
        for (int i = 0; i < 4; i++) {
            System.out.println("Animal " + (i + 1) + " :");
            String animal = sc.nextLine();
            animais.add(animal);
        }

        ArrayList<String> copiaAnimais = new ArrayList<>(animais);
        System.out.println("Novo ArrayList de animais " + copiaAnimais);
    }
}
