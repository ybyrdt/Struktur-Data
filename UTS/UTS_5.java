/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

/**
 *
 * @author radit
 */
public class UTS_5 
{
    public boolean isIdentitas(int[][] matriks) {
        int n = matriks.length;
        for (int i = 0; i < n; i++) {
            if (matriks[i].length != n) {
                return false;
            }
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    if (matriks[i][j] != 1) return false;
                } else {
                    if (matriks[i][j] != 0) return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        UTS_5 function = new UTS_5();
        int[][] matriks = {
            {1, 0, 0},
            {0, 1, 1},
            {0, 0, 1}
        };

        if (function.isIdentitas(matriks)) {
            System.out.println("Matriks ini adalah matriks identitas.");
        } else {
            System.out.println("Matriks ini bukanlah matriks identitas.");
        }
    }
}
