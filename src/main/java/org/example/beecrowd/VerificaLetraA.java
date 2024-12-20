package org.example.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class VerificaLetraA {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma palavra:");
        String palavra = scan.nextLine();
        int quantidadeDeLetraA = 0;

        for (int i = 0; i < palavra.length(); i++){
            if (palavra.toLowerCase().charAt(i) == 'a'){
                quantidadeDeLetraA++;
            }
        }
        System.out.printf("A palavra tem %d letras A" , quantidadeDeLetraA);
    }
}
