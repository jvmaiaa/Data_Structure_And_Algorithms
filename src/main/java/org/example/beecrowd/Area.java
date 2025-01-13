package org.example.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        final double PI = 3.14159;

        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double C = scan.nextDouble();

        double area = 0.0;
        System.out.println(String.format("TRIANGULO: %.3f", (area = A * C) / 2));
        System.out.println(String.format("CIRCULO: %.3f", (area = PI * Math.pow(C, 2))));
        System.out.println(String.format("TRAPEZIO: %.3f", ((area = A + B) * C) / 2));
        System.out.println(String.format("QUADRADO: %.3f", (area = B * B)));
        System.out.println(String.format("RETANGULO: %.3f", (area = A * B)));

    }
}
