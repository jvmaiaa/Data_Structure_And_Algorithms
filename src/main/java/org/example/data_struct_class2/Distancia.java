package org.example.data_struct_class2;

import java.util.Locale;
import java.util.Scanner;

public class Distancia {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int distancia = scan.nextInt();
        int tempo = distancia * 2;
        System.out.println(tempo + " minutos");

        scan.close();
    }
}
