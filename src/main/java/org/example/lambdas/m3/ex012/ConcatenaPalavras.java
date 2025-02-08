package org.example.lambdas.m3.ex012;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenaPalavras {
    public static void main(String[] args) {
        // Dada a lista de nomes abaixo, concatene-os separados por vírgula.
        // No código a seguir, há um exemplo prático do resultado esperado.
        List<String> nomes = Arrays.asList("Alice", "Bob", "Charlie");
        // código do agrupamento de dados
        String concatenacao = nomes.stream()
                .collect(Collectors.joining(", "));
        // Resultado Esperado: "Alice, Bob, Charlie"
        System.out.println(concatenacao);
    }
}
