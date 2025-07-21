/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

/**
 *
 * @author ACER
 */
import java.util.LinkedList;
import java.util.Queue;

public class queue_library {
    public static void main(String[] args) {
        // Membuat queue dengan LinkedList
        Queue<String> antrian = new LinkedList<>();

        // Menambahkan elemen ke antrian (enqueue)
        antrian.add("Axan");
        antrian.add("Aland");
        antrian.add("Xeline");

        // Menampilkan isi antrian
        System.out.println("Isi antrian: " + antrian);

        // Melihat elemen pertama tanpa menghapusnya
        System.out.println("Elemen terdepan (peek): " + antrian.peek());

        // Menghapus elemen pertama (dequeue)
        String keluar = antrian.poll();
        System.out.println(keluar + " telah keluar dari antrian.");

        // Menampilkan isi antrian setelah dequeue
        System.out.println("Isi antrian sekarang: " + antrian);

        // Cek apakah antrian kosong
        if (antrian.isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Masih ada antrian.");
        }
    }
}

