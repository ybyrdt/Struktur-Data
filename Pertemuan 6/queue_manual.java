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
import java.util.Scanner;

public class queue_manual {
    private int maxSize;
    private String[] queue;
    private int front, rear, jumlah;

    public queue_manual(int size) {
        maxSize = size;
        queue = new String[maxSize];
        front = 0;
        rear = -1;
        jumlah = 0;
    }

    public void tambahAntrian(String nama) {
        if (isFull()) {
            System.out.println("Antrian penuh. " + nama + " tidak bisa masuk antrian.");
            return;
        }

        if (rear == maxSize - 1) {
            rear = -1;
        }

        queue[++rear] = nama;
        jumlah++;
        System.out.println(nama + " masuk antrian peminjaman buku.");
    }

    public String layaniPeminjam() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }

        String nama = queue[front++];
        if (front == maxSize) {
            front = 0;
        }

        jumlah--;
        return nama;
    }

    public void tampilkanAntrian() {
        if (isEmpty()) {
            System.out.println("Tidak ada yang mengantri.");
        } else {
            System.out.print("Antrian saat ini: ");
            int index = front;
            for (int i = 0; i < jumlah; i++) {
                System.out.print(queue[index] + " ");
                index = (index + 1) % maxSize;
            }
            System.out.println();
        }
    }

    public boolean isEmpty() {
        return jumlah == 0;
    }

    public boolean isFull() {
        return jumlah == maxSize;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        queue_manual antrian = new queue_manual(5);

        int pilihan;

        do {
            System.out.println("\n=== ANTRIAN PERPUSTAKAAN ===");
            System.out.println("1. Tambah Peminjam");
            System.out.println("2. Layani Peminjam");
            System.out.println("3. Lihat Antrian");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine(); // buang newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama peminjam: ");
                    String nama = input.nextLine();
                    antrian.tambahAntrian(nama);
                    break;
                case 2:
                    String dilayani = antrian.layaniPeminjam();
                    if (dilayani != null) {
                        System.out.println(dilayani + " sedang dilayani untuk peminjaman buku.");
                    }
                    break;
                case 3:
                    antrian.tampilkanAntrian();
                    break;
                case 4:
                    System.out.println("Terima kasih sudah menggunakan sistem antrian 😘📚");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilihan != 4);

        input.close();
    }
}

