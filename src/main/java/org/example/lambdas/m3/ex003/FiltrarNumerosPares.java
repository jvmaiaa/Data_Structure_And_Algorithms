package org.example.lambdas.m3.ex003;

import java.util.Arrays;
import java.util.List;

public class FiltrarNumerosPares {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        numeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
