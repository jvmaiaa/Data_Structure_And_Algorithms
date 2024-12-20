package org.example.free_questios;

public class TranformaVetorEmMatriz {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6};
        int n = 2;  // 2 linhas
        int m = 3;  // 3 colunas
        int[][] matriz = preencheMatriz(vetor, n, m);

        // Imprime a matriz preenchida
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Pula para a próxima linha
        }
    }

    public static int[][] preencheMatriz(int[] vetor, int n, int m){
        int[][] matriz = new int[n][m]; // 1
        int indice = 0; // 1
        for (int i = 0; i < n; i++) { // n + 1
            for (int j = 0; j < m; j++) { // n * m + 1
                matriz[i][j] = vetor[indice]; // n * m
                indice++; // n * m
            }
        }
        return matriz; // 1
    }

    // G(n) = 1 + 1 + n + 1 + n * m + 1 + n * m + n * m + 1
    // G(n) = 3(n, m) + n  + 5
    // O(n) * O(m)
}
