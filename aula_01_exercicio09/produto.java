
package aula_01_exercicio09;
public class produto {
    
    String nome;
    double preco;
    int quantidadeEmEstoque;
    
    void vender(int quantidade){
        if (quantidade <= quantidadeEmEstoque) {
            quantidadeEmEstoque -= quantidade;
            System.out.println("Venda de "+quantidade+" unidades de "+nome+" realizada com sucesso");
        }else{
            System.out.println("Estoque insuficiente para a venda");
        }
    }
    
    void reporEstoque(int quantidade){
        quantidadeEmEstoque += quantidade;
        System.out.println("Estoque de "+nome+" reposto com "+quantidade+" unidades");
    }
}
