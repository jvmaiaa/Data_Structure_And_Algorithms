package org.example.free_questios;

public class SomaMatriz {
    public static void main(String[] args) {
//        Uma função recebe duas matrizes X e Y. As duas matriz têm uma
//        quantidade l de linhas e c de colunas. Uma terceira matriz Z, também de
//        tamanho Z[l][c], é criada com a soma dos valores dos índices
//        equivalentes de X e Y (Z[1][1]=X[1][1]+y[1][1], e assim por diante). Crie
//        esta função, depois calcule a complexidade da função e a notação big O.
//        Por fim, considere que as matrizes X tem 102 linhas e 103 colunas, e que
//        a máquina executa 107 operações por segundo, então diga quanto tempo
//        a máquina levaria para processar toda a entrada com o algoritmo criado
        int[][] matrizX = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrizY = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };
        int[][] resultado = somaMatrizes(matrizX, matrizY, 3, 3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println(); // Pula para a próxima linha
        }
    }

    public static int[][] somaMatrizes(int[][] matrizX, int[][] matrizY, int linha, int coluna) {
        int[][] matrizZ = new int[linha][coluna]; // 1

        for (int i = 0; i < linha; i++) { // n + 1
            for (int j = 0; j < coluna; j++) { // n^2 + 1
                matrizZ[i][j] = matrizX[i][j] + matrizY[i][j];  // Soma os valores equivalentes -> n^2
            }
        }
        return matrizZ; // 1
    }
}
