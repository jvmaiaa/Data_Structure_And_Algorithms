package org.example.lambdas.m2.ex002;

import java.util.Enumeration;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.IntPredicate;

public class VerificaPrimo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

//        Implemente uma expressão lambda que verifique se um número é primo.
        IntPredicate ePrimo = (p) -> {
            if (p <= 1) return false;
            if (p == 2) return true;
            if (p % 2 == 0) return false;
            for (int i = 3; i <= Math.sqrt(p); i += 2){
                if (p % i == 0) return false;
            }
            return true;
        };
        System.out.println(ePrimo.test(26));

        scan.close();
    }
}
