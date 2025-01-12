package org.example.lambdas.m2.ex005;


import java.util.Arrays;
import java.util.List;

public class MultiplicaNumerosPorTres {

    public static void main(String[] args) {
//        Implemente uma expressão lambda que recebe uma lista de inteiros e retorna uma nova lista
//        onde cada número foi multiplicado por 3. Dica: a função replaceAll, das Collections,
//        recebe uma interface funcional como parâmetro, assim como vimos na função forEach
        List<Integer> lista = Arrays.asList(1, 3, 4, 5);
        lista.replaceAll(n -> n * 3);
        System.out.println(lista);
    }
}
