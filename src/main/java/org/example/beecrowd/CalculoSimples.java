package org.example.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double valorTotal = 0;
        int codigoDaPeca = 0;
        int numeroDePecas = 0;
        double valorUnitarioDaPeca = 0.0;
        for (int i = 0; i < 2; i++) {
            codigoDaPeca = scan.nextInt();
            numeroDePecas = scan.nextInt();
            valorUnitarioDaPeca = scan.nextDouble();
            valorTotal += numeroDePecas * valorUnitarioDaPeca;
        }
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);


    }
}
