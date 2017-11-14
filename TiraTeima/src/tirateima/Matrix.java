/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tirateima;

/**
 *
 * @author Tuanny
 */
public class Matrix {

    public int diffDiagonal(int[][] mtrx, int n) {
        // declaração de variáveis:
        int resultado = 0;
        int diagonal1 = 0;
        int diagonal2 = 0;

        // instanciação:
        mtrx = new int[n][n];

        System.out.println("Matrix: ");

        // atribuição:
        for (int l = 0; l < n; l++) {
            for (int c = 0; c < n; c++) {
                // hack para converter a int:
                int random = (int) (Math.random() * 100);
                while (random >= -100 && random <= 100) {
                    mtrx[l][c] = random;
                    System.out.print("[" + mtrx[l][c] + "]");
                    break;
                }
            }
            System.out.println("");
        }

        for (int l = 0; l < n; l++) {
            for (int c = 0; c < n; c++) {
                for (int i = 0; i < n; i++) {
                    if (i == l && i == c) {
                        diagonal1 += mtrx[l][c];
                    }
                }
            }
        }

        for (int l = 0; l < n; l++) {
            for (int c = (n - 1); c >= 0; c--) {
                for (int i = (n - 1); i >= 0; i--) {
                    if (c - 1 == i && l != i + 1) {
                        // Não consegui fazer o invertido e também não quis pesquisar no google;
                        //System.out.print(" " + mtrx[l][c]);
                        // diagonal2 += mtrx[l][c];
                    }
                }
            }
        }

        resultado = diagonal1 - diagonal2;
        System.out.println("Diagonal 1: " + diagonal1);
        System.out.println("Diagonal 2: " + diagonal2);
        return resultado;
    }
}
