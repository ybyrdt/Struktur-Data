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
public class UTS_1 
{
    public static void main(String[] args) {
        int[] angka = {1, 2, 3, 4, 5};

        // Menampilkan elemen-elemen array
        System.out.print("Isi data array: [");
        for (int index = 0; index < angka.length; index++) {
            System.out.print(angka[index]);
            if (index != angka.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println("]");

        // Menampilkan array dalam urutan terbalik
        System.out.print("Hasil dibalik: [");
        for (int i = angka.length - 1; i >= 0; i--) {
            System.out.print(angka[i]);
            if (i != 0) {
                System.out.print(" , ");
            }
        }
        System.out.println("]");
    }
}    

