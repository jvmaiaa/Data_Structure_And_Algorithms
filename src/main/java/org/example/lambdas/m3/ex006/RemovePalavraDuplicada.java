package org.example.lambdas.m3.ex006;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemovePalavraDuplicada {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        List<String> palavrasUnicas = palavras.stream()
                .distinct()
                .collect(Collectors.toList());
        palavrasUnicas.forEach(System.out::println);

        // ou dessa forma:
        //
        // Set<String> palavrasUnicas = palavras.stream()
        //                .collect(Collectors.toSet());
    }
}
