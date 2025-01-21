package org.example.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class GastoDeCombustivel {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int tempoGastoEmHora = scan.nextInt();
        double velocidadeMedia = scan.nextDouble();

        double distanciaPercorrida = (tempoGastoEmHora * velocidadeMedia) / 12;
        System.out.println(String.format("%.3f", distanciaPercorrida));

        scan.close();
    }
}
