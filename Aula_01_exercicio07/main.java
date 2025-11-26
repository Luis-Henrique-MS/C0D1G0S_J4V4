
package Aula_01_exercicio07;
public class main {
    public static void main(String[] args) {
        
        livro livro1 = new livro();
        livro1.titulo = "Dom Quixote";
        livro1.autor = "Miguel de Cervantes";
        livro1.anoPublicacao = 1605;
        livro1.disponivel = true;
        
        livro1.emprestar();
        livro1.devolver();
        
    }
}
