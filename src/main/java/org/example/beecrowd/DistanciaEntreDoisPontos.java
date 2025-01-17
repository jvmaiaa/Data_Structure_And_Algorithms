package org.example.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class DistanciaEntreDoisPontos {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();

        double subtraiX = Math.pow((x2 - x1), 2);
        double subtraiY = Math.pow((y2 - y1), 2);

        double somaResultado = subtraiX + subtraiY;
        double raizDaSoma = Math.sqrt(somaResultado);
        System.out.println(String.format("%.4f", raizDaSoma));


        scan.close();
    }
}
