package org.example.free_questios;

public class DiagonaInversaPositiva {

    public static void main(String[] args) {
        int[][] matriz = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        int[][] novaMatriz = DiagonalInversaPositiva(matriz, 3, 3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(novaMatriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] DiagonalInversaPositiva(int[][] matriz, int n, int m){
        for (int i = 0; i < n; i++) { // n + 1
            for (int j = 0; j < m ; j++) { // n * m + 1
                if (i + j == n - 1){ // n * m
                    matriz[j][i] = 1; // n * m
                }
                else { // n * m
                    matriz[j][i] = 0; // n * m
                }
            }
        }
        return matriz; // 1
    }

    // G(n) = n + 1 + n * m + 1 + n * m + n * m + n * m + n * m
    // G(n) = 5(n, m) + n + 3

    // O(n) = O(n) * O(m)
}
