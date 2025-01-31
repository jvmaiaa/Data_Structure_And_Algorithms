package org.example.lambdas.m3.ex006;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemovePalavraDuplicada {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        Set<String> palavrasUnicas = new HashSet<>();

        palavras.stream()
                .filter(p -> palavrasUnicas.add(p))
                .forEach(System.out::println);
    }
}
