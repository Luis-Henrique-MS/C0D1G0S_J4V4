package Aula_05;

/*
Exercício 1: Cálculo da média de idade de uma turma
Desenvolver um algoritmo que calcula a média de idade dos alunos de uma turma. O usuário deve informar a idade de cada aluno e digitar um valor negativo para indicar o fim da entrada de dados. ## dica: pode ser usado While e if-else ##
 */
import java.util.Scanner;

public class EXE_01_A5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        int somaIdades = 0;
        int quantAlunos = 0;

        System.out.println("Digite a idade dos alunos. numero negativo para cancelar as operações");

        while (true) {
            System.out.print("Informe a idade do aluno: ");
           int idade = scanner.nextInt();

            if (idade < 0) {
                break; 
            } else {
                somaIdades += idade;
                quantAlunos++;
            }
        }

        if (quantAlunos > 0) {
            double media = (double) somaIdades / quantAlunos;
            System.out.printf("A média de idade da turma é: %.2f anos.%n", media);
        } else {
            System.out.println("Nenhuma idade válida foi informada.");
        }

        scanner.close();
    }
}
    
    
    
    
    
    

