package org.example.lambdas.m3.ex008;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PessoasDeMaiorEmOrdemAlfabetica {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        // Dado um objeto Pessoa com os campos nome e idade, filtre as pessoas com mais de 18 anos,
        // extraia os nomes e imprima-os em ordem alfabética. A classe Pessoa está definida abaixo.
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Alice", 22),
                new Pessoa("Bob", 17),
                new Pessoa("Charlie", 19)
        );

        pessoas.stream()
                .filter(p -> p.getIdade() > 18) // filtro por maioridade
                .map(p -> p.getNome()) // extraio apenas os nomes
                .sorted() // ordeno em ordem Alfabética
                .forEach(System.out::println); // exibo os valores


        scan.close();
    }
}
