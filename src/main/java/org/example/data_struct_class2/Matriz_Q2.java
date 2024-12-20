package org.example.data_struct_class2;

public class Matriz_Q2 {
    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] novaMatriz = calculaMatriz(matriz);

        for (int i = 0; i < novaMatriz.length; i++){

            for (int j = 0; j < novaMatriz[i].length; j++){
                System.out.print(novaMatriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] calculaMatriz(int[][] matriz){
        int[][] novaMatriz = new int[3][3]; // 1
        for (int i = 0; i < matriz.length; i++){ // n
            for (int j = 0; j < matriz[i].length; j++){ // n^2 + 1
                novaMatriz[j][i] = matriz[i][j]; // n^2
            }
        }
        return novaMatriz; // n
    }

    // g(n) = 1 + n + n^2 + 1 + n^2
    // g(n) = 2n^2 + 2n + 2

    // O(n^2)
}
