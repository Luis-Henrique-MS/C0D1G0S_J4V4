
package aula_01_exercicio10;
public class main {
    public static void main(String[] args) {
        
        ponto ponto1 = new ponto();
        ponto1.x = 1;
        ponto1.y = 3;
        
        ponto ponto2 = new ponto();
        ponto2.x = 4;
        ponto2.y = 6;
        
        double distancia = ponto1.calcularDistancia(ponto2);
        System.out.println("A distância entre os pontos é: "+distancia);
    }
}
