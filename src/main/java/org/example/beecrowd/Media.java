package org.example.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();

        double media = ((a * 3.50) + (b * 7.50)) / 11.00;
        System.out.printf("MEDIA = %.5f", media);

    }
}
