package Aula_05;

import java.util.Scanner;

public class DOWHILE_demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        String resp;

        do {
            System.out.println("Digite um valor para ser somado: ");
            int num = sc.nextInt();
            soma += num;
            System.out.println("Voce deseja continuar? S/N");
            resp = sc.next().toLowerCase();

            while (!resp.equals("s") && !resp.equals("n")) {
                System.out.println("Resposta inválida. Digite S/N");
                resp = sc.next().toLowerCase();
            }
        } while (resp.equals("s"));
        System.out.println("A soma de todos os valores é: " + soma);

    }
}
