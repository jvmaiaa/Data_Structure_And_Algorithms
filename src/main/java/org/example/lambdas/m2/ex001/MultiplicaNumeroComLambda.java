package org.example.lambdas.m2.ex001;

import java.util.Locale;
import java.util.Scanner;

public class MultiplicaNumeroComLambda {

    public static void main(String[] args) {
//        Crie uma expressão lambda que multiplique dois números inteiros.
//        A expressão deve ser implementada dentro de uma interface funcional
//        com o método multiplicacao(int a, int b)

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Multiplica multiplica = (a, b) -> a * b;
        System.out.println(multiplica.multiplicacao(5, 3));
    }
}
