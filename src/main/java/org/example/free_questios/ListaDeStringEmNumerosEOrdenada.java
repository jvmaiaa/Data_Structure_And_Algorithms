package org.example.free_questios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Stream;

public class ListaDeStringEmNumerosEOrdenada {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        String listaEmString = "89354";
        String[] listaSplitada = listaEmString.split("");

        List<Integer> listaDeInteiros = new ArrayList<>();
        Stream.of(listaSplitada).forEach((item) -> listaDeInteiros.add(Integer.valueOf(item)));

        listaDeInteiros.stream().sorted().forEach(System.out::println);

        scan.close();
    }
}
