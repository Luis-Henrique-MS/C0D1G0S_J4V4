package Aula_08;

import java.util.ArrayList;

public class arraylist {

    public static void main(String[] args) {

        //criar arraylist
        ArrayList<String> listaDeNomes = new ArrayList<>();

        //Adicionar elemnts nele
        listaDeNomes.add("Luis");
        listaDeNomes.add("Felipe");
        listaDeNomes.add("ryan");

        String primeiroNome = listaDeNomes.get(0);
        
        //remover element
        listaDeNomes.remove("Felipe");
        
        //Imprimir os elements da lista
        for (String nome : listaDeNomes) {
            System.out.println(nome);

        }
    }
}
