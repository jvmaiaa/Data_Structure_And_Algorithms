package org.example.lambdas.m3.ex007;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class ExtrairValoresDeSublista {
    public static void main(String[] args) {
        // Dada a lista de sublistas de números inteiros abaixo, extraia todos
        // os números primos em uma única lista e os ordene em ordem crescente.
        List<List<Integer>> listaDeNumeros = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(5, 6, 7, 8),
                Arrays.asList(9, 10, 11, 12)
        );

        List<Integer> primosOrdenados = listaDeNumeros.stream()
                .flatMap(lista -> lista.stream()) // Estou transfomrando a lista em um fluxo único
                .filter(numero -> ePrimo(numero)) // filtro pelos números primos
                .sorted() // ordeno de forma crescente
                .collect(Collectors.toList());

        primosOrdenados.forEach(System.out::println);
    }

    private static boolean ePrimo(int numero) {
        if (numero < 2){
            return false;
        }
        for (int i = 2; i < Math.sqrt(numero); i++){
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
