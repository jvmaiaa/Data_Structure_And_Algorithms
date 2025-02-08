package org.example.lambdas.m3.ex013;

import java.util.Arrays;
import java.util.List;

public class SomaDosQuadradosDosPares {
    public static void main(String[] args) {
        // Dada a lista de números inteiros abaixo, calcule a soma dos quadrados dos números pares.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        // código da filtragem e agrupamento dos dados

        numeros.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce((x, y) -> x + y )// retorna Optional
                .ifPresent(System.out::println);


    }
}
