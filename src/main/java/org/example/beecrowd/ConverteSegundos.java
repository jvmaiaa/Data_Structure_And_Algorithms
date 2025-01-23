package org.example.beecrowd;

import java.util.Scanner;

public class ConverteSegundos {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int segundos = scan.nextInt();

        int toHoras = segundos / 3600;
        int toMinutos = (segundos % 3600) / 60;
        int toSegundos = segundos % 60;

        System.out.printf("%d:%d:%d%n", toHoras, toMinutos, toSegundos);

        scan.close();
    }
}
