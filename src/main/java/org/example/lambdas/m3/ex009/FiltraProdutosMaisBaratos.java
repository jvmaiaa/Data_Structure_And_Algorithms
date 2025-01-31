package org.example.lambdas.m3.ex009;

import java.util.*;
import java.util.stream.Collectors;

public class FiltraProdutosMaisBaratos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<Produto> produtos = Arrays.asList(
                new Produto("Smartphone", 800.0, "Eletrônicos"),
                new Produto("Notebook", 1500.0, "Eletrônicos"),
                new Produto("Teclado", 200.0, "Eletrônicos"),
                new Produto("Cadeira", 300.0, "Móveis"),
                new Produto("Monitor", 900.0, "Eletrônicos"),
                new Produto("Mesa", 700.0, "Móveis")
        );

        produtos.stream()
                        .filter(p -> p.getCategoria().equals("Eletrônicos"))
                        .filter(p -> p.getPreco() < 1000)
                        .sorted((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco()))
                        .limit(3)
                        .forEach(System.out::println);

        scan.close();
    }
}
