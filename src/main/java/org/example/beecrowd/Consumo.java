package org.example.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Consumo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        int km = scan.nextInt();
        double litros = scan.nextDouble();
        System.out.println(String.format("%.3f km/l", (km / litros)));
        scan.close();
    }
}
