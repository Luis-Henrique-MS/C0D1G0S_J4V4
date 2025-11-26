
package aula_01_exercicio09;
public class main {
    
    public static void main(String[] args) {
        
        produto produto1 = new produto();
        produto1.nome = "Camiseta";
        produto1.preco = 39.90;
        produto1.quantidadeEmEstoque = 50;
        produto1.vender(10);
    }
}
