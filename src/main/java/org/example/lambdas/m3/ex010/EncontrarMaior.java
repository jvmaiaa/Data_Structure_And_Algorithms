package org.example.lambdas.m3.ex010;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class EncontrarMaior {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);

        // código do agrupamento
        IntSummaryStatistics maior = numeros.stream()
                .filter(n -> n > 0)
                .collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println("Maior valor: " + maior.getMax());

    }
}
