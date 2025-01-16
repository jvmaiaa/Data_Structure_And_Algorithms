package org.example.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class O_Maior {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int valorAbsoluto = a - b;
        if (valorAbsoluto < 0) { // verifico se é negativo ou igual a zero
            valorAbsoluto = valorAbsoluto * (-1); // transforma ele em positivo
        }
        int maiorValorAB = (a + b + valorAbsoluto) / 2;
        int maiorValor = (maiorValorAB > c) ? maiorValorAB : c;

        System.out.println(maiorValor + " eh o maior");

        scan.close();
    }
}
