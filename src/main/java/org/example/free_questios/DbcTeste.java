package org.example.free_questios;

import java.util.Locale;
import java.util.Scanner;

public class DbcTeste {

    public static void main(String[] args) {
        // transformar em números pois é recebido em String
        // remover espaços
        // n usar caracteres especiais
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double valor = scan.nextDouble();
        scan.nextLine();
        System.out.println(valor);
    }
}
