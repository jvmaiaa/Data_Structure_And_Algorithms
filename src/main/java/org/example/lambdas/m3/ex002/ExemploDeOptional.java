package org.example.lambdas.m3.ex002;

import java.util.Optional;

public class ExemploDeOptional {
    public static void main(String[] args) {
        Optional<String> opcional = Optional.ofNullable("MO");

        opcional.ifPresent(System.out::println);

    }
}
