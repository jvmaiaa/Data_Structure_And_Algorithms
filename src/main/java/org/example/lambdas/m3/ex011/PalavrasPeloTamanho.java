package org.example.lambdas.m3.ex011;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PalavrasPeloTamanho {

    public static void main(String[] args) {

        // Dada a lista de palavras (strings) abaixo, agrupe-as pelo seu tamanho.
        // No código a seguir, há um exemplo prático do resultado esperado.
        List<String> palavras = Arrays.asList("java", "stream", "lambda", "code");

        // código do agrupamento
        Map<Integer, List<String>> agrupamento = palavras.stream()
                .collect(Collectors.groupingBy(String::length));

        // Resultado Esperado: {4=[java, code], 6=[stream, lambda]}
        System.out.println(agrupamento);
    }
}
