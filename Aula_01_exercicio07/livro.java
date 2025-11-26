package Aula_01_exercicio07;

public class livro {

    String titulo, autor;
    int anoPublicacao;
    boolean disponivel = true;

    void emprestar (){
        if (disponivel){
            disponivel = false;
            System.out.println("Livro "+titulo+" emprestado com sucesso");
        }else{
            System.out.println("Livro "+titulo+" não está disponivel para emprestimo");
        }
    }
    
    void devolver (){
        if(!disponivel){
            disponivel = true;
            System.out.println("Livro "+titulo+" devolvido com sucesso");
        }else{
            System.out.println("Livro "+titulo+" já está disponível");
        }
    }
    
}

