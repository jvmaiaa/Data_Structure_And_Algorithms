package org.example.data_struct_class2;

import java.util.Arrays;

public class MatrizQuadrada {

    public static void main(String[] args) {

        int[][] matriz = {
                {1, 4, 3},
                {4, 4, 6},
                {7, 4, 9}
        };
        int[][] novaMatriz = retornaMatrizQuadrada(matriz, 3, 3, 4);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3 ; j++) {
                System.out.print(novaMatriz[i][j] + "  ");
            }
            System.out.println();
        }

    }

    public static int[][] retornaMatrizQuadrada(int[][] matriz, int linhas, int colunas, int valorChave){
        int[][] novaMatriz = new int[linhas][colunas]; // 1 .
        for (int i = 0; i < linhas; i++) { // n + 1 .
            for (int j = 0; j < colunas; j++) { // n^2 + 1 .
                if (matriz[i][j] < valorChave){ // n^2.
                    novaMatriz[i][j] = -1; // n^2 .
                }
                else if(matriz[i][j] > valorChave){ // n^2
                    novaMatriz[i][j] = 1; // n^2
                }
                else{
                    novaMatriz[i][j] = 0; // n^2
                }
            }
        }

        return novaMatriz; // 1
    }
    // TODO: OBS: pegar apenas o tempo do maior if para calcular o tempo total.
    //G(n) = 1 + n + 1 + n^2 + 1 + n^2 + 1 + n^2 + 1
    //G(n) = 3n^2 + n + 5

    // O(n) = O(n^2)

    // o programa demora em média 10^10 - 10^7 = 1000 segundos para ser executado.
}
