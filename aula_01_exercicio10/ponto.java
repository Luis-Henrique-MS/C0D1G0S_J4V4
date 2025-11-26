
package aula_01_exercicio10;
public class ponto {
       
        int x,y;
        
        double calcularDistancia(ponto outroPonto){
            int deltaX = x - outroPonto.x;
            int deltaY = y - outroPonto.y;
            return Math.sqrt(deltaX * deltaY + deltaY * deltaY);
        } 
    }

