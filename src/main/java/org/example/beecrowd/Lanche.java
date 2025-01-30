package org.example.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double[] precos = {0, 4.00, 4.50, 5.00, 2.00, 1.50};

        int codigo = scan.nextInt();
        int quantidade = scan.nextInt();

        double total = precos[codigo] * quantidade;

        System.out.println(String.format("Total: R$ %.2f%n", total));
    }
}
