/*
Exercício 2: Média de notas com validação
Criar um algoritmo que leia 4 notas de um aluno, validando se as notas estão entre 0 e 10. Calcular e exibir a média das notas.
 */
package Aula_05;

import java.util.Scanner;

public class EXE_02_DOWHILE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota = 0, soma = 0, med = 0;
        int i = 1;

        System.out.println("Qual o nome do " + i + "º aluno? ");
        String nome = sc.nextLine();
        do {
            System.out.println("digite a " + i + "ª nota do " + nome);
            nota = sc.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("Nota de aluno inválida, tente novamente");

                i -= 1;
            }
            i += 1;
            soma += nota;
        } while (i != 5);
        med = soma / 5;
        System.out.println("A media das notas do/a " + nome + " é: " + med);
    }

}
