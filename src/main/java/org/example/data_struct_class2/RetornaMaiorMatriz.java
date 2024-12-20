package org.example.data_struct_class2;

public class RetornaMaiorMatriz {

    public static int[][] somaValorDeMatrizes(int[][] matriz1, int[][] matriz2) {
        int somaPrimeiraMatriz = 0; // 1
        int somaSegundaMatriz = 0; // 1
        int tamanhoMatriz = matriz1.length; // n
        for (int i = 0; i < tamanhoMatriz; i++) { // n + 1
            for (int j = 0; j < tamanhoMatriz; j++) { // n ^ 2 + 1
                somaPrimeiraMatriz += matriz1[i][j]; // n ^ 2
            }
        }
        for (int i = 0; i < tamanhoMatriz; i++) { // n + 1
            for (int j = 0; j < tamanhoMatriz; j++) { // n ^ 2 + 1
                somaSegundaMatriz += matriz2[i][j]; // n ^ 2
            }
        }
        if (somaPrimeiraMatriz > somaSegundaMatriz) { // 1
            return matriz1; // 1
        }
        else {
            return matriz2; // 1
        }
    }
    // G(n) = 8 + 3n + 4n^2
    // G(n) = 4n^2

    // O(n) = n^2
    // 0,1 segundos
}
