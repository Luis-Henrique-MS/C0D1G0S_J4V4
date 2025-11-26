package aula_01_exercicio08;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        aluno aluno1 = new aluno();
        //aluno1.nome = "Perigo";
        // aluno1.matricula = 12345;
        //  aluno1.notas = new double[]{7.5, 8.0, 6.0, 9.5};

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        aluno1.nome = sc.nextLine();

        System.out.println("Digite a matricula do aluno:");
        aluno1.matricula = sc.nextInt();
        
        System.out.println("Digite a quantidade de notas do "+aluno1.nome+":");
        int quantidadeDeNotas = sc.nextInt();
        aluno1.notas =new double[quantidadeDeNotas];
        
        for (int i = 0; i < quantidadeDeNotas; i++) {
        System.out.println("Digite a nota "+(i+1)+":");            
        aluno1.notas[i] = sc.nextDouble();
        }

        double media = aluno1.calcularMedia();
        System.out.println("Média do aluno " + aluno1.nome + ": " + media);

    }

}
