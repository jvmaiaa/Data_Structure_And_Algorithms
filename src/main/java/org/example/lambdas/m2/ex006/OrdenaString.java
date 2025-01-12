package org.example.lambdas.m2.ex006;

import java.util.Arrays;
import java.util.List;

public class OrdenaString {
    public static void main(String[] args) {
//        Crie uma expressão lambda que ordene uma lista de strings em ordem alfabética.
//        Dica: a função sort, das Collections, recebe uma interface funcional como parâmetro, assim como
//        vimos na função forEach.
        List<String> nomes = Arrays.asList("Joao", "Walter", "Ingrid", "Jose", "Ana");
        nomes.sort((a, b) -> a.compareTo(b));
        System.out.println(nomes);
    }
}
