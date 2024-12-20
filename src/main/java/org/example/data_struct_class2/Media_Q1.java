package org.example.data_struct_class2;

public class Media_Q1 {

    public static void main(String[] args) {

        int[] vetor = {5, 10, 20};
        System.out.println(mediaDoVetor(vetor, vetor.length));

    }

    static int mediaDoVetor(int[] vetor, int tamanho){
        int soma = 0; // 1
        for (int i = 0; i < vetor.length; i++){ // n + 1
            soma += vetor[i]; // n
        }
        int media = soma / tamanho; // 1
        return media; // 1
    }


    // g(n) = 1 + n + 1 + n + 1 + 1
    // g(n) = 2n + 4

    // O(n)
}
