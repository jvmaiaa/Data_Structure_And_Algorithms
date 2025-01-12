package org.example.lambdas.m2.ex007;

public class DivisaoDeNumeros {
    public static void main(String[] args) {

        try {
            Divisao divisao = (a, b) -> (a / b);
            System.out.println(divisao.divide(10, 2));
        }catch (ArithmeticException ex) {
            System.out.println("O número não pode ser divisível por 0.");
        }
    }
}
