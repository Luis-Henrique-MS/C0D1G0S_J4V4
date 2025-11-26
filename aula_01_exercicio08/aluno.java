package aula_01_exercicio08;

public class aluno {

    String nome;
    int matricula;
    double[] notas;

    double calcularMedia() {
        if (notas.length == 0) {
            return 0.0;
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
    return soma / notas.length;
    }
}