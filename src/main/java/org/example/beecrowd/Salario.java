package org.example.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int numeroFuncionario = scan.nextInt();
        int horasTrabalhadas = scan.nextInt();
        double valorPorHora = scan.nextDouble();
        double salario = horasTrabalhadas * valorPorHora;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);
    }
}
