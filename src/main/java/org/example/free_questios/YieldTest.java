package org.example.free_questios;

import java.util.Locale;
import java.util.Scanner;

public class YieldTest {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        String greeting = scan.nextLine();
        int value = switch (greeting) {
            case "hi":
                System.out.println("I am not just yielding!");
                yield 1;
            case "hello":
                System.out.println("Me too.");
                yield 2;
            default:
                System.out.println("OK");
                yield -1;
        };

        System.out.println(value);

        scan.close();
    }
}
