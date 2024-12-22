package org.example.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class SalarioComBonus {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        String nome = scan.nextLine();
        double salarioFixo = scan.nextDouble();

        double totalDeVendas = scan.nextDouble();

        salarioFixo += totalDeVendas * 0.15;
        System.out.printf("TOTAL = R$ %.2f" , salarioFixo);
        System.out.println();

    }
}
