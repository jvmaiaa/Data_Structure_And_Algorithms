package org.example.lambdas.m3.ex005;

import java.util.Arrays;
import java.util.List;

public class FiltraImparesMultiplicaPorDois {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> novosNumeros = numeros.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * 2)
                .toList();

        novosNumeros.forEach(System.out::println);
    }
}
