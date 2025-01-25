package org.example.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int valor = scan.nextInt();
        int anos;
        int mes;
        int dias;
        anos = valor / 365;
        mes = (valor % 365) / 30;
        dias = (valor % 365) % 30;
        System.out.println(anos + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dias + " dia(s)");
        scan.close();
    }
}
