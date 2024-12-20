package org.example.free_questios;

public class TransformaMatrizEmVetor {

    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int n = 3; // número de linhas
        int m = 3; // número de colunas

        // Converte a matriz em um vetor
        int[] vetor = vetorEmMatriz(matriz, n, m);

        // Imprime o vetor resultante
        System.out.println("Vetor resultante:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    public static int[] vetorEmMatriz(int[][] matriz, int n, int m){
        int indice = 0; // 1
        int[] vetor = new int[n * m]; // 1
        for (int i = 0; i < n; i++) { // n + 1
            for (int j = 0; j < m; j++) { // n * m + 1
                vetor[indice] = matriz[i][j]; // n * m
                indice++; // n * m
            }
        }
        return vetor; // 1
    }

    // G(n) = 1 + 1 + n + 1 + n * m + 1 + n * m + n * m + 1
    // G(n) = 3(n, m) + n + 5
    // O(n) * O(m)
}
