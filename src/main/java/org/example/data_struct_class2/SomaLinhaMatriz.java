package org.example.data_struct_class2;

public class SomaLinhaMatriz {

    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] novaMatriz = retornaMatrizQuadrada(matriz, 3, 3, 4);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(novaMatriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] retornaMatrizQuadrada(int[][] matriz, int linhas, int colunas, int valorChave){
        int[][] novaMatriz = new int[linhas][colunas]; // 1 .
        int valorLinhaAtual = 0; // 1 .
        int valorMultiplicado = 0; // 1 .
        for (int i = 0; i < linhas; i++) { // n + 1 .
            for (int j = 0; j < colunas; j++) { // n^2 + 1 .
                if (matriz[i][j] < valorChave){ // n^2.
                    for (int k = 0; k < colunas; k++) { // n^3 + 1 .
                        valorLinhaAtual += matriz[i][k]; // n^3 .
                    }
                    novaMatriz[i][j] = valorLinhaAtual; // n^2 .
                    valorLinhaAtual = 0; // n^2 .
                }
                else if(matriz[i][j] == valorChave){ // n^2
                    novaMatriz[i][j] = matriz[i][j] * matriz[i][j]; // n^2
                }
                else{
                    novaMatriz[i][j] = multiplica(matriz[i][j], valorChave); // n * log(n)
                }
            }
        }

        return novaMatriz; // 1
    }

    private static int multiplica(int celular, int valorChave){
        return celular * valorChave;
    }

    // G(n) = 1 + 1 + 1 + n + 1 + n^2 + 1 + n^2 + 1 + n^3 + 1 + n^3 + n^2 + n^2 + 1
    // G(n) = 2n^3 + 4n^2 + 8

    // O(n) = O(n^3)
}
