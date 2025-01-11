package org.example.lambdas.m2.ex004;

public class VerificaPalindromo {

    public static void main(String[] args) {

        InterfacePalindromo minhaFrase = (s -> s.equals(new StringBuilder(s).reverse().toString()));
        System.out.println(minhaFrase.verifica("java"));
        System.out.println(minhaFrase.verifica("radar"));
    }
}
