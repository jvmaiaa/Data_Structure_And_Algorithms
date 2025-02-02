package org.example.lambdas.m3.ex001;

import java.util.Arrays;
import java.util.List;

public class Teste {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        int soma = numeros.stream()
                .peek(n -> System.out.println("Elemento: " + n))
                .filter(n -> n % 2 == 1)
                .peek(n -> System.out.println("Conteúdo depois do filter: " + n))
                .map(n -> n * 2)
                .peek(n -> System.out.println("Conteúdo depois do map: " + n))
                .reduce(0, (total, numero) -> total + numero);

        System.out.println("A soma dos números é: " + soma);
    }
}
