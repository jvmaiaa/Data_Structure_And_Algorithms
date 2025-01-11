package org.example.lambdas.m2.ex003;

public class StringToUpperCase {

    public static void main(String[] args) {

//      Crie uma função lambda que receba uma string e a converta para letras maiúsculas.
        ConverteString converte = (String::toUpperCase);
        System.out.println(converte.converte("teste de string"));
    }
}
