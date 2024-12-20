package org.example.free_questios;

public class FatorialRecursivo {

    public static void main(String[] args) {
        System.out.println(fatorial(10));
    }

    static int fatorial(int numero){
        if (numero <= 1){
            return 1;
        }
        return numero * fatorial(numero - 1);
    }
}
